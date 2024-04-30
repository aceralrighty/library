package library.catalog.books.Exceptions;

public class ItemNotAvailableException extends Exception{
    public ItemNotAvailableException(String message) {
        super(message);
    }
}
