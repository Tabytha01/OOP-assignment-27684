package s27684.q8;

public class Book extends Section {
    protected String title;
    protected String author;
    protected String ISBN;

    public Book(int id, String createdDate, String updatedDate,
                String libraryName, String location, String phoneNumber,
                String sectionName, String sectionCode,
                String title, String author, String ISBN)
            throws LibraryException {

        super(id, createdDate, updatedDate, libraryName, location, phoneNumber,
                sectionName, sectionCode);

        if (ISBN.length() < 10)
            throw new LibraryException("ISBN must be >= 10 characters");

        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
}

