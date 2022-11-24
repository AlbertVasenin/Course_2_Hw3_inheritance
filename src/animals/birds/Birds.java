package animals.birds;

import animals.Animals;

public class Birds extends Animals {

  private String livingEnvironment;

  public Birds(String name, int age, String livingEnvironment) {
    super(name, age);
    this.livingEnvironment = validateString(livingEnvironment);
  }

  public final String getLivingEnvironment() {
    return livingEnvironment;
  }

  public final void setLivingEnvironment(String livingEnvironment) {
    this.livingEnvironment = validateString(livingEnvironment);
  }

  public final void hunt() {
    System.out.println(getName() + " охотится");
  }

  @Override
  public void eat() {
    System.out.println(getName() + " ест");
  }

  @Override
  public void sleep() {
    System.out.println(getName() + " спит");
  }

  @Override
  public void move() {
    System.out.println(getName() + " двигается");
  }
}
