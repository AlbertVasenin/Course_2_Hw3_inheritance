package animals.mammals.herbivores;

public class Horse extends Herbivores {

  public Horse(String name, int age, String livingEnvironment, int speedMove, String eat) {
    super(name, age, livingEnvironment, speedMove, eat);
  }

  @Override
  public final void graze() {
    System.out.println("Лошадь пасется");
  }

  @Override
  public final void walk() {
    System.out.println("Лошадь гуляет");
  }

  @Override
  public String toString() {
    return String.format(
        "Животные, млекопитающие, травоядные: %s, возраст %d год(а), среда обитания: %s, максимальная скорость передвижения %d км/ч, основная еда: %s"
        , getName(), getAge(), getLivingEnvironment(), getSpeedMove(), getEat());
  }

  @Override
  public final void eat() {
    System.out.println("Лошадь гуляет");
  }

  @Override
  public final void sleep() {
    System.out.println("Лошадь спит");
  }

  @Override
  public final void move() {
    System.out.println("Лошадь двигается");
  }
}
