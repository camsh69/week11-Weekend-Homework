package plane;

public class Plane {

    private PlaneType planeType;
    private int totalWeight;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
        this.totalWeight = 0;
    }

    public PlaneType getPlaneType() {
        return this.planeType;
    }
    
    public int getTotalWeight() {
        return this.totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }
}

