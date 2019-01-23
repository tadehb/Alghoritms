/**
 * Created by Tadeh on 1/23/19.
 * Find the minimum number in an array of integers
 */
public class MaxAndMinNumbers {

    public static void main(String[] args) {


        int [] samples = {1,2,3,4,5,6,7,8,9};
        System.out.println(getMinNumber(samples));
        System.out.println(getMaxNumber(samples));
    }

    /**
     *
     * @param numbers
     * @return
     */
    private static int getMinNumber(int[] numbers){

        int minNumber = numbers[0];
        for (int i=1 ; i < numbers.length ; i++){
            if (numbers[i] < minNumber) minNumber = numbers[i];
        }
        return minNumber;
    }

    /**
     *
     * @param numbers
     * @return
     */
    private static int getMaxNumber(int[] numbers){


        int maxNumber = numbers[0];
        for (int i =1 ; i < numbers.length ;i++){
            if (numbers[i] > maxNumber) maxNumber = numbers[i];
        }
        return maxNumber;
    }


}
