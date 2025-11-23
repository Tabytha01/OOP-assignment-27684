package s27684.q8;

public class Payment extends Fine {
    protected String paymentDate;
    protected String paymentMode;

    public Payment(int id, String createdDate, String updatedDate,
                   String libraryName, String location, String phoneNumber,
                   String sectionName, String sectionCode,
                   String title, String author, String ISBN,
                   String memberName, int memberId, String contactNumber,
                   String borrowDate, String returnDate,
                   double fineAmount, int daysLate,
                   String paymentDate, String paymentMode)
            throws LibraryException {

        super(id, createdDate, updatedDate, libraryName, location, phoneNumber,
                sectionName, sectionCode, title, author, ISBN,
                memberName, memberId, contactNumber,
                borrowDate, returnDate,
                fineAmount, daysLate);

        if (paymentDate.isEmpty() || paymentMode.isEmpty())
            throw new LibraryException("Payment fields cannot be empty");

        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
    }
}

