package library;


import library.catalog.books.AudioBook;
import library.catalog.books.Exceptions.InvalidMaterialTypeException;
import library.catalog.books.Exceptions.ItemNotAvailableException;
import library.catalog.books.PrintBook;
import library.multimedia.Movie;
import library.multimedia.MovieGenre;
import library.multimedia.Music;
import library.multimedia.MusicGenre;

import java.util.ArrayList;
import java.util.List;

/**
 * my very lengthy Inventory class
 * i'm very proud of this one
 *
 * @author Adam Ziv
 */

public class Inventory {
    public static ArrayList<Material> materials = new ArrayList<>();

    /**
     * this method loops through Material checking if the call number is true and if checked out is false
     * meaning if the item isn't checked out, if that is the case then the item will be checked out
     *
     * @param checkingOut
     */
    public static void checkoutMaterial(String checkingOut) {
        for (Material material : materials) {
            if (checkingOut.equalsIgnoreCase(material.getCallNumber()) && !material.isCheckedOut()) {
                material.setCheckedOut(true);
                System.out.println("Material: " + material.getCallNumber() + " is checked out!");
            }
        }
    }

    private static String[] TYPES_CLASS_NAMES = new String[]{
            "AUDIO_BOOK", "BOOK", "MOVIE", "MUSIC"
    };

    /**
     * this takes user inputs and loops through my Material objects and validates if my Collection enums are true and
     * equal to what the user wanted
     *
     * @param materialType
     * @return
     */
    public static int getMaterialsByType(int materialType) throws ItemNotAvailableException, InvalidMaterialTypeException {
        boolean isFound = false;
        Collection numType = Collection.valueOf(TYPES_CLASS_NAMES[materialType - 1]);
        for (Material material : materials) {
            if (numType == material.collection) {
                System.out.println(material);
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("nothing was found");
            throw new InvalidMaterialTypeException(STR."We could not find any material of type \{materialType}");
        }
        return materialType;
    }

    /**
     * this method checks for materials and if the call number is correct and if the checked out status is false
     * meaning if the item is checked out then it will return the item
     *
     * @param material
     */
    public static String returnMaterial(String material) {
        for (Material m : materials) {
            if (material.equalsIgnoreCase(m.getCallNumber()) && m.isCheckedOut()) {
                m.setCheckedOut(false);
                System.out.println("\n\tMaterial returned!" + m.getCallNumber());
            }
        }
        return material;
    }

    /**
     * this will return all the inventory
     *
     * @return
     */
    public static void displayAllInventory() {

        for (Material material : materials) {
            if (material.isCheckedOut()) {
                System.out.println(material);
            }
        }
    }

    /**
     * this method adds new materials to the materials ArrayList
     *
     * @param material
     */
    public static void addMaterial(Material material) {
        materials.add(material);
    }

    /**
     * this method converts yes or no answers into booleans to check if a material is checked out
     *
     * @param input
     * @return
     */
    public static boolean isMaterialCheckedOut(String input) throws ItemNotAvailableException {
        if (input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * this method grabs the material based on the ID the user puts in.
     * similar to the method that grabs material by type
     *
     * @param materialId
     * @return
     * @throws ItemNotAvailableException
     */

    public static short getMaterialById(String materialId) throws ItemNotAvailableException {
        for (Material material : materials) {
            if (materialId.equalsIgnoreCase(material.getCallNumber())) {
                System.out.println(material);
            } else {
                throw new ItemNotAvailableException("This material does not exist");
            }
        }
        return 0;
    }

    /**
     * this method displays all the inventory that was checked out
     *
     * @return
     */
    public static short displayCheckedOutInventory() {
        System.out.println("All items that are currently checked out: \n");
        for (Material material : materials) {
            if (material.isCheckedOut()) {
                System.out.println(material);
            } else {
                System.out.println(STR."""
\{material.getCallNumber()}
\tIs is not checked out!""");
            }
        }
        return 0;
    }

    /**
     * Mock inventory data
     */
    public static void addToMaterial() {
        Inventory.addMaterial(new PrintBook("WD40", Collection.BOOK, false, false, "David", "Goggins",
                2016, "Penguin publishing", "Can't Hurt Me", "132333333333", 350));

        Inventory.addMaterial(new Movie("WD50", false, Collection.MOVIE, true, "Akira", 124,
                "A secret military project endangers Neo-Tokyo when it turns a biker gang member into a rampaging psychic psychopath who can only be stopped by a teenager, his gang of biker friends and a group of psychics.",
                "Mitsuo Iwata, Nozomu Sasaki, Mami Koyama", new ArrayList<>(List.of(MovieGenre.ACTION_AND_ADVENTURE, MovieGenre.SCIENCE_FICTION))));

        Inventory.addMaterial(new Music("782", false, Collection.MUSIC, true, "Hell freezes over", 43,
                MusicGenre.CLASSIC_ROCK, null, null, new String[]{"Get over it(3:29", "Love will keep alive (4:00", "Hotel California (6:54",
                "Learn to be still (4:27)", "Take it easy (4.36)", "Desparado (4:15)"}, "The Eagles"));
        Inventory.addMaterial(new AudioBook("W6L36", Collection.AUDIO_BOOK, false, true, "Billy", "Bobber", 1998, "Random House", "Tale of Two Cities", "9781524779276", "Timothy", "Borbsky", 236));
    }


}
