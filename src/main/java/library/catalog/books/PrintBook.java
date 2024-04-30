package library.catalog.books;

import library.Collection;

/**
 * this class inherits from Book class and takes in page count
 */

public class PrintBook extends Book {
    private int pages;

    public PrintBook(String callNumber, Collection collection, boolean onHold, boolean checkOut, String authorFirstName, String authorLastName, int publishedYear, String publisher, String title, String ISBN, int pages) {
        super(callNumber, collection, onHold, checkOut, authorFirstName, authorLastName, publishedYear, publisher, title, ISBN);
        setPages(pages);
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
//    nicely formatted toString for pages
    @Override
    public String toString() {
       String page = super.toString();
        page += "\nPages: " + getPages();
        return page;
    }
}
