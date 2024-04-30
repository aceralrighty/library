package library.multimedia;

import library.Collection;
import library.Material;

/**
 * my other super class
 */
public abstract class Multimedia extends Material {
    private int lengthInMinutes;
    private String title;


    /**
     * this constructor passes in this abstract data's parameters back to the Material superclass
     * @param callNumber
     * @param onHold
     * @param collection
     * @param checkedOut
     * @param title
     * @param lengthInMinutes
     */
    Multimedia(String callNumber, boolean onHold, Collection collection, boolean checkedOut, String title, int lengthInMinutes){
        super(callNumber, onHold, collection, checkedOut);
        setTitle(title);
        setLengthInMinutes(lengthInMinutes);
    }

    /**
     * another really nicely formatted toString
     * @return
     */
    @Override
    public String toString() {
        String media = super.toString();
        media += STR."""


Title: \{getTitle()}
Length (In minutes): \{getLengthInMinutes()}""";
        return media;
    }

    /**
     * getters and setters
     * @return
     */

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
