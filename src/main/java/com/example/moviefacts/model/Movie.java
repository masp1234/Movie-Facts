package com.example.moviefacts.model;



public class Movie implements Comparable<Movie>{
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

    @Override
    public int compareTo(Movie o) {
        return popularity - o.popularity;
    }
    public boolean getAwards(){
        return awards;
    }

    public String getTitle() {
        return title;
    }
    /*
    private enum Genre {
        DRAMA, COMEDY, ACTION, SCIENCE_FICTION, MUSIC, WESTERN, MYSTERY, HORROR, WAR

     */

}
