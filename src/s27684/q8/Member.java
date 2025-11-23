package s27684.q8;

public class Member extends Book {
    protected String memberName;
    protected int memberId;
    protected String contactNumber;

    public Member(int id, String createdDate, String updatedDate,
                  String libraryName, String location, String phoneNumber,
                  String sectionName, String sectionCode,
                  String title, String author, String ISBN,
                  String memberName, int memberId, String contactNumber)
            throws LibraryException {

        super(id, createdDate, updatedDate, libraryName, location, phoneNumber,
                sectionName, sectionCode, title, author, ISBN);

        if (memberId <= 0)
            throw new LibraryException("Member ID must be > 0");

        this.memberName = memberName;
        this.memberId = memberId;
        this.contactNumber = contactNumber;
    }
}

