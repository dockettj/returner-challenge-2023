public class Validator {

    /**
    The static isValid method checks to make sure the user's input is valid. If it is not,
    it asks the user to ty again.
    @param inp The user's input
    @return true if the input is valid
     */
    public static boolean isValid(String inp)
    {
        boolean status = false;
          try{
            int count = Integer.parseInt(inp);
            if(count >= 1)
            {
                status = true;
            }
          } catch(Exception e)
          {
            System.out.println("Error. Input must be a whole number. Please restart the program and try again.");
            System.exit(0);
          }
          return status;
    }
}