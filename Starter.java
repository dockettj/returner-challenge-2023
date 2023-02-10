import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.type.ArrayType;
//misunderstood, too late to redo.
public class Starter {
    public static void main(String args[]) {
        int input;
        int tf;
        Scanner kbd=new Scanner(System.in);
        System.out.println("How high do you want to count?");
        input=kbd.nextInt();
        input=valitation1(input, kbd);
        tf=validation2(input);
        if(tf==1){
            for(int i=0; i<=input;i++){
                if(i==1){
                    System.out.println("1");
                }
                if(i==2){
                    System.out.println("2");
                }
                if(i==3){
                    System.out.println("is awsome");
                }
                if(i==4){
                    System.out.println("4");
                }
                if(i==5){
                    System.out.println("BAISD");
                }
                if(i==6){
                    System.out.println("is awsome");
                }
                if(i==7){
                    System.out.println("7");
                }
                if(i==8){
                    System.out.println("8");
                }
                if(i==9){
                    System.out.println("is awsome");
                }
                if(i==10){
                    System.out.println("BAISD");
                }
                if(i==11){
                    System.out.println("11");
                }
                if(i==12){
                    System.out.println("is awsome");
                }
                if(i==13){
                    System.out.println("13");
                }
                if(i==14){
                    System.out.println("14");
                }
                if(i==15){
                    System.out.println("BAISD is awsome");
                }
            }
        }
        kbd.close();
        System.exit(0);
    }
    public static int valitation1(int input, Scanner kbd){
        if(input<1 || input>15){
            System.out.println("That number is not valid. \nHow high do you want to count?");
            input=kbd.nextInt();
        }
        return input;
    }
    public static int validation2(int input){
        int tf=0;
        if(input>=1 && input<=15){
            tf=1;
        }
        return tf;
    }
}

// Ways to stand out:

// Use a second class and static methods for validation and output or

// Use an array to hold the numbers before printing them or

// Use an array in an object to hold the numbers and use instance methods to
// handle validation and output.
