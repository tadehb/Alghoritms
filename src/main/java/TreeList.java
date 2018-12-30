import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by Tadeh on 12/23/18.
 */
public class TreeList {


    public static void main(String[] args) {


        ArrayList alist = new ArrayList();
        for (int i =1 ; i<=10 ; i++){
            alist.add(i);
        }
        alist.add(10);
        alist.add(3);
        alist.add(5);

        System.out.println(alist);

        HashSet hset = new HashSet(alist);

        System.out.println(hset);

        TreeSet tlist = new TreeSet(alist);


        System.out.println(tlist);

        HashMap hmap = new HashMap();
        hmap.put("01",1);

        HashMap hmap2 = new HashMap();
        hmap2.put("Object",hmap);


        System.out.println(hmap2);




        JSONObject object = new JSONObject();

        object.put("Address","Tehran");
        object.put("City","New York");
        object.put("codes",alist);
        System.out.println(object.toMap().keySet());

        System.out.println(object);









    }


}
