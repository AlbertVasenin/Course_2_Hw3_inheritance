package animals.mammals.predators;

public class Tiger extends Predators {

  public Tiger(String name, int age, String livingEnvironment, int speedMove, String eat) {
    super(name, age, livingEnvironment, speedMove, eat);
  }

  @Override
  public final void hunt() {
    System.out.println("Тигр охотится");
  }

  @Override
  public final void eat() {
    System.out.println("Тигр ест");
  }

  @Override
  public final void sleep() {
    System.out.println("Тигр спит");
  }

  @Override
  public final void move() {
    System.out.println("Тигр двигается");
  }

  @Override
  public final void walk() {
    System.out.println("Тигр гуляет");
  }

  @Override
  public String toString() {
    return String.format(
        "Животные, млекопитающие, хищники: %s, возраст %d год(а), среда обитания: %s, максимальная скорость передвижения %d км/ч, основная еда: %s"
        , getName(), getAge(), getLivingEnvironment(), getSpeedMove(), getEat());
  }
}
