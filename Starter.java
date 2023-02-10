import java.util.Scanner;

public class Starter {
    public static int main(String args[]) {
        // Variables and scanner
         int userin = 0; 
        Scanner keyboard = new Scanner(System.in); 
        // Ask the user, "How high do you want to count?" and get their input
        System.out.println("How high do you want to count?");
         userin = keyboard.nextInt();
         keyboard.close();
         // Validate the input using a method
        
            // If the input is not valid, ask the user,
            // "That number is not valid. \nHow high do you want to count?"
        final void idek(int userin) {
            Scanner ahhh = new Scanner(System.in);
            System.out.println("That number is not valid. \nHow high do you want to count?");
            userin = ahhh.nextInt();
        }
            // Use a method to output the solution
    

    // Create a method that validates the input and returns true if valid
     final boolean inValidator(int userin) {
        boolean status = true; 
         int num = 0;
         if(num == 25 || num == 15){
             num = userin;
             return status; 
            }
        }
        
        
        // Create a method that outputs the following for each number from 1
        // to whatever the user entered.
        final static String outputs(int num){
        for ()
            if (num/5) {
                System.out.println("BAISD");
            } else if(num/3){
                System.out.println("is awesome!");
            }else if(num/3 && num/5){
                System.out.println("BAISD is awesome!");
            }
            
        }
        // If the number is evenly divisible by 5, output, "BAISD "
        // If the number is evenly divisible by 3, output, "is awesome!"
        // If the number is evenly divisible by 3 and 5, output, "BAISD is awesome!"
        
    }      

}

// Ways to stand out:

// Use a second class and static methods for validation and output or

// Use an array to hold the numbers before printing them or

// Use an array in an object to hold the numbers and use instance methods to
// handle validation and output.
