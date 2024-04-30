package library.catalog.books;

import library.Material;

public abstract class Book extends Material {
    private String authorLastName;
    private String authorFirstName;
    private int publicationYear;
    private String publisher;
    private String title;
    private String isbn;

    @Override
    public String toString() {
        return super.toString() + "";
    }

    public Book(String authorLastName, String authorFirstName, int publicationYear, String publisher, String title, String isbn) {
        super();
        this.authorLastName = authorLastName;
        this.authorFirstName = authorFirstName;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.title = title;
        this.isbn = isbn;
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
