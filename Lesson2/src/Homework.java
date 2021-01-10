public class Homework {
    public static void main(String args[]) {

        // Tests for isRacecar
        assert isRacecar(4, 13.0f, true) : "isRacecar reported false, but should have reported true";
        assert isRacecar(4, 12.0f, true) : "isRacecar reported false, but should have reported true";
        assert isRacecar(4, 7.0f, true) : "isRacecar reported false, but should have reported true";
        assert isRacecar(4, 1.0f, true) : "isRacecar reported false, but should have reported true";
        assert !isRacecar(4, 330.0f, true) : "isRacecar reported true, but should have reported false";
        assert !isRacecar(4, 0.0f, true) : "isRacecar reported true, but should have reported false";
        assert !isRacecar(4, -1.0f, true) : "isRacecar reported true, but should have reported false";
        assert !isRacecar(5, 13.0f, true) : "isRacecar reported true, but should have reported false";
        assert !isRacecar(3, 13.0f, true) : "isRacecar reported true, but should have reported false";
        assert !isRacecar(2, 13.0f, true) : "isRacecar reported true, but should have reported false";
        assert !isRacecar(1, 13.0f, true) : "isRacecar reported true, but should have reported false";
        assert !isRacecar(4, 13.0f, false) : "isRacecar reported true, but should have reported false";

        System.out.println("All tests have passed successfully. Congratulations!");
    }

    private static boolean isRacecar(int numWheels, double mpg, boolean isManual) {
        // TODO:
        //
        // Assume the following must be true for a given configuration of a vehicle
        //   to be considered a race car:
        //
        //   1) The vehicle must have exactly 4 wheels.
        //   2) The vehicle must get 13 mpg or less; race cars are inefficient AF! NOTE: This value can't be zero ornegative!
        //   3) The vechiel must be a manual.

        if (numWheels == 4 && mpg > 0 && mpg <= 13 && isManual == true) {
            return true;
        }
        return false;
    }
}