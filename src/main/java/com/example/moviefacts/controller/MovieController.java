package com.example.moviefacts.controller;


import com.example.moviefacts.repository.MovieRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @GetMapping("/")
    public String index() {
        return "Forklaring på siden";
    }

    @GetMapping("/findall")
        public String findAllMovies() {
            MovieRepository movieRepository = new MovieRepository();
            return movieRepository.findAll();
        }

}


