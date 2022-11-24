package animals.mammals;

import animals.Animals;

public class Mammals extends Animals {

  private String livingEnvironment;
  private int speedMove;

  public Mammals(String name, int age, String livingEnvironment, int speedMove) {
    super(name, age);
    this.livingEnvironment = validateString(livingEnvironment);
    this.speedMove = Math.max(speedMove, 0);
  }

  public final String getLivingEnvironment() {
    return livingEnvironment;
  }

  public final void setLivingEnvironment(String livingEnvironment) {
    this.livingEnvironment = validateString(livingEnvironment);
  }

  public final int getSpeedMove() {
    return speedMove;
  }

  public final void setSpeedMove(int speedMove) {
    this.speedMove = Math.max(speedMove, 0);
  }

  public void walk() {
    System.out.println(getName() + " гуляет");
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
