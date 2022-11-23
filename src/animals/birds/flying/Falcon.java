package animals.birds.flying;

public class Falcon extends FlyingBirds {

  public Falcon(String name, int age, String livingEnvironment, String movement) {
    super(name, age, livingEnvironment, movement);
  }

  @Override
  public final void fly() {
    System.out.println("Сокол летит");
  }

  @Override
  public final void eat() {
    System.out.println("Сокол ест");
  }

  @Override
  public final void sleep() {
    System.out.println("Сокол спит");
  }

  @Override
  public final void move() {
    System.out.println("Сокол двигается");
  }

  @Override
  public final void hunt() {
    System.out.println("Сокол охотится");
  }
  @Override
  public String toString() {
    return String.format(
        "Животные, летающие птицы: %s, возраст %d год(а), среда обитания: %s, способ передвижения: %s"
        , getName(), getAge(), getLivingEnvironment(), getMovement());
  }
}
