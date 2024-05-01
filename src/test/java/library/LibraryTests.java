package library;

import library.catalog.books.Exceptions.InvalidMaterialTypeException;
import library.catalog.books.Exceptions.ItemNotAvailableException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;

public class LibraryTests {
    private  void mockScannerInput(){
//        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
    }

    @Test
    public void whenLookUpByTypeIsInvalid_thenThrowsException() throws ItemNotAvailableException, InvalidMaterialTypeException {
        String IdLookUp = Library.LookUpByType();

        assertEquals("Invalid material!", Library.CheckOutByCallNumber());
    }

}
