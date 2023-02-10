import java.util.Scanner;

public class Starter {
    public static void main(String args[]) {
        // Variables and scanner
        Scanner keyboard = new Scanner(System.in);
        int number;
        // Ask the user, "How high do you want to count?" and get their input
        System.out.println("How high do you want to count?");
        number = keyboard.nextInt();
        // Validate the input using a method
        // If the input is not valid, ask the user,
            if (number > 15 || number < 1)
            {
                System.out.println("That number is not valid. \nHow high do you want to count?");
                return;
            }

        // Use a method to output the solution
    }

    // Create a method that validates the input and returns true if valid
    
    // Create a method that outputs the following for each number from 1
    // to whatever the user entered.
    public array number[];
    {
        String[] number;
        number[1] = "1";
        number[2] = "2";
        String output;
        number[3] = output;
        number[4] = "4";
        number[5] = output;
        number[6] = output;
        number[7] = "7";
        number[8] = "8";
        number[9] = output;
        number[10] = output;
        number[11] = "11";
        number[12] = output;
        number[13] = "13";
        number[14] = "14";
        number[15] = output;
    }


    // If the number is evenly divisible by 5, output, "BAISD "
    // If the number is evenly divisible by 3, output, "is awesome!"
    // If the number is evenly divisible by 3 and 5, output, "BAISD is awesome!"
    if (number/5)
    {
        String output = "BAISD";
    }
    
    if (number/3)
    {
        String output = "is awesome!";
    }

    if (number/3 && number/5)
    {
        String output = "BAISD is awesome!";
    }

}
}


// Ways to stand out:

// Use a second class and static methods for validation and output or

// Use an array to hold the numbers before printing them or

// Use an array in an object to hold the numbers and use instance methods to
// handle validation and output.
