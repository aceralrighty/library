package library.multimedia;

public enum MovieGenre {
    FEATURE_FILM("Feature Film"),
    ACTION_AND_ADVENTURE("Action And Adventure"),
    SCIENCE_FICTION("Science Fiction"),
    DRAMA("Drama"),
    CHILDREN("Children"),
    FANTASY("Fantasy"),
    FICTION("Fiction"),
    COMEDY("Comedy"),
    SPANISH("Spanish"),
    ROMANCE("Romance");

    private String movieGenre;

    MovieGenre(String MovieGenre) {
        this.movieGenre = MovieGenre;
    }

    public String getMovieGenre() {
        return movieGenre;
    }
}
