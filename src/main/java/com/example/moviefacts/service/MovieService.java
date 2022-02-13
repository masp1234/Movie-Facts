package com.example.moviefacts.service;

import com.example.moviefacts.model.Movie;
import com.example.moviefacts.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class MovieService {
    private MovieRepository repository;

    public MovieService() {
        repository = new MovieRepository();
        repository.loadMovies();
    }
    public Movie getFirst() {
        List<Movie> movies = repository.findAll();
        return movies.get(0);

    }
}
