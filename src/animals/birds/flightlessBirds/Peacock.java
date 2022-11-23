package animals.birds.flightlessBirds;

public class Peacock extends FlightlessBirds{

  public Peacock(String name, int age, String livingEnvironment, String movement) {
    super(name, age, livingEnvironment, movement);
  }

  @Override
  public final void walk() {
    System.out.println("Павлин гуляет");
  }

  @Override
  public final void eat() {
    System.out.println("Павлин ест");
  }

  @Override
  public final void sleep() {
    System.out.println("Павлин спит");
  }

  @Override
  public final void move() {
    System.out.println("Павлин двигается");
  }

  @Override
  public final void hunt() {
    System.out.println("Павлин охотится");
  }

  @Override
  public String toString() {
    return String.format(
        "Животные, нелетающие птицы: %s, возраст %d год(а), среда обитания: %s, способ передвижения: %s"
        , getName(), getAge(), getLivingEnvironment(), getMovement());
  }
}
