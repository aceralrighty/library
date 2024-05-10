package library;

import library.catalog.books.AudioBook;
import library.catalog.books.Book;
import library.catalog.books.Exceptions.InvalidMaterialTypeException;
import library.catalog.books.Exceptions.ItemNotAvailableException;
import library.catalog.books.PrintBook;
import library.multimedia.Movie;
import library.multimedia.MovieGenre;
import library.multimedia.Music;
import library.multimedia.MusicGenre;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InventoryTests {
    static AudioBook audioBook;
    static Movie movie;
    static PrintBook printBook;
    static Music music;
    @BeforeEach
    public void Setup(){
        audioBook = new AudioBook("234W",
                Collection.AUDIO_BOOK,
                true,
                false,
                "James",
                "Clear",
                2012,
                "Random House",
                "Atomic Habits",
                "123444444",
                "James",
                "Clear",
                318);

        movie = new Movie("4555W",
                true,
                Collection.MOVIE,
                false,
                "Jumanji",
                100,
                "Four high school kids discover an old video game console and are drawn into the game's jungle setting, literally becoming the adult avatars they chose.",
                "Dwayne 'The Rock' Johnson, Karen Gillan, Kevin Hart, Jack Black, Bobby Cannavale, Nick Jonas.",
                new ArrayList<>(List.of(MovieGenre.DRAMA, MovieGenre.COMEDY, MovieGenre.FANTASY)));

        printBook = new PrintBook("LT123", Collection.HOME_AND_GARDEN,
                false,
                true,
                "James",
                "Warner",
                2012,
                "Penquin",
                "A Book About Java",
                "0593863747",
                198);
        music = new Music("123TR", true,
                Collection.AUDIO_CD,
                false,
                "To Pimp A butterfly",
                67,
                MusicGenre.HIP_HOP,
                "Lamar",
                "Kendrick",
                null, null);
        Inventory.addMaterial(movie);
        Inventory.addMaterial(printBook);
        Inventory.addMaterial(music);
        Inventory.addMaterial(audioBook);

    }
    @AfterEach
    public void tearDown(){
        Inventory.materials = new ArrayList<>();
    }

    @Test
    public void checkMaterialsByType_ReturnBookList() throws ItemNotAvailableException, InvalidMaterialTypeException {
        Setup();
        ArrayList<Material> expected = new ArrayList<>();
        expected.add(printBook);
        assertEquals(expected, Inventory.getMaterialsByType(1));


        tearDown();
    }
    @Test
    public void AddElementsTests(){
        ArrayList<Inventory> expected = new ArrayList<>();
        expected.add(Inventory.addToMaterial());
        assertEquals(expected, Inventory.addToMaterial());
    }

    @Test
    public void materialByType_ThrowsItemNotAvailableException() throws InvalidMaterialTypeException {
        boolean found;
        try{
            Inventory.getMaterialsByType(4);
            found = false;
        } catch (InvalidMaterialTypeException | ItemNotAvailableException e){
            found = true;
        }
        assertTrue(found);
    }
    @Test
    public void showCheckedOutMaterial_DisplayALlMaterials() throws ItemNotAvailableException, InvalidMaterialTypeException {
        Setup();
        Inventory.checkoutMaterial(movie.getCallNumber());
        assertEquals("\n"+movie.toString(), Inventory.displayCheckedOutInventory());
        tearDown();
    }
    @Test
    public void grabMaterialId_ReturnCorrectMaterialId() throws ItemNotAvailableException, InvalidMaterialTypeException {
        Setup();
        assertEquals(movie, Inventory.getMaterialById(movie.getCallNumber()));
        tearDown();
    }
}
