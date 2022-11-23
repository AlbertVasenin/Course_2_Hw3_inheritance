package animals.birds.flying;

public class Gull extends FlyingBirds{

  public Gull(String name, int age, String livingEnvironment, String movement) {
    super(name, age, livingEnvironment, movement);
  }

  @Override
  public final void fly() {
    System.out.println("Чайка летит");
  }

  @Override
  public final void eat() {
    System.out.println("Чайка ест");
  }

  @Override
  public final void sleep() {
    System.out.println("Чайка спит");
  }

  @Override
  public final void move() {
    System.out.println("Чайка двигается");
  }

  @Override
  public final void hunt() {
    System.out.println("Чайка охотится");
  }

  @Override
  public String toString() {
    return String.format(
        "Животные, летающие птицы: %s, возраст %d год(а), среда обитания: %s, способ передвижения: %s"
        , getName(), getAge(), getLivingEnvironment(), getMovement());
  }
}
