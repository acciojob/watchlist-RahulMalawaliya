package com.driver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.driver.repository.Director;
import com.driver.repository.Movie;
import com.driver.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {
	
	@Autowired
	MovieService service;
		
	@PostMapping("/add-movie")
	public ResponseEntity<String> addMovie(@RequestBody Movie movie)
	{
		
		service.addmovie(movie);
		
		return new ResponseEntity<>("movie added succsesfullt",HttpStatus.CREATED);	
	}
	
	@PostMapping("/add-director")
	public ResponseEntity<String> addDirector(@RequestBody Director director)
	{
		service.adddirector(director);
		return new ResponseEntity<>("director added succsesfully",HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/add-mdpair")
	public ResponseEntity<String> addMovieDirectorPair(@RequestParam("movie")String movie , @RequestParam("Director") String director)
	{
		
	    service.addmoviedirectorpair(movie,director);
	    return new ResponseEntity<>("succssesfull take it",HttpStatus.ACCEPTED);
		
	}
	
	
	

}
