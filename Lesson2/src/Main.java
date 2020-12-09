public class Main {
    public static void main(String args[]) {
        //variableDemo();
        //intAndDouble();
        //theIfStatement();
        //theforLoop();
        //BlockDemo();
        //Hypot();
        //CharArithDemo();
        //SingleQuoteEscape();
        //StringLiterals();
        //printEvenChars();
        //calculateCircleArea();
        //longToDouble();
        //longToDoubleFailCase();
        //castDemo();
        //typePromotionDemo();
        useCast();
    }

    private static void variableDemo() {
        int var1; //this declares a variable
        int var2; //this declares another variable
        var1 = 10; // this assigns 1024 to var1
        System.out.println("var1 contains" + var1);
        var2 = var1 / 2;
        System.out.print("var2 contains var1 / 2: ");
        System.out.println(var2);
    }

    private static void intAndDouble() {
        int var; // this declares an int variable
        double x; // this declares a floating-point variable
        var = 10; // assign var the value 10
        x = 10.0; // assign x the value 10.0
        System.out.println("Original value of var: " + var);
        System.out.println("Original value of x: " + x);
        System.out.println(); // print a blank line

        // now, divide both by 4
        var = var / 4;
        x = x / 4;
        System.out.println("var after division: " + var);
        System.out.println("x after division: " + x);
    }

    private static void theIfStatement() {
        int a, b, c;
        a = 2;
        b = 3;
        if(a < b) {
            System.out.println("a is less than b");
        }
        // this won't display anything
        if(a == b) {
            System.out.println("you won't see this");
        }
        System.out.println();
        c = a - b; // c contains -1
        System.out.println("c contains -1");
        if(c >= 0) {
            System.out.println("c is non-negative");
        }
        if(c < 0) {
            System.out.println("c is negative");
        }

        System.out.println();
        c = b - a; // c now contains 1
        System.out.println("c contains 1");
        if(c >= 0) {
            System.out.println("c is non-negative");
        }
        if(c < 0) {
            System.out.println("c is negative");
        }
    }

    private static void theforLoop() {
        for(int count = 0; count < 5; count++) {
            System.out.println("This is count: " + count);
        }
        System.out.println("Done!");
    };

    private static void BlockDemo() {
        double i, j, d;
        i = 5;
        j = 10;
        // the target of this if is a block
        if (i != 0) {
            System.out.println("i does not equal zero");
            d = j / i;
            System.out.println("j / i is " + d);
        }
    }

    private static void Hypot() {
        double x, y, z;
        x = 3;
        y = 4;
        z = Math.sqrt((x * x) + (y * y));
        System.out.println("Hypotenuse is " +z);
    }

    private static void CharArithDemo() {
        char ch;
        ch = 'X';
        System.out.println("ch contains " + ch);
        ch++; // increment ch
        System.out.println("ch is now " + ch);
        ch = 90; // give ch the value Z
        System.out.println("ch is now " + ch);
    }

    private static void SingleQuoteEscape() {
        char ch;
        ch = '\'';
        System.out.println(ch);
    }

    private static void StringLiterals () {
        System.out.println("First line\nSecond line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF") ;
    }

    /**
     * Print out all even characters from A to Z (uppercase only).
     */
    private static void printEvenChars() {
        for(int myChar = (int) 'A'; myChar < (int) 'Z'; myChar = myChar + 2) {
            System.out.println((char) myChar);
        }
    }

    /**
     * Calculate the area of a circle. HINT: Use the math library for PI.
     */
    private static void calculateCircleArea() {
        double radius = 4.0;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Circle Area = " + area);
    }

    private static double calculateAreaOfCirlce(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    private static void longToDouble() {
        long L;
        double D;
        L = 100123285L;
        D = L;
        System.out.println("L and D: " + L + " " + D);
    }

    /*private static void longToDoubleFailCase() {
        long L;
        double D;
        D = 100123285.0;
        L = D;
        System.out.println("L and D: " + L + " " + D);
    }*/

    private static void castDemo() {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;
        i = (int) (x / y); // cast double to int
        System.out.println("Integer outcome of x / y: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Value of b: " + b);

        i = 257;
        b = (byte) i;
        System.out.println("Value of b: " + b);

        b = 88; // ASCII code for X
        ch = (char) b;
        System.out.println("ch: " + ch);
    }

    private static void typePromotionDemo() {
        byte b;
        int i;

        b = 10;
        i = b * b; // OK, no cast needed
        b = 10;
        b = (byte) (b * b); // cast needed!!
        System.out.println("i and b: " + i + " " + b);
    }

    private static void useCast() {
        int i;
        for(i = 0; i < 5; i++) {
            System.out.println(i + " / 3: " + i / 3);
            System.out.println(i + " / 3 with fractions: "
                    + (double) i / 3);
            System.out.println();
        }
    }
}
