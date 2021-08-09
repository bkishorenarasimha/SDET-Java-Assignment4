import java.util.*;
public class HashSettoObject {
   public static void main(String args[]) {
      Set<Integer> a = new HashSet<Integer>();
      a.add(15);
      a.add(71);
      a.add(82);
      System.out.println("Elements in set = "+a);
      Object[] O = a.toArray();
      for (Object o : O)
      System.out.println(o);
   }
}