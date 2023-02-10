class ValidCheck
{
    public static boolean valid(String in)
    {   
        boolean valid = true;
        for (int i = 0; i < in.length(); i++)
        {
            if (!Character.isDigit(in.charAt(i)))
            {
                valid = false;
                return valid;
            }
        }
        return valid;
    }
}