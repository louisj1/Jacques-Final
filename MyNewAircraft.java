public class MyNewAircraft {
  // Jacques Louis
  // This program is about an airplane
  // It will display the pilot, speed and fuel count
  public static void main(String[] args) {
   
    System.out.println("Welcome to Fort Lauderdale Airport");

    Aircraft aircraft = new Aircraft();

    aircraft.setMake("Delta Airlines");
    aircraft.setPilot("Jacques");
    aircraft.setSpeed(350);
    aircraft.setFuelCount(36000);


    // printing the values store in Aircraft class
    System.out.println("Thank you for choosing " + aircraft.getMake());
    System.out.println("Your pilot for today is " + aircraft.getPilot());
    System.out.println("We are cruising at: " + aircraft.getSpeed());
    System.out.println("Amount of gallons fuel we used is: " + aircraft.getFuelCount());
    Strings.doStringsDemo();
    Job.doJobDemo();
    Pilot.doPilotDemo();
    Strings2.doStrings2Demo();
    Array.doArrayDemo();
    Plane.doPlaneDemo();
    Psi.doPsiDemo();
    Catch.doCatchDemo();




  }
}