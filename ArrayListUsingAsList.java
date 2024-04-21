import java.util.*;
public class ArrayListUsingAsList {
    public static void main(String args[])
    {
        //Arraylist of string type
        ArrayList<String> str=new ArrayList<String>(Arrays.asList("I","Love","Topperworld"));
        //initilize an arraylist with add()
        // str.add("Topper");
        // str.add("is");
        // str.add("padmaksh");

        System.out.println("Arraylist is :"+ str);
    }
    
}