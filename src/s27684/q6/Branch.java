package s27684.q6;

public class Branch extends Company {
    protected String branchName;
    protected String locationCode;

    public Branch(int id, String createdDate, String updatedDate,
                  String companyName, String address, String phoneNumber,
                  String branchName, String locationCode)
            throws VehicleRentalException {

        super(id, createdDate, updatedDate, companyName, address, phoneNumber);

        if (locationCode.length() < 3)
            throw new VehicleRentalException("Location code must be at least 3 characters");

        this.branchName = branchName;
        this.locationCode = locationCode;
    }
}

