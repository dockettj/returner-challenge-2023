import java.util.Scanner;

public class Starter {
     private static String input ="";
     private static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]) {
        // Variables and scanner

        // Ask the user, "How high do you want to count?" and get their input
        
        System.out.println("How high do you want to count");
        input = keyboard.next();
        
        // Validate the input using a method
        //while (!isnumber(input) || validater(input)){
            while(!isnumber(input)){
            System.out.println("Please eneter a positive number.");
            input = keyboard.next();
            }
            while(!validater(input)){
                System.out.println("That number is not valid. \nHow high do you want to count?");
                input = keyboard.next();
            }
        //}
        
        
        // If the input is not valid, ask the user,
        // "That number is not valid. \nHow high do you want to count?"
        // Use a method to output the solution
        keyboard.close();
        System.out.println(output(Integer.parseInt(input)));
        System.exit(0);
    }

    // Create a method that validates the input and returns true if valid
    public static Boolean isnumber(String iinput){
        int number = 0;
        boolean isnum = true;
    try {
        number = Integer.parseInt(iinput);
    } catch (Exception e) {
        isnum = false;
    }
        
    return isnum;
    }

    public static Boolean validater(String iinput){
        boolean valid = false;
        int number;
        number = Integer.parseInt(iinput);
        if (number >= 0 ){
            valid = true;
        }
    return valid;
    }

    // Create a method that outputs the following for each number from 1
    public static String output(int iinput){
        // to whatever the user entered.
        String out="";
        // If the number is evenly divisible by 5, output, "BAISD "
        if(iinput%5 == 0){
            out = "BAISD ";
        }

        // If the number is evenly divisible by 3, output, "is awesome!"
        if(iinput%3 == 0){
            out = "is awesome!";
        }

        // If the number is evenly divisible by 3 and 5, output, "BAISD is awesome!"
        if(iinput%5 == 0 && iinput%3 ==0){
            out = "BAISD is awesome!";
        }
        if(iinput%5 != 0 && iinput%3 != 0){
            out = "you have not found the secret message";
        }
        
        return out;
        }
        public static void getNewInput(){
            
            System.out.println("please enter a number.");
            input = keyboard.next();
            isnumber(input);
        }
    }

// Ways to stand out:

// Use a second class and static methods for validation and output or

// Use an array to hold the numbers before printing them or

// Use an array in an object to hold the numbers and use instance methods to
// handle validation and output.
