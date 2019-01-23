/**
 * Created by Tadeh on 1/23/19.
 * Nth Fibonaci number example
 */
public class Fibonaci {


    public static void main(String[] args) {

        //10th fibonaci number
        int index = 10;
        System.out.println(fibonaci(index));
    }

    /**
     *
     * @param index
     * @return
     */
    private static long fibonaci(int index){

        if(index == 0) return 0;
        if(index <= 2) return 1;

        long fibonaci = fibonaci(index - 1) + fibonaci(index - 2);

        return fibonaci;
    }
}
