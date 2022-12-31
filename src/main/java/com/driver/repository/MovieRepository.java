package com.driver.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
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
		if(movies.containsKey(movie)&&director.containsKey(director2))
		{
			List<String> movielist=new ArrayList<>();
			if()
		}
		
	}
	

}
