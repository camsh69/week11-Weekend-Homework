package plane;

public enum PlaneType {
    BOEING747(467),
    AIRBUSA380(469),
    AIRBUS340(340);

    private final int capacity;

    PlaneType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
