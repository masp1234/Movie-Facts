package com.example.moviefacts.model;



public class Movie {
    private int year;
    private int length;
    private String title;
    private String genre;
    private int popularity;
    private boolean awards;


    public Movie(int year, int length, String title, String genre, int popularity, boolean awards) {
        this.year = year;
        this.length = length;
        this.title = title;
        this.genre = genre;
        this.popularity = popularity;
        this.awards = awards;
    }
    public String toString() {
        return year + " " + length + " " + title + " " + genre + " " + popularity + " " + awards;
    }



    /*
    private enum Genre {
        DRAMA, COMEDY, ACTION, SCIENCE_FICTION, MUSIC, WESTERN, MYSTERY, HORROR, WAR

     */

}
