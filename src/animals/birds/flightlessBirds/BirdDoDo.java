package animals.birds.flightlessBirds;

public class BirdDoDo extends FlightlessBirds{

  public BirdDoDo(String name, int age, String livingEnvironment, String movement) {
    super(name, age, livingEnvironment, movement);
  }

  @Override
  public final void eat() {
    System.out.println("Птица До До ест");
  }

  @Override
  public final void sleep() {
    System.out.println("Птица До До спит");
  }

  @Override
  public final void move() {
    System.out.println("Птица До До двигается");
  }

  @Override
  public final void hunt() {
    System.out.println("Птица До До охотится");
  }

  @Override
  public final void walk() {
    System.out.println("Птица До До гуляет");
  }

  @Override
  public String toString() {
    return String.format(
        "Животные, нелетающие птицы: %s, возраст %d год(а), среда обитания: %s, способ передвижения: %s"
        , getName(), getAge(), getLivingEnvironment(), getMovement());
  }
}
