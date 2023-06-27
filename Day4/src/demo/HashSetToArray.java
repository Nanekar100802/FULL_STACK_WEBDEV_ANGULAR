package demo;
import java.util.*;

public class HashSetToArray {
    public static void main(String args[]) {
      
      HashSet<String> hashset = new HashSet<String>();
      
      hashset.add("EE");
      hashset.add("IT");
      hashset.add("MCA");
      hashset.add("ENTC");
      hashset.add("IT");
      
      // Printing HashSet elements 
      System.out.println("HashSet contains: "+ hashset);
      
      // Creating an Array of HashSet size
      String[] array = new String[hashset.size()];
      
      // Converting HashSet to Array using toArray() method
      hashset.toArray(array);
      
      // Printing Array elements
      System.out.println("Array contains: ");
      for (String str : array) {
          System.out.println(str);
      }
    }
}