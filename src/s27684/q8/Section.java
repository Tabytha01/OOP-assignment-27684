package s27684.q8;

public class Section extends Library {
    protected String sectionName;
    protected String sectionCode;

    public Section(int id, String createdDate, String updatedDate,
                   String libraryName, String location, String phoneNumber,
                   String sectionName, String sectionCode)
            throws LibraryException {

        super(id, createdDate, updatedDate, libraryName, location, phoneNumber);

        if (sectionCode.length() < 3)
            throw new LibraryException("Section code must be >= 3 chars");

        this.sectionName = sectionName;
        this.sectionCode = sectionCode;
    }
}

