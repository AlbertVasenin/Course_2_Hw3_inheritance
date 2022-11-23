package animals.birds;

import animals.Animals;

public abstract class Birds extends Animals {

  private String livingEnvironment;

  public Birds(String name, int age, String livingEnvironment) {
    super(name, age);
    this.livingEnvironment = validateString(livingEnvironment);
  }

  public abstract void hunt();

  public final String getLivingEnvironment() {
    return livingEnvironment;
  }

  public final void setLivingEnvironment(String livingEnvironment) {
    this.livingEnvironment = validateString(livingEnvironment);
  }
}
