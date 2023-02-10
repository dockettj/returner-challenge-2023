import java.util.Scanner;


public class Starter {
    public static void main(String args[]) {
        // Variables and scanner
        String input = "";
        int inputInt = 0;
        boolean goodInput = true;
        Scanner s = new Scanner(System.in);
        
        // Ask the user, "How high do you want to count?" and get their input
        System.out.println("How high do you want to count?");
        input = s.nextLine();
        // Validate the input using a method
        goodInput = ValidCheck.valid(input);
        // If the input is not valid, ask the user,
        // "That number is not valid. \nHow high do you want to count?"
        while (goodInput == false)
        {
            System.out.println("That number is not valid. \nHow high do you want to count?");
            input = s.nextLine();
            goodInput = ValidCheck.valid(input);
        }
        // Use a method to output the solution
        inputInt = Integer.valueOf(input);
        outputMessage(inputInt);
    }

    // Create a method that validates the input and returns true if valid
    
    // I put it in a class

    // Create a method that outputs the following for each number from 1
    // to whatever the user entered.
    public static void outputMessage(int in)
    {
    // If the number is evenly divisible by 5, output, "BAISD "
    // If the number is evenly divisible by 3, output, "is awesome!"
    // If the number is evenly divisible by 3 and 5, output, "BAISD is awesome!"
        
        int[] count = new int[in];

        for (int i = 0; i < in; i++)
        {
            count[i] = i;
        }
        // I want to note that the for above is useless and there is an easier way 
        // to do this but if this is what you want i'll do it.

        for (int i = 0; i < in; i++)
        {
            if (count[i] % 5 == 0)
            {
                System.out.print("BAISD ");
            }
            if (count[i] % 3 == 0)
            {
                System.out.print("is awesome!");
            }
        }
           
    }
}

// Ways to stand out:

// Use a second class and static methods for validation and output or

// Use an array to hold the numbers before printing them or

// Use an array in an object to hold the numbers and use instance methods to
// handle validation and output.
