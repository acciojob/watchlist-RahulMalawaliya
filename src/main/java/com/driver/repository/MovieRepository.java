package com.driver.repository;

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
		
		movies =new HashMap<String,Movie>();
		
		director=new HashMap<String,Director>();
		
		directormoviemapping=new HashMap<String,List<String>>();
	}
	public void addmovie(Movie movie) {
		// TODO Auto-generated method stub
		movies.put(movie.getName(),movie);		
	}
	public void adddirector(Director director2) {
		// TODO Auto-generated method stub
		director.put(director2.getName(), director2);
		
	}
	

}
