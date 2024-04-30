package library;

/**
 * my very nice enums
 * @author Adam Ziv
 */

public enum Collection {
    CHILDRENS_DVD("Children DVD"),
    FICTION("Fiction"),
    TEEN_NON_FICTION("Teen Non Fiction"),
    AUDIO_BOOK("Audio book"),
    DVD("DVD"),
    BOARD_GAMES("Board Games"),
    CHILDRENS_FICTION("Children Fiction"),
    AUDIO_CD("Audio CD"),
    CHILDRENS_MUSIC_CD("Children Music CD"),
    SCIFI_FANTASY("Sci-fi Fantasy"),
    ANIME("Anime"),
    TEEN_FICTION("Teen Fiction"),
    CHILDRENS_NON_FICTION("Children Non Fiction"),
    HOME_AND_GARDEN("Home and Garden"),
    BOOK("Book"),
    MOVIE("Movie"),
    MUSIC("Music");
    private String collectionName;



    Collection(String collectionName){
        this.collectionName = collectionName;
    }

    public String getCollectionName() {
        return collectionName;
    }
}
