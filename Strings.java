public class Strings {
  // Jacques Louis
  public static void doStringsDemo() {

    java.util.ArrayList<String> nextCountry = new java.util.ArrayList<String>();

    short distance = 350;
    byte length = (byte) distance; // casting
    

    String a = "I love flying";
    String b = "my favorite airline is DELTA";
    String c = "LouIS";
    String g = "Blue Sky";
    String s1 = "What's the best part about flying";
    
 
    String d = a.toUpperCase();
    String e = b.toLowerCase();
    String f = c.replace("IS", "is");
    
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
    System.out.println(s1.startsWith("What's"));
    System.out.println(s1.startsWith("Delta"));
    System.out.println(g.substring(1, 7));
    System.out.println("The distance = " + distance);
    System.out.println(length);
    

    int country =  0;
    //The code displays the country  using the switch statement.
    switch (country) {
    case 1:
      nextCountry.add("France");
      break;
    case 2:
      nextCountry.add("Netherlands");
      break;
    case 3:
      nextCountry.add("Greece");
      break;
    case 4:
      nextCountry.add("");
      break;
    default:
      break;
    }

    if (nextCountry.isEmpty()) {
      System.out.println("Thinking of a new place" + nextCountry);
    } else {
      for (String countryName : nextCountry) {
        System.out.println(countryName);
      }
       
        

    }
  
  
  }
  

}