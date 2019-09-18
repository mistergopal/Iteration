public class Loops {
    public static void main(String[] args) {
        // casting: to convert variables between data types

//        int j = (int) (5.0 / 2.0);
//        System.out.println(j);
//
//        // other methods of casting: declaring a new variable of a different data type
//        // set it equal to the value of a previous variable
//
//        int original = 6;
//        double copy = original;
//
//        System.out.println(copy);

        // casting does not work in the direction of floating point to whole value

        double firstNumber = 7.0;
//        int copyOfDouble = firstNumber;

        // automatically, whole values are interpreted as integers

        // change value of variables in shorthand

//        original = original + 1;
//        System.out.println(original);
//
//        // shorthand version
//
//        original += 1; // means original = original + 1
//        original++;    // also means original = original + 1
//
//        original--;     // means original - 1
//
//        original += 10; // original = original + 10
//
//        original *= 5;  // original = original * 5
//
//        original /= 2;   // original = original / 2
//
//        // iteration: fancy word for looping a process
//        // for(starting condition; condition that must be true; condition of change)
//        for(int i = 0; i < 10; i++) {
//            System.out.println("I am " + i + " years old");
//        }

        // In 2 loops, print the following pattern:
//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *

//        for(int patternOne = 1; patternOne <= 10000; patternOne *= 10) {
//            System.out.println(patternOne);
//        }
//        for(int patternTwo = 1000; patternTwo >= 1; patternTwo /= 10) {
//            System.out.println(patternTwo);
//        }
//
//
        for (int i = 1; i < 10; i++) {
            if (i < 6) {
                System.out.println("*".repeat(i));
            } else {
                System.out.println("*".repeat(10-i));
            }
        }

        // for loop: count down from 101 to 0. print every perfect square.
        // math.sqrt() ---> square root function.
        // ?: how to tell that this is equal to the integer value of the square root.

        System.out.println(Math.sqrt(21));





    }
}
