package animals.mammals.herbivores;

import animals.mammals.Mammals;

public class Herbivores extends Mammals {

  private final String eat;

  public Herbivores(String name, int age, String livingEnvironment, int speedMove, String eat) {
    super(name, age, livingEnvironment, speedMove);
    this.eat = validateString(eat);
  }

  public final String getEat() {
    return eat;
  }

  public final void graze() {
    System.out.println(getName()+" пасется");
  }

  @Override
  public final void eat() {
    System.out.println(getName()+" ест");
  }

  @Override
  public final void sleep() {
    System.out.println(getName()+" спит");
  }

  @Override
  public final void move() {
    System.out.println(getName()+" двигается");
  }

  @Override
  public final void walk() {
    System.out.println(getName()+" гуляет");
  }

  @Override
  public String toString() {
    return String.format(
        "Животные, млекопитающие, травоядные: %s, возраст %d год(а), среда обитания: %s, максимальная скорость передвижения %d км/ч, основная еда: %s"
        , getName(), getAge(), getLivingEnvironment(), getSpeedMove(), getEat());
  }
}
