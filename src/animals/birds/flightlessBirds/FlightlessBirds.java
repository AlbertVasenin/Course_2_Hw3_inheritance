package animals.birds.flightlessBirds;

import animals.birds.Birds;

public abstract class FlightlessBirds extends Birds {

  private final String movement;

  public FlightlessBirds(String name, int age, String livingEnvironment, String movement) {
    super(name, age, livingEnvironment);
    this.movement = movement;
  }

  public abstract void walk();

  public final String getMovement() {
    return movement;
  }
}
