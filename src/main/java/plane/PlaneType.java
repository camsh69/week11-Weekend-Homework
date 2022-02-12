package plane;

public enum PlaneType {
    AIRBUS340(340, 13600),
    AIRBUSA380(469, 18760),
    BOEING747(467, 18680);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
