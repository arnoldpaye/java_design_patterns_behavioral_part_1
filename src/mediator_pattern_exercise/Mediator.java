package mediator_pattern_exercise;

public class Mediator {
  private Plane plane;
  private Runway runway;
  private PlanesInFlight planesInFlight;
  private  PlanesOnGround planesOnGround;

  public Mediator() {
    plane = new Plane(123);
    runway = new Runway();
    planesInFlight = new PlanesInFlight();
    planesOnGround = new PlanesOnGround();
  }

  public void takeOff() {
    if (!plane.getIsInTheAir() && runway.getIsAvailable()) {
      System.out.println("Plane " + plane.getId() + " is taking off...");
      planesOnGround.removePlane(plane);
      planesInFlight.addPlane(plane);
      plane.setIsInTheAir(true);
      runway.setIsAvailable(false);
    }
  }
}
