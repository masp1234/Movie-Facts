package com.example.moviefacts.service;

import com.example.moviefacts.model.Movie;
import com.example.moviefacts.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.*;


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
    public Movie getRandom(){
        List<Movie> movies = movieRepository.findAll();
        Random random = new Random();
        int randomNumber = random.nextInt(movies.size());
        return movies.get(randomNumber);
    }
    public List<Movie> getTenSortByPopularity(){
        List<Movie> movies = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
           movies.add(getRandom());
        }
        Collections.sort(movies);
        return movies;
    }
    public int howManyWonAnAward(){
        int counter = 0;
        List<Movie> movies = movieRepository.findAll();
        for (int i = 0; i < movies.size(); i++) {
            if(movies.get(i).getAwards()){
                counter++;
            }
        }
        return counter;
    }
    public List<Movie> getNAmountOfCharacters(char character, int amount){
        List<Movie> allMovies = movieRepository.findAll();
        List<Movie> movies = new LinkedList<>();
        String title;
        int counter = 0;
        for (Movie movie:allMovies) {
           title = movie.getTitle();
           char[] titleArray = title.toCharArray();
            for (char c:titleArray) {
                if(c == character){
                    counter++;
                }
            }
            if(counter >= amount){
                movies.add(movie);
            }
            counter = 0;
        }
        return movies;
    }
}
