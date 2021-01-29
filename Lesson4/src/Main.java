import classes.VehicleV2;

public class Main {

    public static void main(String args[]) {

        class VehicleV1 {
            private static final int maxPassengers = 25;
            int passengers;     // number of passengers
            int fuelcap;        // fuel capacity in gallons
            int mpg;            // fuel consumption in miles per gallon

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
        }

        VehicleV1 myVehicle = new VehicleV1();
        myVehicle.fuelcap = 16;
        myVehicle.mpg = 10;
        myVehicle.passengers = 10;
        System.out.println(String.format("Passengers: [%d], MPG: [%d], Fuel Capacity: [%d]",
                myVehicle.passengers, myVehicle.mpg, myVehicle.fuelcap));

        System.out.println("---------------------------------");
        System.out.println("--example of 2 vehicle variables (pointers) pointing to the same object--");
        VehicleV1 mySecondVehicle = myVehicle;
        myVehicle.passengers = 20;
        System.out.println(String.format("Passengers: [%d], MPG: [%d], Fuel Capacity: [%d]",
                myVehicle.passengers, myVehicle.mpg, myVehicle.fuelcap));
        System.out.println(String.format("Passengers: [%d], MPG: [%d], Fuel Capacity: [%d]",
                mySecondVehicle.passengers, mySecondVehicle.mpg, mySecondVehicle.fuelcap));
        System.out.println("---------------------------------");

        VehicleV1 sportsCar = new VehicleV1();
        sportsCar.fuelcap = 10;
        sportsCar.mpg = 5;
        sportsCar.passengers = 2;
        System.out.println(String.format("My sportscar has Passengers: [%d], MPG: [%d], Fuel Capacity: [%d]",
                sportsCar.passengers, sportsCar.mpg, sportsCar.fuelcap));

        int range = sportsCar.fuelcap * sportsCar.mpg;
        System.out.println(String.format("My sportscar range: [%d]", range));
        System.out.println(String.format("My sportscar range with getRange method: [%d]", sportsCar.getRange()));

        System.out.println(String.format("Can my sportscar carry 10 additional passengers: [%b]", sportsCar.canCarry(10)));
        System.out.println(String.format("Can my sportscar carry 25 additional passengers: [%b]", sportsCar.canCarry(25)));
        System.out.println(String.format("How much fuel is needed for [%d] miles: [%f]", 10, sportsCar.fuelNeeded(10)));

        System.out.println(String.format("Is 5 a factor of 10: [%b]", isFactor(5,10)));
        System.out.println(String.format("Is 2 a factor of 7: [%b]", isFactor(2,7)));

        System.out.println("---------------------------------");
        System.out.println("---obj.VehicleV2 with Constructor----");
        VehicleV2 myVehicleWithConstructor = new VehicleV2();
        myVehicleWithConstructor.fuelcap = 16;
        myVehicleWithConstructor.mpg = 10;
        myVehicleWithConstructor.passengers = 10;
        System.out.println(String.format("Passengers: [%d], MPG: [%d], Fuel Capacity: [%d]",
                myVehicleWithConstructor.passengers, myVehicleWithConstructor.mpg, myVehicleWithConstructor.fuelcap));
    }

    private static boolean isFactor(int a, int b) {
        if( (b % a) == 0) {
            return true;
        }
        return false;
    }
}

/** Scratchpad

 class myClassName {
    // Section 1: Member Variables
    type var1; (Ex: int numWheels)
    type var2; (Ex: int mpg)

    // Section 2: Member Methods (or Member Functions)
    type method1Name(parameters) {
      // body of method
    }

    type method2Name(parameters) {
      // body of method
    }
 }

 **/