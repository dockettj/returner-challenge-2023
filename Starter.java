
import java.util.Scanner;

import javax.management.modelmbean.ModelMBean;



public class Starter {
    public static void main(String args[]) {
        // Variables and scanner
        boolean count;
           Scanner keyboard = new Scanner(System.in);
        // Ask the user, "How high do you want to count?" and get their input
         System.out.println("How high do you want to count?");
            count = keyboard.nextBoolean();

        // Validate the input using a method  
        
        // If the input is not valid, ask the user,
        if (count) {

        // "That number is not valid. \nHow high do you want to count?"
          System.out.print("That number is not valid. \nHow high do you want to count");
        }
        // Use a method to output the solution
    
    }

    // Create a method that validates the input and returns true if valid
       public static void input(boolean count) {
        if (count) {
            return;
        }
       }
 
    // Create a method that outputs the following for each number from 1
    // to whatever the user entered.
    public static void outputs(Boolean count) {

    // If the number is evenly divisible by 5, output, "BAISD "
    if (count % 5){
        System.out.println("BAISD");
    }
    // If the number is evenly divisible by 3, output, "is awesome!"
    if (count % 3){
        System.out.println("is awesome!");
    }
    // If the number is evenly divisible by 3 and 5, output, "BAISD is awesome!"
    if (count % 3 && count % 5){
        System.out.println("BASID is awesome!");
    }
}

}

// Ways to stand out:

// Use a second class and static methods for validation and output or

// Use an array to hold the numbers before printing them or

// Use an array in an object to hold the numbers and use instance methods to
// handle validation and output.
