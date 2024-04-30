package library.catalog.books;

public class AudioBook extends Book{
    private String readByFirstName;
    private String readByLastName;
    private double lengthInMinutes;

    public AudioBook(String authorLastName, String authorFirstName, int publicationYear, String publisher, String title, String isbn, String readByFirstName, String readByLastName, double lengthInMinutes) {
        super(authorLastName, authorFirstName, publicationYear, publisher, title, isbn);
        this.readByFirstName = readByFirstName;
        this.readByLastName = readByLastName;
        this.lengthInMinutes = lengthInMinutes;
    }
    @Override
    public String toString() {

    }

    public String getReadByFirstName() {
        return readByFirstName;
    }

    public void setReadByFirstName(String readByFirstName) {
        this.readByFirstName = readByFirstName;
    }

    public String getReadByLastName() {
        return readByLastName;
    }

    public void setReadByLastName(String readByLastName) {
        this.readByLastName = readByLastName;
    }

    public double getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(double lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }
}
