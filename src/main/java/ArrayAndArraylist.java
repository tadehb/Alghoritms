import org.omg.CORBA.Object;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by Tadeh on 12/23/18.
 */
public class ArrayAndArraylist {

    public static void main(String[] args) {

        String [] arr = {"Armen","Tadeh","Tony","John"};


       for (String i :arr) {
            System.out.print(i+" ");
        }

        ArrayList alist = new ArrayList(Arrays.asList(arr));

        System.out.println(alist);


        Iterator it = alist.iterator();

        while(it.hasNext()){

            System.out.println(it.next());
        }



        ArrayList alist2 = new ArrayList();
        alist2.add("Welcome");
        alist2.add("to");
        alist2.add("Java");
        alist2.add("World");



        String [] arr2 = (String[]) alist2.toArray(new String[alist2.size()]);


        for (String s : arr2){
            System.out.print(s+" ");
        }


    }


}
