package com.example.moviefacts.controller;


import com.example.moviefacts.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    private MovieService movieService;


    public MovieController() {
        this.movieService = new MovieService();
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/getFirst")
    public String getFirst() {
        return movieService.getFirst().toString();
    }
    @GetMapping("/getRandom")
    public String getRandom(){
        return movieService.getRandom().toString();
    }
    @GetMapping("/getTenSortByPopularity")
    public String getTenSortByPopularity(){
        return movieService.getTenSortByPopularity().toString();
    }
    @GetMapping("/howManyWonAnAward")
    public int howManyWonAnAward(){
        return movieService.howManyWonAnAward();
    }
    @GetMapping("getNAmountOfCharacters")
    public String getNAmountOfCharacters(@RequestParam char character, int amount){
        return movieService.getNAmountOfCharacters(character,amount).toString();
    }
    @GetMapping("compareGenresByMovieLength")
    public String compareGenresByMovieLength(@RequestParam String genre1, String genre2) {
        return movieService.compareGenresByMovieLength(genre1, genre2);
    }
}

