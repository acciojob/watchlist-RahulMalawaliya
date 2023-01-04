package com.driver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@PutMapping("/add-movie-director-pair")
	public ResponseEntity<String> addMovieDirectorPair(@RequestParam("movie")String movie , @RequestParam("Director") String director)
	{
		
	    service.addmoviedirectorpair(movie,director);
	    return new ResponseEntity<>("succssesfull take it",HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/get-movie-by-name")
	public Movie getMovieByName(@RequestParam String movie)
	{
		return service.getMovieByName(movie);
	}
	
	@GetMapping("/get-director-by-name")
	public Director getDirectorByName(@RequestParam String director)
	{
		return service.getDirectorByName(director);
	}
	
	@GetMapping("/get-movies-by-director-name")
	public List<String> getMoviesByDirectorName(@RequestParam String director)
	{
		return service.getMoviesByDirectorName(director);
	}
	
	@GetMapping("/get-all-movies")
	public List<String> findAllMovies()
	{
		return service.findAllMovies();
	}
	
	
	@DeleteMapping("/delete-director-by-name")
	public ResponseEntity<String> deleteDirectorByName(@RequestParam String director)
	{
		service.deleteDirectorByName(director);
		return new ResponseEntity<>("gotchaa",HttpStatus.ACCEPTED);
		
	}
	
	@DeleteMapping("delete-all-directors")
	public ResponseEntity<String> deleteAllDirectors()
	{
		service.deleteAllDirectors();
		return new ResponseEntity<String>("chale gaye director to",HttpStatus.ACCEPTED);
	}
	
	

}
