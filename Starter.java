import java.util.Scanner;

public class Starter 
{
    public static void main(String args[]) 
    {
        // Variables and scanner
            Scanner keyboard = new Scanner(System.in);
            int countHigh;
        // Ask the user, "How high do you want to count?" and get their input
            System.out.println("How high do you want to count?");
            countHigh = keyboard.nextInt();
            keyboard.close();
            Validator(countHigh);
    }
        // Validate the input using a method
            public static void Validator(int inCountHigh)
            {
            Scanner keyboard = new Scanner(System.in);
        // If the input is not valid, ask the user,
            if(inCountHigh <= 0)
        // "That number is not valid. \nHow high do you want to count?"
                {
                    System.out.println("That number is not valid. \nHow high do you want to count?");
                    int countHigh = keyboard.nextInt();
                    keyboard.close();

                }
            countOutput(inCountHigh);
            }
             
        // Use a method to output the solution
            public int Output(int countHigh)
            {
                valInput(countHigh);
                return countHigh;
            }
    

    // Create a method that validates the input and returns true if valid
        public boolean valInput(int x)
        {
        boolean bool = false;
            if(x > 0)
            {
                bool = true;
            }

            countOutput(x);
            return bool;
        }
    // Create a method that outputs the following for each number from 1
        public static void countOutput(int divis)
    // to whatever the user entered.
        {
    // If the number is evenly divisible by 5, output, "BAISD "
            if(divis % 5 == .0)
            {
                System.out.println("BAISD");
                
            }
    // If the number is evenly divisible by 3, output, "is awesome!"
            if(divis % 3 == .0)
            {
                System.out.println("is awesome!");
            }
    // If the number is evenly divisible by 3 and 5, output, "BAISD is awesome!"
            if(divis % 5 == .0 && divis % 3 == .0)
            {
                System.out.println("BAISD is awesome!");
            }
        }
}

// Ways to stand out:

// Use a second class and static methods for validation and output or

// Use an array to hold the numbers before printing them or

// Use an array in an object to hold the numbers and use instance methods to
// handle validation and output.
