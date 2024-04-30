package library;

public enum Collection {
    CHILDRENS_DVD("The land before time"),
    FICTION("The Lord of the Flies"),
    TEEN_NON_FICTION("The Giver"),
    AUDIO_BOOK("The Chronicles Of Amber"),
    DVD("Dune: Part Two"),
    BOARD_GAMES("Monopoly"),
    CHILDRENS_FICTION("Barney"),
    AUDIO_CD("Barney's Playtime"),
    CHILDRENS_MUSIC_CD("Barney's Music CD"),
    SCIFI_FANTASY("Rendezvous with Rama"),
    ANIME("Akira"),
    TEEN_FICTION("Twilight"),
    CHILDRENS_NON_FICTION("Bouncing babies"),
    HOME_AND_GARDEN("Green thumb");
    private String collectionName;



    Collection(String collectionName){

    }

    public String getCollectionName() {
        return collectionName;
    }
}
