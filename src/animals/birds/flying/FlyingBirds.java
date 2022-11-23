package animals.birds.flying;

import animals.birds.Birds;

public abstract class FlyingBirds extends Birds {

  private final String movement;

  public FlyingBirds(String name, int age, String livingEnvironment, String movement) {
    super(name, age, livingEnvironment);
    this.movement = movement;
  }

  public abstract void fly();

  public final String getMovement() {
    return movement;
  }
}
