package animals.birds.flying;

public class Albatross extends FlyingBirds {

  public Albatross(String name, int age, String livingEnvironment, String movement) {
    super(name, age, livingEnvironment, movement);
  }

  @Override
  public final void fly() {
    System.out.println("Альбатрос летит");
  }

  @Override
  public final void eat() {
    System.out.println("Альбатрос ест");
  }

  @Override
  public final void sleep() {
    System.out.println("Альбатрос спит");
  }

  @Override
  public final void move() {
    System.out.println("Альбатрос двигается");
  }

  @Override
  public final void hunt() {
    System.out.println("Альбатрос охотится");
  }

  @Override
  public String toString() {
    return String.format(
        "Животные, летающие птицы: %s, возраст %d год(а), среда обитания: %s, способ передвижения: %s"
        , getName(), getAge(), getLivingEnvironment(), getMovement());
  }
}
