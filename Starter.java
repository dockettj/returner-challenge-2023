import java.util.Scanner;

public class Starter {
    public static void main(String args[]) {
        // Variables and scanner
        int input = 0;
        Scanner keyboard = new Scanner(System.in);

        // Ask the user, "How high do you want to count?" and get their input
        System.out.print("How high do you want to count? ");
        input = keyboard.nextInt();
        // Validate the input using a method
        //int lastStep = input;
        //boolean tof1 = false;
        //while (tof1 == false)
           // {
           //     tof1 = validator(keyboard, lastStep);
            //}
        // If the input is not valid, ask the user,
        // "That number is not valid. \nHow high do you want to count?"
            int i = 0;
            while (i < input)
                {
                    if ((i % 5) == 0)
                        {
                            System.out.print("BAISD ");
                        }
                    if ((i % 3) == 0)
                        {
                            System.out.print("is awesome!");
                        }
                    i++;
                }

        keyboard.close();


        // Use a method to output the solution
        //divisor(lastStep);
        System.exit(0);

    }


    // Create a method that validates the input and returns true if valid
   // public static boolean validator(Scanner keyboard, int lastStep)
     //   {
       //     boolean tof = false;
         //   if (lastStep < 0)
           //     {
             //       tof = false;
               //     System.out.print("That number is not valid. \nHow high do you want to count? ");
                 //   lastStep = keyboard.nextInt();
             //   }
           // else { tof = true; }

         //   return tof;
      //  }

 //   public static int translation(String input)
 //       {
           //        String a = "fine";
           // char[] b = a.toCharArray();
           // Character c = b[0];
           //       Character d = '1';
           // int e = Character.valueOf(d);
                    //this was an attempt to filter out non-number answers but I have just now realized
                    //it probably will just throw an error if something fails so I got rid of it
 //               char[] step1 = input.toCharArray();
 //               Character step2 = step1[0];
 //               int step3 = Character.valueOf(step2);
 //               return step3;
 //       }


    // Create a method that outputs the following for each number from 1
    // to whatever the user entered.
   // public static void divisor(int lastStep)
      //  {
            //first half; create array and expand until lastStep value has been reached, then input lastStep value
            // 0 = 0, 1 = 1,, i < lastStep, then last step is add lastStep in final bonus slot

            // I would have been done like an hour earlier if I could've remembered how to set array size...
            // unfortunately I didn't, so now it's just a ton of zeros with a side buckets-worth of praying that it works.
     //       int count[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
       //     int i;
       // for (i = 0; i < lastStep; i++);
         //   {
           //     count[i] = i;
           // }
      //  count[i] = lastStep;

            //second half; vvvvv
                //this part doesn't even work properly and I can't figure out why, it keeps displaying twice and only twice no matter
                //what I put in as lastStep :/
        //        for (i = 0; i < (count.length - 1); i++);
          //  {
            //    int hold = count[i];
    // If the number is evenly divisible by 5, output, "BAISD "
              //      if ((hold % 5) == 0)
                //        { System.out.print("BAISD ");}
                  //  else { //nothing 
                    //     }
    // If the number is evenly divisible by 3, output, "is awesome!"
                   // if ((hold % 3) == 0)
                   //     { System.out.print("is awesome!");}
                   // else { //nothing 
                    //     }
    // If the number is evenly divisible by 3 and 5, output, "BAISD is awesome!"
                   // if (((hold % 5) == 0) && ((hold % 3) == 0))
                    //    { System.out.print("BAISD is awesome!");}
                   // else { //nothing 
                     //    }
           // }

        //}

}

// Ways to stand out:

// Use a second class and static methods for validation and output or

// Use an array to hold the numbers before printing them or

// Use an array in an object to hold the numbers and use instance methods to
// handle validation and output.
