import java.util.Scanner;

public class Starter {
    public static void main(String args[]) {
        // Variables and scanner
        Scanner keyboard = new Scanner(System.in);
        int input;
        // Ask the user, "How high do you want to count?" and get their input
        System.out.println("How high do you want to count?");
            input = keyboard.nextInt();
        // Validate the input using a method
        Validate(input, keyboard);
        // If the input is not valid, ask the user,
        // "That number is not valid. \nHow high do you want to count?"

        // Use a method to output the solution
        Output(input);

        keyboard.close();
    }

    // Create a method that validates the input and returns true if valid
        public static Integer Validate(int input, Scanner keyboard){
            if(input < 1){
                System.out.println("That number is not valid. \nHow high do you want to count?");
                input = keyboard.nextInt();
            }
            return input;
        }
    // Create a method that outputs the following for each number from 1
    // to whatever the user entered.
       public static void Output(int input){
    
    int i = 1;
    int divideFive = 5;
    int divideThree = 3;
    if (input >= i){
        // If the number is evenly divisible by 5, output, "BAISD "
        if (i % 5 == true)        
        {
            System.out.println("BAISD ");
            i++;
        }
   
        // If the number is evenly divisible by 3, output, "is awesome!"
        else if (i % 3 == true){
            System.out.println("is awesome!");
            i++;
        }
    
        // If the number is evenly divisible by 3 and 5, output, "BAISD is awesome!"
        else if (i % 5 == true && i % 3 == true){
            System.out.println("BAISD is awesome!");
            i++;
        }
        else{
            System.out.println();
            i++;
        }
       }

    }
}

    
// Ways to stand out:

// Use a second class and static methods for validation and output or

// Use an array to hold the numbers before printing them or

// Use an array in an object to hold the numbers and use instance methods to
// handle validation and output.
