import java.security.InvalidParameterException;

public class Main {

    public static void main(String args[]) {

        class VehicleV1 {
            int passengers;     // number of passengers
            int fuelcap;        // fuel capacity in gallons
            int mpg;            // fuel consumption in miles per gallon


            int getRange() {
                return this.fuelcap * this.mpg;
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