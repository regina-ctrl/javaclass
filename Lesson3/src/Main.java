public class Main {
    public static void main(String args[]) throws java.io.IOException{
       // keyBoardInput();
        // guessLetterGame1 ();
        //guessLetterGame3();
        //ifElseladder();
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
}
