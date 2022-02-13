package com.example.moviefacts.controller;


import com.example.moviefacts.model.Movie;
import com.example.moviefacts.repository.MovieRepository;
import com.example.moviefacts.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    private MovieService movieService;


    public MovieController() {
        movieService = new MovieService();
    }

    @GetMapping("/")
    public String index() {
        return "Forklaring på siden";
    }
    @GetMapping("/getFirst")
    public String getFirst() {
        return movieService.getFirst().toString();
    }
}

