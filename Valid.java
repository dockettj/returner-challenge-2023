public class Valid{
    // Create a method that validates the input and returns true if valid
    public static boolean isValid(Double count) {
        boolean valid = false;
        
        if(count > 1 && count < 100000000){
            valid = true;
        }
        return valid;
    } 
}