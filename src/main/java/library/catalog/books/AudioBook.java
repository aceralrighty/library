package library.catalog.books;

import library.Collection;


public class AudioBook extends Book{
    private String readByFirstName;
    private String readByLastName;
    private double lengthInMinutes;

    public AudioBook(String callNumber, Collection collection, boolean onHold, boolean checkOut, String authorFirstName, String authorLastName, int publishedYear, String publisher, String title, String ISBN, String readByFirstName, String readByLastName, double lengthInMinutes) {
        super(callNumber, collection, onHold, checkOut, authorFirstName, authorLastName, publishedYear, publisher, title, ISBN);
        setReadByFirstName(readByFirstName);
        setReadByLastName(readByLastName);
        setLengthInMinutes(lengthInMinutes);

    }
    @Override
    public String toString() {
        return STR."""
\{super.toString()}
Title\{getTitle()}
Author: \{getAuthorFirstName()} \{getAuthorLastName()}
ISBN: \{getIsbn()}
Minutes: \{getLengthInMinutes()}
Read by: \{getReadByLastName()}, \{getReadByFirstName()}""";
    }

    public String getReadByFirstName() {
        return readByFirstName;
    }

    public void setReadByFirstName(String readByFirstName) {
        this.readByFirstName = readByFirstName;
    }

    public String getReadByLastName() {
        return readByLastName;
    }

    public void setReadByLastName(String readByLastName) {
        this.readByLastName = readByLastName;
    }

    public double getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(double lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }
}
