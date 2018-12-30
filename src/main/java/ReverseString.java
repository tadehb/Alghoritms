/**
 * Created by Tadeh on 12/23/18.
 */
public class ReverseString {


    public static void main(String[] args) {


        System.out.println(reverseString("tadeh"));
    }


    private static String reverseString(String string){

        String newString = "";

        for (int i = string.length()-1; i>=0; i-- ){

            newString += string.charAt(i);

        }


        return newString;
    }
}
