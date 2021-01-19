public class Homework {
    public static void main(String args[]) {

        // Tests for isEven
        assert !isEven(1) : "isEven reported true, but number was 1";
        assert isEven(2) : "isEven reported false, but number was 2";
        assert !isEven(-4619) : "isEven reported true, but number was -4619";
        assert isEven(1907132) : "isEven reported false, but number was 1907132";
        assert isEven(0) : "isEven reported false, but number was 0";

        // Test for isLowercaseLetter
        assert isLowercaseLetter('a') : "isLowercaseLetter reported false, but character was 'a'";
        assert isLowercaseLetter('c') : "isLowercaseLetter reported false, but character was 'c'";
        assert isLowercaseLetter('z') : "isLowercaseLetter reported false, but character was 'z'";
        assert !isLowercaseLetter('{') : "isLowercaseLetter reported true, but character was '{'";
        assert !isLowercaseLetter('A') : "isLowercaseLetter reported true, but character was 'A'";
        assert !isLowercaseLetter('%') : "isLowercaseLetter reported true, but character was '%'";

        // Test for dayOfWeek
        assert dayOfWeek(1) == "Monday" : "dayOfWeek returned a value other than Monday";
        assert dayOfWeek(2) == "Tuesday" : "dayOfWeek returned a value other than Tuesday";
        assert dayOfWeek(3) == "Wednesday" : "dayOfWeek returned a value other than Wednesday";
        assert dayOfWeek(4) == "Thursday" : "dayOfWeek returned a value other than Thursday";
        assert dayOfWeek(5) == "Friday" : "dayOfWeek returned a value other than Friday";
        assert dayOfWeek(6) == "Saturday" : "dayOfWeek returned a value other than Saturday";
        assert dayOfWeek(7) == "Sunday" : "dayOfWeek returned a value other than Sunday";
        assert dayOfWeek(8) == "Invalid" : "dayOfWeek returned a value other than Invalid";
        assert dayOfWeek(-1) == "Invalid" : "dayOfWeek returned a value other than Invalid";
        assert dayOfWeek(0) == "Invalid" : "dayOfWeek returned a value other than Invalid";

        printWarmTemperaturesInCelsius();
        printTenToZeroButOnlyEvenNumber();

        System.out.println("All tests have passed successfully. Congratulations!");
    }

    private static boolean isEven(int number) {
        // TODO: Use an if check. HINT: Remember the modulus operator, and think about
        //       how this might help you solve this more easily.
        return false;
    }

    private static boolean isLowercaseLetter(char character) {
        // TODO: Use an If-Else-If Ladder to show maximum understanding.
        return false;
    }

    private static String dayOfWeek(int day) {
        // TODO: Use a switch statement to return the name of the day.
        //       Assume the first day of the week in 1.
        //       Assume the day should be capitalized, e.g. "Monday"
        //       If an invalid day is provided, the return value should be "Invalid"
        return "";
    }

    private static void printWarmTemperaturesInCelsius() {
        // TODO: Use a while loop to print temperatures from 25 degrees Celsius
        //       down to 20 degree Celsius.
        //       Output should be as follows:
        //         "Temperature is <temp> degrees Celsius"
        //         e.g. "Temperature is 20 degree Celsius"
        //       NOTE: Watch out for infinite loops! You'll need to update
        //             your control variable effectively. If you have an infinite
        //             loop, press Ctrl+C to exit.
    }

    private static void printTenToZeroButOnlyEvenNumber() {
        // TODO: Use a for loop to count from 10 down to 0, printing
        //       only even numbers to the screen.
        //       NOTE: The control value MUST count down by 1.
        //       HINT: Use the continue keyword to skip values that shouldn't
        //             be printed.
    }

    /*
        Analyze the following for loop and describe what the output will be.

        for (char Ch = ’Z’ ; Ch >= ’A’ ; --Ch) {
            if ((Ch == ’A’) || (Ch == ’E’) || (Ch == ’I’) ||
                (Ch == ’O’) || (Ch == ’U’)) {
                System.out.println(Ch + " is a vowel.");
            } else {
                System.out.println(Ch + " is a consonant.");
            }
        }

        Add your answer below here, within the comment block.
        ------------------------------------------------------
     */
}