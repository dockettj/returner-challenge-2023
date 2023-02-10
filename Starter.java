import java.util.Scanner;

public class Starter {
    public static void main(String args[]) {

        //int count = 1;
        String input;

        // Variables and scanner
        Scanner keyboard = new Scanner(System.in);

        // Ask the user, "How high do you want to count?" and get their input
        System.out.println("How high do you want to count?");
        input = keyboard.nextLine();

        // Validate the input using a method
        //Used a loop in conjunction with the isValid method to achieve this.
        while(!Validator.isValid(input))
        {
        // If the input is not valid, ask the user,
        // "That number is not valid. \nHow high do you want to count?"
            System.out.println("That number is not valid. \nHow high to you want to count?");
            input = keyboard.nextLine();
        }
        keyboard.close();

        // Use a method to output the solution
        int count = Integer.parseInt(input);
        output(count);

        System.exit(0);
    }

    // Create a method that validates the input and returns true if valid



    //If I were to do this, it would look as follows:
    /**
    The isValid method checks to make sure the user's input is valid. If it is not,
    it asks the user to ty again.
    @param inp The user's input
    @return true if the input is valid
     */
     //   public static boolean isValid(String inp)
     //   {
     //       boolean status = false;
     //         try{
     //           int count = Integer.parseInt(inp);
     //           if(count >= 1)
     //           {
     //               status = true;
     //           }
     //         } catch(Exception e)
     //         {
     //           System.out.println("Error. Input must be a whole number. Please restart the program and try again.");
     //           System.exit(0);
     //         }
     //         return status;
     //   }




    // Create a method that outputs the following for each number from 1
    // to whatever the user entered.

    /**
    The output method displays the desired output based on the user's input.
    @param cou
    */
    public static void output(int cou)
    {
        String[] numbers = new String[cou];
        int index = 0;
        while(index < cou)
        {
            // If the number is evenly divisible by 5, output, "BAISD "
            if(index%5 == 0 && index%3 != 0)
            {
                numbers[index] = "BAISD ";
            }

            // If the number is evenly divisible by 3, output, "is awesome!"
            else if(index%3 == 0 && index%5 != 0)
            {
               numbers[index] = "is awesome!";
            }

            // If the number is evenly divisible by 3 and 5, output, "BAISD is awesome!"
            else if(index%3 == 0 && index%5 == 0)
            {
                numbers[index] = "BAISD is awesome!";
            }
            else numbers[index] = Integer.toString((index));
            System.out.println(numbers[index]);
            index++;
        }

        //for(int i = 0; i < cou; i++)
        //{
        //   System.out.println(numbers[i]);
        //}
    }
}




// Ways to stand out:

// Use a second class and static methods for validation and output or           sure

// Use an array to hold the numbers before printing them or                     okay

// Use an array in an object to hold the numbers and use instance methods to
// handle validation and output.                                                nah