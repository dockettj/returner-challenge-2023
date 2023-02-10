public class Validator {

    /**
     * 
     * @param innum the input as a string
     * @return if the number is a positive integer
     */
    public static boolean Validator(String innum){
        boolean valid = true;
        for (int i = 0; i < innum.length(); i++) {
            if (!Character.isDigit(innum.charAt(i))) {
                valid = false;
            }
        }
        return valid;
    }
}
