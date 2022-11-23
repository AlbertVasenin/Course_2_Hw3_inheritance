package animals.birds.flightlessBirds;

public class Penguin extends FlightlessBirds{

  public Penguin(String name, int age, String livingEnvironment, String movement) {
    super(name, age, livingEnvironment, movement);
  }

  @Override
  public final void walk() {
    System.out.println("Пингвин гуляет");
  }

  @Override
  public final void eat() {
    System.out.println("Пингвин ест");
  }

  @Override
  public final void sleep() {
    System.out.println("Пингвин спит");
  }

  @Override
  public final void move() {
    System.out.println("Пингвин двигается");
  }

  @Override
  public final void hunt() {
    System.out.println("Пингвин охотится");
  }

  @Override
  public String toString() {
    return String.format(
        "Животные, нелетающие птицы: %s, возраст %d год(а), среда обитания: %s, способ передвижения: %s"
        , getName(), getAge(), getLivingEnvironment(), getMovement());
  }
}
