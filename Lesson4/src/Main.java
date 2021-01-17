import java.security.InvalidParameterException;

public class Main {

    public static void main(String args[]) {

        class VehicleV1 {
            int passengers;     // number of passengers
            int fuelcap;        // fuel capacity in gallons
            int mpg;            // fuel consumption in miles per gallon
        }

        VehicleV1 myVehicle = new VehicleV1();
        myVehicle.fuelcap = 16;
        myVehicle.mpg = 10;
        myVehicle.passengers = 10;
        System.out.println(String.format("Passengers: [%d], MPG: [%d], Fuel Capacity: [%d]",
                myVehicle.passengers, myVehicle.mpg, myVehicle.fuelcap));
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