package library.multimedia;

import library.Collection;

import java.util.ArrayList;

/**
 * this also inherits from MultiMedia to become the nicest class you done ever darn seen
 * @author Adam Ziv
 */

public class Movie extends Multimedia {
    private String summary;
    private String cast;
    private ArrayList<MovieGenre> genreArrayList;

    public Movie(String callNumber, boolean onHold, Collection collection, boolean checkedOut, String title, int lengthInMinutes, String summary, String cast, ArrayList<MovieGenre> movieGenre) {
        super(callNumber, onHold, collection, checkedOut, title, lengthInMinutes);
        setSummary(summary);
        setCast(cast);
        setGenreArrayList(movieGenre);
    }
//    such a nice toString, so hi!
    @Override
    public String toString() {
        String movieString = super.toString();
        movieString += STR."""

Summary: \{getSummary()}
Cast: \{getCast()}""";
        return movieString;
    }

    /**
     * getters and setters
     * @return
     */
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public ArrayList<MovieGenre> getGenreArrayList() {
        return genreArrayList;
    }

    public void setGenreArrayList(ArrayList<MovieGenre> genreArrayList) {
        this.genreArrayList = genreArrayList;
    }
}
