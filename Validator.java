public class Validator {


    public static boolean validater(int numberInput){
        if(numberInput >= 1){
            return true;
        }else{
            return false;
        }
    }

    public static void output(int numberInput){
        double[] numberInputArrayDouble = new double[numberInput + 1];
        int[] numberInputArrayInt = new int[numberInput + 1];

        String output = "";

        for (int i = 1 ; i != (numberInput + 1)  ; i++){
            numberInputArrayDouble[i] = numberInput - (numberInput - i);
            numberInputArrayInt[i] = numberInput - (numberInput - i);

            if(numberInputArrayDouble[i]/3 == numberInputArrayInt[i]/3){
                output = "is awesome!";
            }

            if(numberInputArrayDouble[i]/5 == numberInputArrayInt[i]/5){
                output = "BAISD";
            }

            if(numberInputArrayDouble[i]/3 == numberInputArrayInt[i]/3 && numberInputArrayDouble[i]/5 == numberInputArrayInt[i]/5){
                output = "BAISD is awesome!";
            }

            if(numberInputArrayDouble[i]/3 != numberInputArrayInt[i]/3 && numberInputArrayDouble[i]/5 != numberInputArrayInt[i]/5){
                output  = "" + (numberInputArrayInt[i]);
            } 

            System.out.println(output);
        } 
    }
    
}
