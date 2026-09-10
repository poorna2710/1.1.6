/*
I tested it with 6 different numbers to make sure it works every time.
*/
public class NumbersRiddle {

    public static void main(String[] args) {

        // Test Case 1: Positive Integer
        int startingNumberOne = 8;
        System.out.println("Test Case 1: Positive Integer");
        System.out.println("I chose the number: " + startingNumberOne);

        double doubledOne = startingNumberOne * 2; // double it
        System.out.println("Doubled: " + doubledOne);

        doubledOne += 6; // add 6
        System.out.println("After adding 6: " + doubledOne);

        doubledOne /= 2; // divide in half
        System.out.println("Divided in half: " + doubledOne);

        double resultOne = doubledOne - startingNumberOne; // subtract original number
        System.out.println("After subtracting the original number: " + resultOne);
        System.out.println();


        // Test Case 2: Negative Integer
        int startingNumberTwo = -8;
        System.out.println("Test Case 2: Negative Integer");
        System.out.println("I chose the number: " + startingNumberTwo);

        double doubledTwo = startingNumberTwo * 2;
        System.out.println("Doubled: " + doubledTwo);

        doubledTwo += 6;
        System.out.println("After adding 6: " + doubledTwo);

        doubledTwo /= 2;
        System.out.println("Divided in half: " + doubledTwo);

        double resultTwo = doubledTwo - startingNumberTwo;
        System.out.println("After subtracting the original number: " + resultTwo);
        System.out.println();


        // Test Case 3: Zero
        int startingNumberThree = 0;
        System.out.println("Test Case 3: Zero");
        System.out.println("I chose the number: " + startingNumberThree);

        double doubledThree = startingNumberThree * 2;
        System.out.println("Doubled: " + doubledThree);

        doubledThree += 6;
        System.out.println("After adding 6: " + doubledThree);

        doubledThree /= 2;
        System.out.println("Divided in half: " + doubledThree);

        double resultThree = doubledThree - startingNumberThree;
        System.out.println("After subtracting the original number: " + resultThree);
        System.out.println();


        // Test Case 4: One
        int startingNumberFour = 1;
        System.out.println("Test Case 4: One");
        System.out.println("I chose the number: " + startingNumberFour);

        double doubledFour = startingNumberFour * 2;
        System.out.println("Doubled: " + doubledFour);

        doubledFour += 6;
        System.out.println("After adding 6: " + doubledFour);

        doubledFour /= 2;
        System.out.println("Divided in half: " + doubledFour);

        double resultFour = doubledFour - startingNumberFour;
        System.out.println("After subtracting the original number: " + resultFour);
        System.out.println();


        // Test Case 5: Positive Double
        double startingNumberFive = 8.5;
        System.out.println("Test Case 5: Positive Double");
        System.out.println("I chose the number: " + startingNumberFive);

        double doubledFive = startingNumberFive * 2;
        System.out.println("Doubled: " + doubledFive);

        doubledFive += 6;
        System.out.println("After adding 6: " + doubledFive);

        doubledFive /= 2;
        System.out.println("Divided in half: " + doubledFive);

        double resultFive = doubledFive - startingNumberFive;
        System.out.println("After subtracting the original number: " + resultFive);
        System.out.println();


        // Test Case 6: Negative Double
        double startingNumberSix = -8.5;
        System.out.println("Test Case 6: Negative Double");
        System.out.println("I chose the number: " + startingNumberSix);

        double doubledSix = startingNumberSix * 2;
        System.out.println("Doubled: " + doubledSix);

        doubledSix += 6;
        System.out.println("After adding 6: " + doubledSix);

        doubledSix /= 2;
        System.out.println("Divided in half: " + doubledSix);

        double resultSix = doubledSix - startingNumberSix;
        System.out.println("After subtracting the original number: " + resultSix);
        System.out.print("Final Result = " + resultSix); // last line, no extra blank line after
    }
}