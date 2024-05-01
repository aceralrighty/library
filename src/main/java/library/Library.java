package library;

import library.catalog.books.Exceptions.InvalidMaterialTypeException;
import library.catalog.books.Exceptions.ItemNotAvailableException;

import java.util.Scanner;

/**
 * Here's my console/front-end/whatever you like to call it. actual writing didn't take that long, debugging took longer
 * @author Adam Ziv
 */

public class Library {

    public static void main(String[] args) throws InvalidMaterialTypeException, ItemNotAvailableException {
        System.out.println("Welcome to the library! How many I assist you?");
        Inventory.addToMaterial();
        while(true){
            Options();
        }
    }
    // only need to call this bad boi once no?
    static Scanner scanner = new Scanner(System.in);

    public static void Options() throws InvalidMaterialTypeException, ItemNotAvailableException {
        System.out.println("Select an option:");
        System.out.println("\n1 - See all material in catalog");
        System.out.println("\n2 - Look up material by call number");
        System.out.println("\n3 - Look up material by type");
        System.out.println("\n4 - Check out material by call number");
        System.out.println("\n5 - Return material by call number");
        System.out.println("\n6 - See all checked out material");
        System.out.println("\nX to exit");
        String options = scanner.nextLine();
        switch (options) {
            case "1":
                Inventory.displayAllInventory();
                break;
            case "2":
                LookUpByCallNumber();
                break;
            case "3":
                LookUpByType();
                break;
            case "4":
                CheckOutByCallNumber();
                break;
            case "5":
                ReturnByCallNumber();
                break;
            case "6":
                Inventory.displayCheckedOutInventory();
                break;
            case "X":

                System.out.println("Hate to see you go!\n That was a lie, i'm so glad your outta here!");
                System.exit(0);
                break;
        }
    }

    public static void LookUpByCallNumber() throws ItemNotAvailableException {

        System.out.println("Please enter the call number you would like to look up");
        String callNumber = scanner.nextLine();
        Inventory.getMaterialById(callNumber);
    }


    public static String LookUpByType() throws InvalidMaterialTypeException, ItemNotAvailableException {


        System.out.println("Select the type of material:");
        System.out.println("\n1 - Audio book");
        System.out.println("\n2 - Book");
        System.out.println("\n3 - Movie");
        System.out.println("\n4 - Music");
        String type = String.valueOf(Integer.parseInt(scanner.nextLine()));
        Inventory.getMaterialsByType(Integer.parseInt(type));
        if (type.isBlank()) {
            throw new InvalidMaterialTypeException("Invalid material!");
        }
        return type;
    }
    public static String CheckOutByCallNumber() {
        System.out.println("Enter the call number you would like to check out:\n");
        String callNumber = scanner.nextLine();
        Inventory.checkoutMaterial(callNumber);
        return callNumber;
    }
    public static void ReturnByCallNumber() {
        System.out.println("Enter the call number you would like to return:\n");
        String callNumber = scanner.nextLine();
        Inventory.returnMaterial(callNumber);
    }


}