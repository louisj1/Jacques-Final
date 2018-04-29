class Aircraft {

  // Jacques Louis
  
  // main constructor
  private String make; //instance variable
  private double speed;
  private String pilot;
  private int FuelCount;
  
  
  //constructor
  public Aircraft(String m, double s, String pt, int fc) {

    this.make = m;
    this.speed = (int) s;
    this.pilot = pt;
    this.FuelCount = fc;
  
  }

  public Aircraft() {
    
  }
  // method to store the name of the make in the object
  public void setMake(String m) {
    this.make = m;  // store the make
  }

  public double getSpeed() {
    return speed;
  }
  // method retrieving the name of the make for the object
  public String getMake() {

    return this.make; // return the value of the make
  }

  public void setSpeed(int s) {
    this.speed = s;
  }

  public String getPilot() {
    return pilot;
  }

  public void setPilot(String pilot) {
    this.pilot = pilot;
  }
  
  public void setSpeed(double s) {
    this.speed = s;

  }

  public int getFuelCount() {
    return FuelCount;
  }

  public void setFuelCount(int fc) {
    this.FuelCount = fc;
    
    
 
  }

}