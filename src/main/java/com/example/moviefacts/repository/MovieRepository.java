package com.example.moviefacts.repository;

import com.example.moviefacts.model.Movie;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class MovieRepository {
    private List<Movie> movies;

    public MovieRepository() {
        movies = new LinkedList<Movie>();
    }

    public List<Movie> findAll() {
        return movies;
    }

    public void loadMovies() {
        try {
            File file = new File("src/main/resources/data/imdb-data.csv");
            Scanner reader = new Scanner(file);
            reader.useDelimiter(";");

            //Skipper første linje, da den ikke skal læses ind
            reader.nextLine();
            while (reader.hasNextLine()) {
                int year = reader.nextInt();
                int length = reader.nextInt();
                reader.nextLine();
                String title = reader.next();
                String subject = reader.next();
                int popularity = reader.nextInt();
                reader.nextLine();
                String tempAwards = reader.next();
                boolean awards = false;
                if (tempAwards.equalsIgnoreCase("yes"))
                    awards = true;

                movies.add(new Movie(year, length, title, subject, popularity, awards));
                System.out.println(movies);

            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
        }
    }

}

