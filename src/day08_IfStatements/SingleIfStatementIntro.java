package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number = 300;


     /*
        System.out.println("Odd Number");
        System.out.println("Even Number");
        */

        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = number % 2 != 0; // not even number
        if (evenNumber) { // false
            System.out.println(number + "is even number");

        }

        if (oddNumber) { // true
            System.out.println(number + " is odd number");


        }
        int n = 200;

// positive
        if (n > 0) {
            System.out.println(n + " is positive");
        }
    // negative
        if (n < 0) { // if n is less than zero, then it's negative
            System.out.println(n+ "is negative");
        }
   // zero
        if ( n ==0) {
            System.out.println(n + "is zero");
        }







    }


}
