package library.multimedia;

public enum MovieGenre {
    FEATURE_FILM("Pulp Fiction"),
    ACTION_AND_ADVENTURE("John Wick"),
    SCIENCE_FICTION("Dune: Part Two"),
    DRAMA("A Few Good Men"),
    CHILDREN("Daddy Day Care"),
    FANTASY("The Hobbit"),
    FICTION("Mystic River"),
    COMEDY("Happy Gilmore"),
    SPANISH("Bardo: False Chronicles of a Handful of Truths"),
    ROMANCE("The Notebook");

    private String movieGenre;
    MovieGenre(String movieGenre) {

    }

    public String getMovieGenre() {
        return movieGenre;
    }
}
