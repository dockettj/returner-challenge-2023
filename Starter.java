import java.util.Scanner;

public class Starter {
    public static void main(String args[]) {
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
            Scanner ahhh = new Scanner(System.in);
            System.out.println("That number is not valid. \nHow high do you want to count?");
            userin = ahhh.nextInt();
            // Use a method to output the solution

            
            // Create a method that validates the input and returns true if valid
           
            
            
            
            // Create a method that outputs the following for each number from 1
            // to whatever the user entered.
            
            
        
        // If the number is evenly divisible by 5, output, "BAISD "
        // If the number is evenly divisible by 3, output, "is awesome!"
        // If the number is evenly divisible by 3 and 5, output, "BAISD is awesome!"5

}
  // okay so im not 100% sure what went wrong with my attempt at methods but im going to put my idea here and so I was going to do my validator method and have it check to see if 
  //it was an int if naything else it would go for false then i was going to make a method for the outputting of info to check if the stuff was divisable using the module% 
  //right now what I have will atleast run I got caught up with my methods not being recognized as methods and all train of thought went poof

// what i had writen before i made it atleast run 
//  private static boolean inValidator(userin) {
    // boolean status = false; 
   // int num = 0;
   // if(){
    //    status = true;
    //    return status; 
   // }
//}     
//private static int outPuts(num) {
    //for ()
    //if (num/5) {
    //    System.out.println("BAISD");
  //  } else if(num/3){
 //       System.out.println("is awesome!");
 //   }else if(num/3 && num/5){
 //       System.out.println("BAISD is awesome!");
  //  }
}

// Ways to stand out:

// Use a second class and static methods for validation and output or

// Use an array to hold the numbers before printing them or

// Use an array in an object to hold the numbers and use instance methods to
// handle validation and output.
