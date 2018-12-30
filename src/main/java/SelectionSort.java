/**
 * Created by Tadeh on 12/28/18.
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] selectionSort = {10, 2, 8, 6, 7, 3, 1, 4};



        for (int i : sort(selectionSort)) {
            System.out.println(i);
        }

    }

    private static int[] sort(int arr[]) {

        int n = arr.length;
        int tmp, minIndex = 0;

        for (int i = 0; i < n - 1; i++) {

            minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {

                    minIndex = j;
                }
            }

            tmp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tmp;

        }


        return arr;
    }


}