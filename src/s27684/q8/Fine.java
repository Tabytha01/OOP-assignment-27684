package s27684.q8;

public class Fine extends Borrow {
    protected double fineAmount;
    protected int daysLate;

    public Fine(int id, String createdDate, String updatedDate,
                String libraryName, String location, String phoneNumber,
                String sectionName, String sectionCode,
                String title, String author, String ISBN,
                String memberName, int memberId, String contactNumber,
                String borrowDate, String returnDate,
                double fineAmount, int daysLate)
            throws LibraryException {

        super(id, createdDate, updatedDate, libraryName, location, phoneNumber,
                sectionName, sectionCode, title, author, ISBN,
                memberName, memberId, contactNumber,
                borrowDate, returnDate);

        if (fineAmount < 0)
            throw new LibraryException("Fine cannot be negative");

        this.fineAmount = fineAmount;
        this.daysLate = daysLate;
    }
}
