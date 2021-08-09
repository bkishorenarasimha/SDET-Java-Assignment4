import java.util.*;
  
public class SortArrayList 
{
    public static void main(String[] args)
    {
        List<String>  list = new ArrayList<String>();
        list.add("My");
        list.add("Java");
        list.add("Program");
          
        System.out.println("Array is " + list);

        Collections.sort(list);
  
        System.out.println("Sorted ArrayList  is " + list);
    }
}