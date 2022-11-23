package animals.amphibians;

public class UzhFreshwater extends Amphibians {

  public UzhFreshwater(String name, int age, String livingEnvironment) {
    super(name, age, livingEnvironment);
  }

  @Override
  public final void hunt() {
    System.out.println("Уж охотится");
  }

  @Override
  public final void eat() {
    System.out.println("Уж ест");
  }

  @Override
  public final void sleep() {
    System.out.println("Уж спит");
  }

  @Override
  public final void move() {
    System.out.println("Уж двигается");
  }

  @Override
  public String toString() {
    return String.format(
        "Животные, земноводные: %s, возраст %d год(а), среда обитания: %s"
        , getName(), getAge(), getLivingEnvironment());
  }
}
