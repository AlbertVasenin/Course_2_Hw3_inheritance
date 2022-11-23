package animals.mammals.predators;

import animals.mammals.Mammals;

public abstract class Predators extends Mammals {
  private final String eat;

  public Predators(String name, int age, String livingEnvironment, int speedMove, String eat) {
    super(name, age, livingEnvironment, speedMove);
    this.eat = eat;
  }

  public final String getEat() {
    return eat;
  }
  public abstract void hunt();
}
