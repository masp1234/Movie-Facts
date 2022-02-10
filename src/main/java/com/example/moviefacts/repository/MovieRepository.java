package com.example.moviefacts.repository;

import com.example.moviefacts.model.Movie;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class MovieRepository {
    private List<Movie> movies;


    public List<Movie> findAll() {
        return movies;
    }


    public void loadMovies() {
        try {
            File file = new ClassPathResource("imdb-data.csv").getFile();
            Scanner reader = new Scanner(file);
            reader.useDelimiter(";");

            //Skipper første linje, da den ikke skal læses ind
            reader.nextLine();
            while (reader.hasNextLine()) {
                int year = reader.nextInt();
                int length = reader.nextInt();
                String title = reader.next();
                String subject = reader.next();
                int popularity = reader.nextInt();
                String tempAwards = reader.next();
                boolean awards = false;
                if (tempAwards.equalsIgnoreCase("yes"))
                    awards = true;

                movies.add(new Movie(year, length, title, subject, popularity, awards));

            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
        }
    }

}

