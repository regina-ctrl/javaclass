public class Main {
    public static void main(String args[]) throws java.io.IOException{
       // keyBoardInput();
        // guessLetterGame1 ();
        //guessLetterGame3();
        //ifElseladder();
        //switchDemo ();
        //switchNoBreak ();
        //sqrRoot();
        //decreasingForLoop();
        //commaForLoop();
        sInputForTest();
    }

    private static void keyBoardInput() throws java.io.IOException {
        char ch;
        System.out.print("Press a key followed by ENTER: ");
        ch = (char) System.in.read(); // get a char
        System.out.println("Your key is: " + ch);
    }

    public static void guessLetterGame1() throws java.io.IOException {
        char ch, answer = 'K';
        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it: ");
        ch = (char) System.in.read(); // read a char from the keyboard
        if (ch == answer) {
            System.out.println("** Right **");
        } else {
            System.out.println("** Wrong **");
        }
    }

    public static void guessLetterGame3() throws java.io.IOException {
        char ch, answer = 'K';
        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it: ");
        ch = (char) System.in.read(); // get a char
        if(ch == answer) {
            System.out.println("** Right **");
        } else {
            System.out.print("...Sorry, you're ");
            // a nested if
            if(ch < answer) {
                System.out.println("too low");
            } else {
                System.out.println("too high");
            }
        }
    }

    public static void ifElseladder() {
        int x;
        for(x=0; x<6; x++) {
            if(x==1) {
                System.out.println("x is one");
            } else if(x==2) {
                System.out.println("x is two");
            } else if(x==3) {
                System.out.println("x is three");
            } else if(x==4) {
                System.out.println("x is four");
            } else {
                System.out.println("x is not between 1 and 4");
            }
        }
    }

    public static void switchDemo() {
        int i;
        for(i=0; i<10; i++) {
            switch (i) {
                case 0:
                    System.out.println("i is zero");
                    break;
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is two");
                    break;
                case 3:
                    System.out.println("i is three");
                    break;
                case 4:
                    System.out.println("i is four");
                    break;
                default:
                    System.out.println("i is five or more");
            }
        }
    }

    public static void switchNoBreak() {
        int i;
        for(i=0; i<=5; i++) {
            switch(i) {
                case 0:
                    System.out.println("i is less than one");
                case 1:
                    System.out.println("i is less than two");
                case 2:
                    System.out.println("i is less than three");
                case 3:
                    System.out.println("i is less than four");
                case 4:
                    System.out.println("i is less than five");
            }
            System.out.println();
        }
    }

    public static void sqrRoot() {
        double num, sroot, rerr;
        for(num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Square root of " + num +
            " is " + sroot);
            // compute rounding error
            rerr = num - (sroot * sroot);
            System.out.println("Rounding error is " + rerr);
            System.out.println();
        }
    }

    public static void decreasingForLoop() {
        int x;
        for(x = 100; x > -100; x -= 5)
            System.out.println(x);
    }

    public static void commaForLoop() {
        int i, j;
        for(i=0, j=10; i < j; i++, j--) {
            System.out.println("i and j: " + i + " " + j);
        }
    }

    public static void sInputForTest() throws java.io.IOException {
        int i;
        System.out.println("Press S to stop.");
        for(i = 0; (char) System.in.read() != 'S'; i++) {
            System.out.println("Pass #" + i);
        }
    }
}
