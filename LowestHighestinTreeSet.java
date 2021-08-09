import java.util.TreeSet;

public Class LowestHighestinTreeSet{ 
     
    public static void main(String args[]) {
    TreeSet<Integer> TS = new TreeSet<Integer>();
           
      TS.add(1);
      TS.add(3);
      TS.add(5);
      TS.add(10);
     System.out.println(TS);
              
     System.out.println("Highest value in TS " + TS.last());           
       
     System.out.println("Lowest value in TS " + TS.first()); 
    }
}
