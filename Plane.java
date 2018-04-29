class Plane {
  // polymorphism
  public void fly() {
    System.out.println("That plane can move!!");
  }

  public static void doPlaneDemo() {
    // TODO Auto-generated method stub
    Plane plane = new Delta();
    // call overriden
    plane.fly();

  }
}

class Delta extends Plane {

  public void land() {

    System.out.println("That plane will land!!");

  }

  @Override
    public void fly() {
    System.out.println("The plane is taking off");


  }
}


