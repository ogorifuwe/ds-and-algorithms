package starwars;

public class Hero implements Xharacter {
  
  public String weapon = "The Force";

  public Hero() {}

  public String getWeapon() { return weapon; }

  @Override
  public void attack() {
    System.out.println("The hero attcks the enemy");
  }

  @Override
  public void heal() {
    System.out.println("The hero heals you");
  }

}
