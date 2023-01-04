package com.driver.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class MovieRepository {
	
	private Map<String,Movie> movies;
	
	private Map<String,Director> director;
	
	private Map<String,List<String>> directormoviemapping;
	
	

	


	public MovieRepository() {
		
		this.movies =new HashMap<String,Movie>();
		
		this.director=new HashMap<String,Director>();
		
		this.directormoviemapping=new HashMap<String,List<String>>();
	}
	public void addmovie(Movie movie) {
		// TODO Auto-generated method stub
		movies.put(movie.getName(),movie);		
	}
	public void adddirector(Director director2) {
		// TODO Auto-generated method stub
		director.put(director2.getName(), director2);
		
	}
	
	public void addmoviedirecterpair(String movie, String director2) {
		// TODO Auto-generated method stub
		if(movies.containsKey(movie)&& director.containsKey(director2)){

            List<String> currentMoviesByDirector = new ArrayList<>();

            if(directormoviemapping.containsKey(director2))
            currentMoviesByDirector = directormoviemapping.get(director2);

            currentMoviesByDirector.add(movie);

            directormoviemapping.put(director2,currentMoviesByDirector);

        }
		
	}
	public Movie getMovieByName(String movie) {
		// TODO Auto-generated method stub
		return movies.get(movie);
	}
	public Director getDirectorByName(String director2) {
		// TODO Auto-generated method stub
		return director.get(director2);
	}
	public List<String> getMoviesByDirectorName(String director2) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		if(directormoviemapping.containsKey(director2))
		{
			list = (directormoviemapping.get(director2));
		}
		return list;
	}
	public List<String> findAllMovies() {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		for(String name : movies.keySet())
		{
			list.add(name);
		}
		return list;
	}
	
	public void deleteDirectorByName(String director) {
		// TODO Auto-generated method stub
		List<String> movies = new ArrayList<String>();
        if(directormoviemapping.containsKey(director)){
            //1. Find the movie names by director from the pair
            movies = directormoviemapping.get(director);

            //2. Deleting all the movies from movieDb by using movieName
            for(String movie: movies){
                if(this.movies.containsKey(movie)){
                    movies.remove(movie);
                }
            }

            //3. Deleteing the pair
            directormoviemapping.remove(director);
        }

        //4. Delete the director from directorDb.
        if(this.director.containsKey(director)){
            this.director.remove(director);
        }
	}
	
	public void deleteAllDirectors() {
		// TODO Auto-generated method stub
		
		HashSet<String> moviesSet = new HashSet<String>();

        //Deleting the director's map
        director = new HashMap<>();

        //Finding out all the movies by all the directors combined
        for(String director: directormoviemapping.keySet()){

            //Iterating in the list of movies by a director.
            for(String movie: directormoviemapping.get(director)){
                moviesSet.add(movie);
            }
        }

        //Deleting the movie from the movieDb.
        for(String movie: moviesSet){
            if(movies.containsKey(movie)){
                movies.remove(movie);
            }
        }
        //clearing the pair.
        directormoviemapping = new HashMap<>();
		
	}
	

}
