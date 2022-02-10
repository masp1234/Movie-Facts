package com.example.moviefacts.service;

import com.example.moviefacts.model.Movie;
import com.example.moviefacts.repository.MovieRepository;

import java.util.ArrayList;

public class MovieService {
    private MovieRepository repository;

    public MovieService() {
        repository = new MovieRepository();
        repository.loadMovies();
    }
    public String getFirst() {
        ArrayList<Movie> movies = repository.findAll();
        return repository.
    }
}
