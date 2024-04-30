package library.catalog.books;

import library.Collection;
import library.Material;

/**
 * this is super class that is also a subclass of Material
 * @author Adam Ziv
 */
public abstract class Book extends Material {
    private String authorLastName;
    private String authorFirstName;
    private int publicationYear;
    private String publisher;
    private String title;
    private String isbn;

//    nice toString, not to toot my own horn or anything 🤭
    @Override
    public String toString() {
        String books = super.toString();
         books += STR."""

Author: \{getAuthorFirstName()}, \{getAuthorLastName()}
Published year: \{getPublicationYear()}
Publisher: \{getPublisher()}
Title: \{getTitle()}
ISBN: \{getIsbn()}""";
         return books;
    }

//    Parameterized constructor
    public Book(String callNumber, Collection collection, boolean onHold, boolean checkOut, String authorFirstName, String authorLastName, int publicationYear, String publisher, String title, String isbn) {
        super(callNumber,onHold,collection, checkOut);
        setAuthorFirstName(authorLastName);
        setAuthorLastName(authorFirstName);
        setPublicationYear(publicationYear);
        setPublisher(publisher);
        setTitle(title);
        setIsbn(isbn);
    }

    /**
     * these are my getter and setter methods.
     * @return
     */
    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
