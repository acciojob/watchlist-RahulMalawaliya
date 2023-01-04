package com.driver.service;

import java.util.List;

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

	public Movie getMovieByName(String movie) {
		// TODO Auto-generated method stub
		return rep.getMovieByName(movie);
	}

	public Director getDirectorByName(String director) {
		// TODO Auto-generated method stub
		return rep.getDirectorByName(director);
	}

	public List<String> getMoviesByDirectorName(String director) {
		// TODO Auto-generated method stub
		return rep.getMoviesByDirectorName(director);
	}

	public List<String> findAllMovies() {
		// TODO Auto-generated method stub
		return rep.findAllMovies();
	}

	public void deleteDirectorByName(String director2) {
		// TODO Auto-generated method stub
		rep.deleteDirectorByName(director2);
	}

	public void deleteAllDirectors() {
		// TODO Auto-generated method stub
		rep.deleteAllDirectors();
		
	}

}
