import java.util.Scanner;

public class Starter {
    public static void main(String args[]){
        // Variables and scanner
        Scanner keyboard = new Scanner(System.in);
        Double count;
        // Ask the user, "How high do you want to count?" and get their input
        System.out.println("How high do you want the count?");
        
        count = keyboard.nextDouble();

        // Validate the input using a method

        if(Valid.isValid(count) == false){
        // If the input is not valid, ask the user,
        // "That number is not valid. \nHow high do you want to count?"
            System.out.println("That number is not valid. \nHow high do you want to count?");
            
            count = keyboard.nextDouble();
            
            keyboard.close();
        }
        // Use a method to output the solution
        // decison structure between something in the IF statement 
        //need modulous %
        double num = 0;
       
        if(num == count % 5)
            System.out.println("BAISD");
        if(num == count % 3){
            System.out.println("is awesome!");}
        if(num == count % 3 && num == count % 5){
            System.out.println("BAISD is awesome!");}
       
    }
    //I just can't figure out how to get it to output in the chartlike structure but it can work if the number is divisible 
    // by 5 or 3
    // If the number is evenly divisible by 5, output, "BAISD "
       
    // If the number is evenly divisible by 3, output, "is awesome!"
       
    // If the number is evenly divisible by 3 and 5, output, "BAISD is awesome!"
   
}

// Ways to stand out:

// Use a second class and static methods for validation and output or

// Use an array to hold the numbers before printing them or

// Use an array in an object to hold the numbers and use instance methods to
// handle validation and output.
