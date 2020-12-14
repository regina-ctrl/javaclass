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
}