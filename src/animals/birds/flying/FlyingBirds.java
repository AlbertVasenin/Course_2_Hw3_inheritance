package animals.birds.flying;

import animals.birds.Birds;

public class FlyingBirds extends Birds {

  private final String movement;

  public FlyingBirds(String name, int age, String livingEnvironment, String movement) {
    super(name, age, livingEnvironment);
    this.movement = validateString(movement);
  }

  public final void fly() {
    System.out.println(getName() + " летает");
  }

  public final String getMovement() {
    return movement;
  }

  @Override
  public String toString() {
    return String.format(
        "Животные, летающие птицы: %s, возраст %d год(а), среда обитания: %s, способ передвижения: %s"
        , getName(), getAge(), getLivingEnvironment(), getMovement());
  }
}
