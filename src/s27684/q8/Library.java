package s27684.q8;

public class Library extends Entity {
    protected String libraryName;
    protected String location;
    protected String phoneNumber;

    public Library(int id, String createdDate, String updatedDate,
                   String libraryName, String location, String phoneNumber)
            throws LibraryException {

        super(id, createdDate, updatedDate);

        if (phoneNumber.length() != 10)
            throw new LibraryException("Phone must be 10 digits");

        this.libraryName = libraryName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }
}

