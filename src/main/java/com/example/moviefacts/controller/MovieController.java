package com.example.moviefacts.controller;


import com.example.moviefacts.model.Movie;
import com.example.moviefacts.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    private MovieService movieService;


    public MovieController() {
        this.movieService = new MovieService();
    }


/*
    @GetMapping("/")
    public String index() {
        return "index";
    }
*/
    @GetMapping("/getFirst")
    public String getFirst() {
        return movieService.getFirst().toString();
    }

    @GetMapping("/getRandom")
    public String getRandom() {
        return movieService.getRandom().toString();
    }
    // Virker ikke
    @GetMapping("/getTenSortByPopularity")
    public String getTenSortByPopularity(Model model) {
        List<Movie> movies = movieService.getTenSortByPopularity();
        model.addAttribute("movies", movies);
        return "get-ten-sort-by-popularity";
    }

    @GetMapping("/howManyWonAnAward")
    public int howManyWonAnAward() {
        return movieService.howManyWonAnAward();
    }

    @GetMapping("getNAmountOfCharacters")
    public String getNAmountOfCharacters(@RequestParam char character, int amount) {
        return movieService.getNAmountOfCharacters(character, amount).toString();
    }

    @GetMapping("compareGenresByMovieLength")
    public String compareGenresByMovieLength(@RequestParam String genre1, String genre2) {
        return movieService.compareGenresByMovieLength(genre1, genre2);
    }
}

