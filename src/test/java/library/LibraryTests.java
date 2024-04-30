package library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;

public class LibraryTests {
    private  void mockScannerInput(String input){
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    @Test
    public void whenLookUpByTypeIsInvalid_thenThrowsException() {
        mockScannerInput("");
        assertTrue(Library.Options())

    }

}
