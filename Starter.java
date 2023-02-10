import java.util.Scanner;

public class Starter {
    public static void main(String args[]) {
        // Variables and scanner
        Scanner keyboard = new Scanner(System.in);
        // Ask the user, "How high do you want to count?" and get their input
        System.out.println("How high do you want to count?");
        int input = keyboard.nextInt();
        keyboard.close();
        // Validate the input using a method
        
        // If the input is not valid, ask the user,
        // "That number is not valid. \nHow high do you want to count?"

        // Use a method to output the solution
       System.out.println(output(input));
    }

    // Create a method that validates the input and returns true if valid
    public static boolean valid(int input, Scanner keyboard)
    {
        int i = 0;
        while(i <= input)
        {
            if(input <= 0)
            {
                System.out.println("That number is not valid. \n" + "How high do you want to count?");
                return false;
            }
            else 
            {
                i++;
                return true;
            }
        }
        return true;
    }

    // Create a method that outputs the following for each number from 1
    // to whatever the user entered.
    public static int output(int input)
    {
        System.out.println(input);
        if(input % 5 == 0)
        {
            System.out.println("BAISD");
        }
        else if(input % 3 == 0)
        {
            System.out.println("is awesome!");
        }
        else if(input % 3 + input % 5 == 0 )
        {
            System.out.println("BAISD is awesome!");
        }
        return input;
    }

    // If the number is evenly divisible by 5, output, "BAISD "
    // If the number is evenly divisible by 3, output, "is awesome!"
    // If the number is evenly divisible by 3 and 5, output, "BAISD is awesome!"

}

// Ways to stand out:

// Use a second class and static methods for validation and output or

// Use an array to hold the numbers before printing them or

// Use an array in an object to hold the numbers and use instance methods to
// handle validation and output.
