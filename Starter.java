import java.util.Scanner;

public class Starter {
    /**
     * @param args
     */
    public static void main(String args[]) {
        // Variables and scanner
        Scanner keyboard = new Scanner(System.in);
        int number;
        String output = "";
        // Ask the user, "How high do you want to count?" and get their input
        System.out.println("How high do you want to count?");
        number = keyboard.nextInt();
        // Validate the input using a method
        // If the input is not valid, ask the user,

    
        // Use a method to output the solution
        int num = 1 * number;
        System.out.println(num);
        System.out.println(output);
        number++;
    

    // Create a method that validates the input and returns true if valid
    
    // Create a method that outputs the following for each number from 1
    // to whatever the user entered.
    number = parse.Boolean (number);
    while (number >= 1)
    {
        number == true;
        return;
    }

    // If the number is evenly divisible by 5, output, "BAISD "
    // If the number is evenly divisible by 3, output, "is awesome!"
    // If the number is evenly divisible by 3 and 5, output, "BAISD is awesome!"

    if (num%5 == 0)
    {
        output = "BAISD";
    }
    else if (num%3 == 0)
    {
        output = "is awesome!";
    }
    else if (num%3 == 0 && num%5 == 0)
    {
        output = "BAISD is awesome!";
    }
    else
    {
        num++;
    }

    keyboard.close();
}
}



// Ways to stand out:

// Use a second class and static methods for validation and output or

// Use an array to hold the numbers before printing them or

// Use an array in an object to hold the numbers and use instance methods to
// handle validation and output.
