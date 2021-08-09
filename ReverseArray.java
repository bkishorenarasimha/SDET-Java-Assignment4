import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
  
public class ReverseArray
{
    public static void main(String[] args)
    {
        List<String>  list = new ArrayList<String>();
        list.add("My");
        list.add("Java");
        list.add("Program");
          
        System.out.println("Array is " + list);

        Collections.reverse(list);
  
        System.out.println("ReverseArray is " + list);
    }
}