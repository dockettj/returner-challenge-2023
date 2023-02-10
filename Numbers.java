/**
 * Used to store the numbers in a array
 */

public class Numbers {

    private int[] numbers;

    public Numbers(int len){
        numbers = new int[len];

        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = j+1;
        }
    }

    /**
     * Output uses the {@code int[] numbers} and outputs the result depending on if the number is evenly divisable by 5, 3, or both
     */
    public void output(){
        for (int i = 0; i < numbers.length; i++) {
            
            if (numbers[i]%5 == 0 && numbers[i]%3 == 0) {
                // If the number is evenly divisible by 3 and 5, output, "BAISD is awesome!"
                System.out.println("BAISD is awesome!");
            } else if (numbers[i]%5 == 0) {
                // If the number is evenly divisible by 5, output, "BAISD "
                System.out.println("BAISD ");
            } else if(numbers[i]%3 == 0){
                // If the number is evenly divisible by 3, output, "is awesome!"
                System.out.println("is awesome!");
            }
        }
    }
}
