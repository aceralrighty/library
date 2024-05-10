package library;

import library.catalog.books.Exceptions.InvalidMaterialTypeException;
import library.catalog.books.Exceptions.ItemNotAvailableException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;

public class LibraryTests {
    private  void mockScannerInput(String input){
   ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
      System.setIn(in);
    }

    @Test
    public void callNumberInput() throws ItemNotAvailableException, InvalidMaterialTypeException {
       mockScannerInput("234W");
       assertEquals("234W", Library.LookUpByCallNumber());
    }
    @Test
   public void callNumberExt_ThrowsException() throws ItemNotAvailableException, InvalidMaterialTypeException {
        mockScannerInput("X");
        assertThrows(RuntimeException.class, Library::Options);
    }

}
