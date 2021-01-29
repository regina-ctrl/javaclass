package classes;

public class VehicleV2 {
    private static final int maxPassengers = 25;
    private int passengers;     // number of passengers
    private int fuelcap;        // fuel capacity in gallons
    private int mpg;            // fuel consumption in miles per gallon


    public VehicleV2(int passengers, int fuelcap, int mpg) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }

    int getRange() {
        return this.fuelcap * this.mpg;
    }

    boolean canCarry(int additionalPassengers) {
        return (passengers + additionalPassengers) <= maxPassengers;
    }

    // Compute fuel needed for a given distance.
    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }

    public int numPassengers() {
        return this.passengers;
    }

    public int getFuelcap() {
        return this.fuelcap;
    }

    public int getMpg() {
        return this.mpg;
    }
}