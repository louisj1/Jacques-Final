

public class Array {
  
  public static void doArrayDemo() {

    int[] anArray = { 1000, 2000, 3000, 4000, 5000 };
    // using array to display the distance for the flights
    int smallest = anArray[1];
    int largest = anArray[1];
    int sum = 0;
     
    //Use a for loop and the length attribute to loop through an array.

    for (int i = 0; i < anArray.length; i++) {
           
      sum = sum + anArray[i];
           
      if (anArray[i] > largest) {
        largest = anArray[i];
      } else if (anArray[i] < smallest) {
        smallest = anArray[i];
      }
    }
         
    System.out.println("Flight at #1 will reach a distance of " + anArray[1] + " miles");
    System.out.println("Flight at #4 will reach a distance of " + anArray[4] + " miles");
    System.out.println("Smallest distance is : " + smallest);
    System.out.println("Longest distance is : " + largest);
    System.out.println("Total distance : " + sum);
  }


}
  
  

