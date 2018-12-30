/**
 * Created by Tadeh on 12/25/18.
 */
public class FindMissingNumber {


    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6,7,8,9,10,13,15,14,11};

        System.out.println(findMissingNumber(numbers));
    }




    private static int findMissingNumber(int[] numbers){


        int n = numbers.length+1;

        int sum = 0;

        for (int i = 0 ; i < numbers.length;i++){
            sum += numbers[i];
        }

        //An alghoritm to find missing number

        int formula = n * (n+1) / 2;


        int missingNumber = formula - sum;

        return missingNumber;

    }

}
