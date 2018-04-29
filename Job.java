
public class Job extends Pilot {

  public static void doJobDemo() {
    // TODO Auto-generated method stub

  }

  String mainOperator = "Airplane";

  public static void main(String args[]) {
    Job obj = new Job();
    /*
     * Using public getter method
     * 
     * to access the private members of parent class
     */
    System.out.println(obj.getName());
    System.out.println(obj.getCareer());
    System.out.println(obj.mainOperator);
    obj.does();
  }

}

