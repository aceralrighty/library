package library.catalog.books;

public class PrintBook extends Book {
    private int pages;

    public PrintBook(String authorLastName, String authorFirstName, int publicationYear, String publisher, String title, String isbn, int pages) {
        super(authorLastName, authorFirstName, publicationYear, publisher, title, isbn);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    @Override
    public String toString() {
        return super.toString() + "";
    }
}
