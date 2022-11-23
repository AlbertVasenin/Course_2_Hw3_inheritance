package animals.mammals.herbivores;

public class Giraffe extends Herbivores {

  public Giraffe(String name, int age, String livingEnvironment, int speedMove, String eat) {
    super(name, age, livingEnvironment, speedMove, eat);
  }

  @Override
  public final void graze() {
    System.out.println("Жираф пасется");
  }

  @Override
  public final void walk() {
    System.out.println("Жираф гуляет");
  }

  @Override
  public String toString() {
    return String.format(
        "Животные, млекопитающие, травоядные: %s, возраст %d год(а), среда обитания: %s, максимальная скорость передвижения %d км/ч, основная еда: %s"
        , getName(), getAge(), getLivingEnvironment(), getSpeedMove(), getEat());
  }

  @Override
  public final void eat() {
    System.out.println("Жираф гуляет");
  }

  @Override
  public final void sleep() {
    System.out.println("Жираф спит");
  }

  @Override
  public final void move() {
    System.out.println("Жираф двигается");
  }
}
