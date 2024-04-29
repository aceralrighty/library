# Library Project

In this project you will practice (almost) everything you've learned this term - inheritance, lists, creating and using enums, custom exceptions and error handling, unit testing and java docs. A new optional topic that can be implemented is the use of Java Streams. 

This program is a basic implementation of a library system. A series of inherited classes will represent a single piece of material in the library (printed book, DVD, etc). An inventory class will maintain the list of all material and provide methods for searching and modifying the material in the list. The user will then be able to search the catalog, checkout and return items.

## Project Instructions

[Follow the general instructions here for forking, cloning, and turning in assignment](https://ihccjavaii.github.io/docs/general-project-instructions/README.md)

You will have sixteen files total in this project:

       - Library (main)
       - Material (super class)
         - Book (sub class, super class)
            - AudioBook (sub class)
            - PrintBook (sub class)
         - Multimedia (sub class, super class)
            - Movie (sub class)
            - Music (sub class)
         - MovieGenre (Enum)
         - MusicGenre (Enum)
         - Collection (Enum)
         - Inventory
         - InvalidMaterialTypeException
         - ItemNotAvailableException
         - InventoryTests
         - LibraryTests

![alt text](image-1.png)
### Collection Enum
- Create an enum called Collection that includes at least five types of collections that a piece of library material could be in

Example class diagram. You get to choose your own collection enums.
![img.png](img.png)

### Inventory class
- 1Inventory1 will keep track of all the materials in the library and their status
- Make sure that the methods and ArrayList of materials are static, so they can be accessed without instantiating an 1Inventory1 object
- Create all the fields and methods shown in the example class diagram below 

![img_1.png](img_1.png)

### Material class
- This will be the highest level super class for all the material in the library
- It should be declared abstract
- Create all the fields and methods shown in the example class diagram below 

![img_2.png](img_2.png)

### Book, PrintBook, and AudioBook classes
- `Book` should extend `Materials` and also be declared abstract
- `PrintBook` and `AudioBook` are instantiable (not abstract), and extend `Book` 
- Create all the fields and methods shown in the example class diagram below 

![img_3.png](img_3.png)

### Multimedia, Music and Movie classes
- `Multimedia` should extend `Materials` and also be declared abstract
- `Music` and `Movie` are instantiable (not abstract), and extend `Multimedia` 
- Create all the fields and methods shown in the example class diagram below 

![img_4.png](img_4.png)

### MovieGenre and MusicGenre

- Create enums for `MovieGenre` and `MusicGenre`. You get to choose your own genres. See the images below for some examples.

![img_5.png](img_5.png)

### Custom exceptions
- Create two custom exceptions called `InvalidMaterialTypeException` and `ItemNotAvailableException`
- Throw the `InvalidMaterialTypeException` when a patron tries to search for material by an invalid type.
- Throw the `ItemNotAvailableException` when no items are found for any type of search

### Library class
This will be the main class that runs the program. You will need to build:

1. A menu system that prompts the user if they want to:
   - See all materials in the catalog (displays all)
   - Look up material by call number (displays one item, if it matches call number, throws exception to display message if not found)
   - Look up material by type (displays all items under one type. If type is not found or invalid, throws exception and displays message)
   - Check out material by call number (sets checkedOut to true on item with call number. If item not found or already checked out, throw exception and display message)
   - Return material by call number (sets checkedOut to false on item with call number. If item not found or NOT checked out, throw exception and display message)
   - See all checked out material (displays only items where checkedOut is true)
2. Break out code into methods. The core logic should happen in the Inventory methods.
3. You will want to insert test data into the materials list before the main loop executes. For simplicity, there will be no file reading/database access here. Just hard code new objects and add them to the list. See the bottom of this document for some samples I've made that you are free to reuse.


### Javadocs
- Add Javadoc comments to all classes (ignore get/set/toString. Add only for logic methods and class headers.)

### Unit Testing
- Create unit test classes for the `Inventory` and `Library` classes. Aim for at least 90% test coverage of those classes.

[A reminder of how to setup JUnit is here](https://ihccjavaii.github.io/docs/junit/junit-setup-instructions.html)

### Example output

Here's an example of the program running. It does not show all the options, and you do not need to use the same wording for prompts. Use this as a general idea of how the program will run.

```
Welcome to the library! How may I assist you?

Select an option: 
1 - See all material in catalog
2 - Look up material by call number
3 - Look up material by type
4 - Check out material by call number
5 - Return material by call number
6 - See all checked out material
X to exit

3

Select the type of material:
1 - Audio book
2 - Book
3 - Movie
4 - Music

1

Call number: W6L36
Collection: Audio Book
Checked out: No
On hold: No
Title: Tale of Two Cities
Author: Bob, Billy
ISBN: 
Minutes: 236.0
Read by: Borbsky, Timothy

Call number: W6L36
Collection: Audio Book
Checked out: No
On hold: No
Title: Atomic Habits
Author: Clear, James
ISBN: 9781524779276
Minutes: 318.0
Read by: Clear, James

Call number: [Fic]
Collection: Audio Book
Checked out: No
On hold: No
Title: Twilight
Author: Meyer, Stephanie
ISBN: 0307282961
Minutes: 771.0
Read by: Kadushin, Ilyana

Select an option: 
1 - See all material in catalog
2 - Look up material by call number
3 - Look up material by type
4 - Check out material by call number
5 - Return material by call number
6 - See all checked out material
X to exit

4

Enter the call number of the item you wish to checkout:

W6L36

Checked out!

Select an option: 
1 - See all material in catalog
2 - Look up material by call number
3 - Look up material by type
4 - Check out material by call number
5 - Return material by call number
6 - See all checked out material
X to exit

6

Call number: W6L36
Collection: Audio Book
Checked out: Yes
On hold: No
Title: Tale of Two Cities
Author: Bob, Billy
ISBN: 
Minutes: 236.0
Read by: Borbsky, Timothy

Select an option: 
1 - See all material in catalog
2 - Look up material by call number
3 - Look up material by type
4 - Check out material by call number
5 - Return material by call number
6 - See all checked out material
X to exit

5

Enter the call number of the item you wish to return:

W6L36

Item returned!

Select an option: 
1 - See all material in catalog
2 - Look up material by call number
3 - Look up material by type
4 - Check out material by call number
5 - Return material by call number
6 - See all checked out material
X to exit

6

No items checked out.

Select an option: 
1 - See all material in catalog
2 - Look up material by call number
3 - Look up material by type
4 - Check out material by call number
5 - Return material by call number
6 - See all checked out material
X to exit

x
```

### Sample Material Objects

Here's some new objects created you can reuse to test your program. Feel free to write/generate your own (your contructors will need to match exactly what is in the diagrams for these to work, along with your ENUM names). Remember to add them to your material list.

```
       // PRINTED BOOKS
        Inventory.addMaterial(new PrintBook("0593863747","LT123", Collection.HOME_AND_GARDEN, false, false,"James", "Warner", "Penquin", "A Book About Java", 198, 2012));
        Inventory.addMaterial(new PrintBook("9780593863749","Q123", Collection.TEEN_FICTION, false, false,"Bob", "Billy", "50", "Dr Java", 224, 2023));
        Inventory.addMaterial(new PrintBook("9780593422946","813/.6", Collection.ANIME, false, false,"Timmy", "Thomas", "Tuesday Books", "Owls in the Wild", 50, 2020));
        Inventory.addMaterial(new PrintBook("9780063204157","813/.6", Collection.FICTION, false, false,"Shelby", "Van Pelt", "Tuesday Books", "Remarkably bright creatures : a novel", 355, 2015));
        Inventory.addMaterial(new PrintBook("9780593492918","813/.6", Collection.FICTION, false, false,"Ashley", "Elston", "Pamela Dorman Books/Viking", "First lie wins", 244, 2024));
        Inventory.addMaterial(new PrintBook("9780593599839","813/.6", Collection.FICTION, false, false,"Danielle L", "Jensen", "Del Rey", "First lie wins", 418, 2024));
        Inventory.addMaterial(new PrintBook("9781636550992","[E]", Collection.CHILDRENS_FICTION, false, false,"Brooke", "Hartman", "Red Comet Press", "All aboard the Alaska Train", 418, 2024));

       // AUDIO BOOKS
        Inventory.addMaterial(new AudioBook("","W6L36", Collection.AUDIO_BOOK, false, false, "Billy", "Bob", "Random House", "Tale of Two Cities", 236, "Timothy", "Borbsky", 1998));
        Inventory.addMaterial(new AudioBook("9781524779276","W6L36", Collection.AUDIO_BOOK, false, false, "James", "Clear", "Random House", "Atomic Habits", 318, "James", "Clear", 2012));
        Inventory.addMaterial(new AudioBook("0307282961","[Fic]", Collection.AUDIO_BOOK, false, false, "Stephanie", "Meyer", "Random House", "Twilight", 771, "Ilyana", "Kadushin", 2005));

       // DVDS
        Inventory.addMaterial(new Movie("791.43/72",
                Collection.DVD,
                false,
                false,
                "Jumanji",
                100,
                "Dwayne 'The Rock' Johnson, Karen Gillan, Kevin Hart, Jack Black, Bobby Cannavale, Nick Jonas.",
                "Four high school kids discover an old video game console and are drawn into the game's jungle setting, literally becoming the adult avatars they chose.",
                new ArrayList<>(List.of(MovieGenre.DRAMA, MovieGenre.COMEDY, MovieGenre.FANTASY))));

        Inventory.addMaterial(new Movie("791.43/72",
                Collection.DVD,
                false,
                false,
                "Home Alone",
                103,
                "Macaulay Culkin, Joe Pesci, Daniel Stern, John Heard, Catherine O'Hara.",
                "An eight-year-old boy is left home alone on Christmas, and has to defend his home against two bumbling burglars.",
                new ArrayList<>(List.of(MovieGenre.FEATURE_FILM, MovieGenre.COMEDY))));

        Inventory.addMaterial(new Movie("791.43/72",
                Collection.DVD,
                false,
                false,
                "Minority report",
                146,
                "Tom Cruise, Colin Farrell, Samantha Morton, Max Von Sydow, Lois Smith, Peter Stormare, Tim Blake Nelson, Steve Harris, Kathryn Morris.",
                "Washington, D.C. has been murder-free thanks to astounding technology which identifies killers before they commit their crimes. But when the chief of the Pre-crime unit is himself accused of a future murder, he has just 36 hours to discover who set him up.",
                new ArrayList<>(List.of(MovieGenre.FEATURE_FILM, MovieGenre.SCIENCE_FICTION))));

       // MUSIC CDS
        Inventory.addMaterial(new Music("782",
                Collection.AUDIO_CD,
                false,
                false,
                "John Denver's greatest hits",
                43,
                "John",
                "Denver",
                "John Denver",
                new String[]{"Take me home, country roads (3:08)",
                        "Follow me (2:56)",
                        "Starwood in Aspen (3:10)",
                        "For baby (for Bobbie) (2:58)",
                        "Rhymes and reasons (3:11)",
                        "Leaving, on a jet plane (4:00)"},
                MusicGenre.COUNTRY)
        );

        Inventory.addMaterial(new Music("782",
                Collection.AUDIO_CD,
                false,
                false,
                "Hell freezes over",
                43,
                null,
                null,
                "The Eagles",
                new String[]{"Get over it (3:29)",
                        "Love will keep us alive (4:00)",
                        "Hotel California (6:54)",
                        "Learn to be still (4:27) ",
                        "Take it easy (4:36)",
                        "Desparado (4:15)"},
                MusicGenre.CLASSIC_ROCK)
        );

        Inventory.addMaterial(new Music("782.42/15/46",
                Collection.AUDIO_CD,
                false,
                false,
                "Glee",
                55,
                null,
                null,
                "The Glee cast",
                new String[]{"Hello, goodbye",
                        "Gives you hell",
                        "Hello",
                        "A house is not a home",
                        "One less bell to answer",
                        "I dreamed a dream"},
                MusicGenre.POP)
        );
```

## Rubric

Projects are graded on functionality (does it compile, can the user do what they are supposed to, and do they get the expected results). It is also graded on features added in the instructions, like including the correct methods, constructors, data conversions, and tests.

| Topic                                           | Task                                                                                                                                                 | Points |
|-------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------|--------|
| **Collection, MovieGenre and MusicGenre Enums** | Classes are created as Enums and include correct data                                                                                                | 15     |
|                                                 | Classes are not an enum and/or not working correctly and/or incomplete                                                                               | 5      |
|                                                 | Enums are missing                                                                                                                                    | 0      |
| **Class hierarchy**                             | Class hierarchy is setup correctly according to the instructions, with the correct super classes and sub classes. Super classes are marked abstract. | 25     |
|                                                 | Class hierarchy is missing layers/supers/abstract                                                                                                    | 10     |
|                                                 | Inheritance / class hierarchy not being used                                                                                                         | 0      |
| **Inventory Class**                             | Inventory class is static and maintains record of materials. Functions are included to lookup material by various keys.                              | 25     |
|                                                 | Inventory class is included, but does not maintain record correctly or missing functions.                                                            | 15     |
|                                                 | Does not compile or missing most functionalities.                                                                                                    | 0      |
| **Custom Exceptions**                           | The two custom exceptions are created that extend an existing Java exception. Exceptions are thrown in appropriate areas inside the program.         | 10     |
|                                                 | Less than three exceptions created or exceptions incorrectly created and used                                                                        | 5      |
|                                                 | Custom exceptions missing                                                                                                                            | 0      |
| **Search and Modify Functionality**             | Program allows user to perform various search and modify functions as outlined in instructions.                                                      | 10     |
|                                                 | Includes only some of the required features and/or features that do not work.                                                                        | 2      |
|                                                 | Does not compile or missing most functionalities.                                                                                                    | 0      |
| **Javadocs**                                    | Javadocs created for all class headers and methods with logic                                                                                        | 5      |
|                                                 | Javadocs on some but not all required places                                                                                                         | 2      |
|                                                 | Javadocs missing                                                                                                                                     | 0      |
| **JUnit tests**                                 | JUnit tests created for `Inventory` and `Library` classes with at least 90% line coverage                                                            | 10     |
|                                                 | JUnit tests created but line coverage below 90%                                                                                                      | 3      |
|                                                 | JUnit tests missing                                                                                                                                  | 0      |
| **Total**                                       |                                                                                                                                                      | 100    |





