package animals.birds.flightlessBirds;

import animals.birds.Birds;

public class FlightlessBirds extends Birds {

  private final String movement;

  public FlightlessBirds(String name, int age, String livingEnvironment, String movement) {
    super(name, age, livingEnvironment);
    this.movement = validateString(movement);
  }

  public final String getMovement() {
    return movement;
  }

  public final void walk() {
    System.out.println(getName() + " гуляет");
  }

  @Override
  public String toString() {
    return String.format(
        "Животные, нелетающие птицы: %s, возраст %d год(а), среда обитания: %s, способ передвижения: %s"
        , getName(), getAge(), getLivingEnvironment(), getMovement());
  }
}
