package s27684.q8;

public class Borrow extends Member {
    protected String borrowDate;
    protected String returnDate;

    public Borrow(int id, String createdDate, String updatedDate,
                  String libraryName, String location, String phoneNumber,
                  String sectionName, String sectionCode,
                  String title, String author, String ISBN,
                  String memberName, int memberId, String contactNumber,
                  String borrowDate, String returnDate)
            throws LibraryException {

        super(id, createdDate, updatedDate, libraryName, location, phoneNumber,
                sectionName, sectionCode, title, author, ISBN,
                memberName, memberId, contactNumber);

        if (borrowDate.isEmpty() || returnDate.isEmpty())
            throw new LibraryException("Dates cannot be empty");

        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }
}

