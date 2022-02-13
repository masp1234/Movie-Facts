package com.example.moviefacts.service;

import com.example.moviefacts.model.Movie;
import com.example.moviefacts.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public class MovieService {
    private MovieRepository movieRepository;


    public MovieService() {
        movieRepository = new MovieRepository();
        movieRepository.loadMovies();
    }
    public Movie getFirst() {
        List<Movie> movies = movieRepository.findAll();
        return movies.get(0);

    }
}
