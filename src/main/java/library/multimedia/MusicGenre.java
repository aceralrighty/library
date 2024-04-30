package library.multimedia;

public enum MusicGenre {
    JAZZ("JAZZ"),
    CLASSIC_ROCK("Classic Rock"),
    HIP_HOP("Hip-Hop"),
    POP("POP"),
    COUNTRY("Country"),
    ALTERNATIVE_ROCK("Alternative Rock");

    private String musicGenre;

    MusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
    }

    public String getMusicGenre() {
        return musicGenre;
    }
}
