package animals.mammals.herbivores;

import animals.mammals.Mammals;
import java.util.Objects;

public abstract class Herbivores extends Mammals {

  private final String eat;

  public Herbivores(String name, int age, String livingEnvironment, int speedMove, String eat) {
    super(name, age, livingEnvironment, speedMove);
    this.eat = validateString(eat);
  }

  public final String getEat() {
    return eat;
  }

  public abstract void graze();

}
