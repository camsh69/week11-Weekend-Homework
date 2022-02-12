package airlineEmployee;

import plane.PlaneType;

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

    public String canFlyPlane(PlaneType planeType) {
        if (planeType == PlaneType.BOEING747 || planeType == PlaneType.AIRBUSA380 || planeType == PlaneType.AIRBUS340) {
            return "Pilot can fly " + planeType;
        }
        return "Pilot cannot fly plane";
    }
}
