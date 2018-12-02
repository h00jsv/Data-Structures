package com.joakims.ArrayList;

import java.util.Arrays;

/**
 * implements the List interface
 * most frequently used data structure
 * can contain duplicate elements
 * can hold null values
 * is not inherently thread safe.
 */


public class VideoGame {

    private String title;
    private int year;
    private String rating;
    private String[] platforms;

    public VideoGame(String title, int year, String rating, String[] platforms) {
        this.title = title;
        this.year = year;
        this.rating = rating;
        this.platforms = platforms;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String[] getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String[] platforms) {
        this.platforms = platforms;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", rating='" + rating + '\'' +
                ", platforms=" + Arrays.toString(platforms) +
                '}';
    }
}
