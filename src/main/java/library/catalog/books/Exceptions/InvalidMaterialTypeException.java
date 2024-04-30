package library.catalog.books.Exceptions;

public class InvalidMaterialTypeException extends Exception{
    public InvalidMaterialTypeException(String message) {
        super(message + " is not a valid material");
    }
}
