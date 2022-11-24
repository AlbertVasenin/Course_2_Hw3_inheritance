package animals.mammals.predators;

import animals.mammals.Mammals;

public class Predators extends Mammals {

  private final String eat;

  public Predators(String name, int age, String livingEnvironment, int speedMove, String eat) {
    super(name, age, livingEnvironment, speedMove);
    this.eat = validateString(eat);
  }

  public final String getEat() {
    return eat;
  }

  public final void hunt() {
    System.out.println(getName()+" охотится");
  }

  @Override
  public String toString() {
    return String.format(
        "Животные, млекопитающие, хищники: %s, возраст %d год(а), среда обитания: %s, максимальная скорость передвижения %d км/ч, основная еда: %s"
        , getName(), getAge(), getLivingEnvironment(), getSpeedMove(), getEat());
  }
}
