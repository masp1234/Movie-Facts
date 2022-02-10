package com.example.moviefacts.repository;

import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class MovieRepository {

    public String findAll() {

        try {
            File file = new ClassPathResource("imdb-data.csv").getFile();
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        }
        catch(IOException e){
            System.out.println("Error reading file: " + e);
            }


        return "hello";
        }

    }

