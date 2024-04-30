package library;

import library.catalog.books.AudioBook;
import library.catalog.books.Book;
import library.multimedia.Movie;
import library.multimedia.MusicGenre;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        System.out.println("Welcome to the library! How many I assist you?");

    }

    public void Options(String options) {
        System.out.println("Select an option:");
        System.out.println("\n1 - See all material in catalog");
        System.out.println("\n2 - Look up material by call number");
        System.out.println("\n3 - Look up material by type");
        System.out.println("\n4 - Check out material by call number");
        System.out.println("\n5 - Return material by call number");
        System.out.println("\n6 - See all checked out material");
        System.out.println("\n X to exit");
        switch (options) {
            case "1":
                AllMaterialInCatalog();
            case "2":
                LookUpByCallNumber();
            case "3":
                LookUpByType();
            case "4":
                CheckOutByCallNumber();
            case "5":
                ReturnByCallNumber();
            case "6":
                SeeAllCheckedOutMaterial();
            case "X":
                System.exit(0);
        }
    }

    public void LookUpByType(String selectType) {
        System.out.println("Select the type of material:");
        System.out.println("\n1 - Audio book");
        System.out.println("\n2 - Book");
        System.out.println("\n3 - Movie");
        System.out.println("\n4 - Music");
        ArrayList<AudioBook> audioBooks = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Movie> movies = new ArrayList<>();
        ArrayList<MusicGenre> genres = new ArrayList<>();
        switch (selectType) {
            case "1":
                System.out.println(audioBooks);
            case "2":
                System.out.println(books);
            case "3":
                System.out.println(movies);
            case "4":
                System.out.println(genres);
        }
    }
}