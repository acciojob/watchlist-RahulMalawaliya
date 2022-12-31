package com.driver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.driver.repository.Director;
import com.driver.repository.Movie;
import com.driver.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	MovieRepository rep;

	public void addmovie(Movie movie) {
		// TODO Auto-generated method stub
		rep.addmovie(movie);
		
	}

	public void adddirector(Director director) {
		// TODO Auto-generated method stub
		rep.adddirector(director);
		
	}

	public void addmoviedirectorpair(String movie, String director) {
		// TODO Auto-generated method stub
		rep.addmoviedirecterpair(movie,director);
		
	}

}
