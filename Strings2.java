public class Strings2 {

  public static void doStrings2Demo() {
   
    
    StringBuilder sb = new StringBuilder("Thailand");
    sb.append(" & China"); // original string is changed
    sb.insert(0, "Between ");
    System.out.println(sb);
    
    StringBuilder sb2 = new StringBuilder("Delta");
    sb.replace(1, 4, "ABC");
    System.out.println(sb2); // prints HABCo
    StringBuilder sb1 = sb2.reverse();
    System.out.println(sb2); // prints oCBAH
    System.out.println(sb2 == sb1); // prints true because both sb
    // sb1 referencing to the same object.
  
    StringBuilder sb3 = new StringBuilder("Delta");
    char c = sb3.charAt(4);
    sb.setCharAt(2, 'B');
    System.out.println(c); // prints e
    System.out.println(sb3); // prints Nello
    
    StringBuilder sb4 = new StringBuilder("Skyteam");
    sb4.delete(2,3);  
    System.out.println(sb4);//prints Hlo 
     
    
  
  }
 
}
