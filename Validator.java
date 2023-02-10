public class Validator {

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
