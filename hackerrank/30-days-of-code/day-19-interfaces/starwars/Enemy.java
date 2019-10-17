package starwars;

public class Enemy implements Xharacter {
  
  public String weapon = "lightsaber";

  public Enemy() {}

  public String getWeapon() { return weapon; }
  @Override
  public void attack() {
    System.out.println("The enemy attacks you!!");
  }

  @Override
  public void heal() {
    System.out.println("The enemy heals himself");
  }

  public void weaponDraw() {
    System.out.println("Draw out weapon");
  }

}
