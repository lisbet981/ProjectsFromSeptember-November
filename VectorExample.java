//  import java.util.Enumeration;
 import java.util.Vector;
public class VectorExample{
 public static void main(String[] argos){
 Vector <String> names = new Vector<>();
 names.add("John");
 names.add("Anna");
  names.add("Seth");
 System.out.println(names.firstElement()); // John
 System.out.println(names.lastElement()); // Seth
 System.out.println(names.size()); // 3
 names.clear(); // [] Vector is now empty

/*Just to show I don't have to place it in my code
//  Enumeration<String> e = names.elements();
//  while(e.hasMoreElements()) {
//  System.out.println(e.nextElement());
//  }
*/
 } // END OF MAIN
 } // END OF CLASS



//  Notes ------------------------------------------
// SYNTAX AND DECLARATION;                        import java.util.*;  or  import java.util.Vector;                
// How to Declare a Vector:   Vector<String> cars = new Vector<>();    or          List<String> cars = new Vector<>();
