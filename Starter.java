import java.util.Scanner;

public class Starter {
    public static void main(String args[]) {
        // Variables and scanner
        Scanner keyboard = new Scanner(System.in);
        String userinput;
        Numbers numbers;

        // Ask the user, "How high do you want to count?" and get their input
        System.out.println("How high do you want to count?");
        userinput = keyboard.next();
        // Validate the input using a method
        while (!Validator.Validator(userinput)) {
            // If the input is not valid, ask the user,
            // "That number is not valid. \nHow high do you want to count?"
            System.out.println("That number is not valid. \nHow high do you want to count?");
            userinput = keyboard.next();
        } 
        numbers = new Numbers(Integer.parseInt(userinput));
        // Use a method to output the solution
        numbers.output();

        // close scanner - Erik
        keyboard.close();
    }

    // Create a method that validates the input and returns true if valid - class

    // Create a method that outputs the following for each number from 1
    // to whatever the user entered.
    public static void output(double num){
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
            
            if (i%5 == 0 && i%3 == 0) {
                // If the number is evenly divisible by 3 and 5, output, "BAISD is awesome!"
                System.out.println("BAISD is awesome!");
            } else if (i%5 == 0) {
                // If the number is evenly divisible by 5, output, "BAISD "
                System.out.println("BAISD ");
            } else if(i%3 == 0){
                // If the number is evenly divisible by 3, output, "is awesome!"
                System.out.println("is awesome!");
            }
        }
    }
}



    // Ways to stand out:
    
// Use a second class and static methods for validation and output or - done

// Use an array to hold the numbers before printing them or

// Use an array in an object to hold the numbers and use instance methods to
// handle validation and output.
