/**
 * Created by Tadeh on 12/29/18.
 */
public class InsertionSort {


    public static void main(String[] args) {

        int [] arr = {2,4,5,10,9,8,3,1,6,7};

        for (int i : sort(arr)){

            System.out.println(i);
        }

    }


    private static int [] sort (int [] arr){

        int n = arr.length;

        for (int i=1 ; i<n;i++){

            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > key){

                arr[j+1] = arr[j];
                j--;
            }


            arr[j+1] = key;


        }

        return arr;

    }
}
