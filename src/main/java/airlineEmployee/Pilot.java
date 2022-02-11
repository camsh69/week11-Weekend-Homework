package airlineEmployee;

public class Pilot extends CabinCrewMember {

    private String licenceNumber;

    public Pilot(String name, RankType rankType, String licenceNumber) {
        super(name, rankType);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }
}
