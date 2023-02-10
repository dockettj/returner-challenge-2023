import java.util.Scanner;

public class Starter {
    public static void main(String args[]) {
        // Variables and scanner
        Scanner scan = new Scanner(System.in);
        int count=0;
        // Ask the user, "How high do you want to count?" and get their input
        System.out.print("How high do you want to count?");
        count = scan.nextInt();
        // Validate the input using a method
        
        // If the input is not valid, ask the user,
        // "That number is not valid. \nHow high do you want to count?"
        while(valid(count) == false){
            System.out.print("That number is not valid. \nHow high do you want to count?");
            count = scan.nextInt();
        }
        // Use a method to output the solution
        output(count);
}
    // Create a method that validates the input and returns true if valid
    public static boolean valid(int count){
        boolean status=false;
        if(count/1==count){
            status=true;
        }
        else if(count/1!=count){
            status=false;
        }
        
        return status;
    }
        
    
    // Create a method that outputs the following for each number from 1
    // to whatever the user entered.
    public static void output(int count){
        
        for(int i=0; count%3!=i; i++ ){
            System.out.println("is awesome!");
        }
        for(int i=0; count%5!=i; i++ ){
            System.out.println("BAISD ");
        }
        for(int i=0; count%5!=i && count%3!=i; i++ ){
            System.out.println("BAISD is awesome!");
        }
        
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
