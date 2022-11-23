package animals.mammals.herbivores;

public class Gazelle extends Herbivores {

  public Gazelle(String name, int age, String livingEnvironment, int speedMove, String eat) {
    super(name, age, livingEnvironment, speedMove, eat);
  }

  @Override
  public final void graze() {
    System.out.println("Газель пасется");
  }

  @Override
  public final void walk() {
    System.out.println("Газель гуляет");
  }

  @Override
  public String toString() {
    return String.format(
        "Животные, млекопитающие, травоядные: %s, возраст %d год(а), среда обитания: %s, максимальная скорость передвижения %d км/ч, основная еда: %s"
        , getName(), getAge(), getLivingEnvironment(), getSpeedMove(), getEat());
  }

  @Override
  public final void eat() {
    System.out.println("Газель ест");
  }

  @Override
  public final void sleep() {
    System.out.println("Газель спит");
  }

  @Override
  public final void move() {
    System.out.println("Газель двигается");
  }
}
