package animals.amphibians;

public class Frog extends Amphibians {

  public Frog(String name, int age, String livingEnvironment) {
    super(name, age, livingEnvironment);
  }

  @Override
  public final void hunt() {
    System.out.println("Лягушка охотится");
  }

  @Override
  public final void eat() {
    System.out.println("Лягушка ест");
  }

  @Override
  public final void sleep() {
    System.out.println("Лягушка спит");
  }

  @Override
  public final void move() {
    System.out.println("Лягушка двигается");
  }

  @Override
  public String toString() {
    return String.format(
        "Животные, земноводные: %s, возраст %d год(а), среда обитания: %s"
        , getName(), getAge(), getLivingEnvironment());
  }
}
