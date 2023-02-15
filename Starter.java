import java.util.Scanner;

public class Starter {
    public static void main(String args[]) {
        // Variables and scanner
        Counter counter = new Counter();
        Scanner input = new Scanner(System.in);

        // Ask the user, "How high do you want to count?" and get their input
        System.out.print("How high do you want to count?: ");

        while (!input.hasNextInt()) {
            // Validate the input
            // If the input is not valid, ask the user,
            // "That number is not valid. How high do you want to count?"
                System.out.println("That number is not valid. \nHow high do you want to count?");
                input.next();
        }

        // Set the countTo variable in the Counter object
        counter.setCountTo(input.nextInt());

        // Close the scanner
        input.close();

        // Integer was validated
        // Print the numbers
        counter.printNumbers();
    }

    // Create a method that validates the input and returns true if valid

    // Create a method that outputs the following for each number from 1
    // to whatever the user entered.

    // If the number is evenly divisible by 5, output, "BAISD "
    // If the number is evenly divisible by 3, output, "is awesome!"
    // If the number is evenly divisible by 3 and 5, output, "BAISD is awesome!"

    private static class Counter {
        // Count to variable
        private int countTo;

        // Constructor
        public Counter() {
            countTo = 0;
        }

        // Setters
        public void setCountTo(int countTo) {
            this.countTo = countTo;
        }

        public void printNumbers() {
            // Print the numbers
            for (int i = 1; i <= countTo; i++) {
                // If the number is evenly divisible by 3 and 5, output, "BAISD is awesome!"
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("BAISD is awesome!");
                // If the number is evenly divisible by 3, output, "is awesome!"
                } else if (i % 3 == 0) {
                    System.out.println("is awesome!");
                // If the number is evenly divisible by 5, output, "BAISD "
                } else if (i % 5 == 0) {
                    System.out.println("BAISD");
                // Otherwise, output the number
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}