import starwars.*;

public class StarWars {

  public static Xharacter summonCharacter() {
    java.util.Random  rand = new java.util.Random();
    if (Math.abs(rand.nextInt()) % 2 == 0) {
      return new Enemy();
    } else {
      return new Hero();
    }
  }

  public static void main(String[] args) {
    Enemy darthVader = new Enemy();
    Hero obiWanKenobi = new Hero();
    darthVader.attack();
    obiWanKenobi.attack();
    darthVader.heal();
    obiWanKenobi.heal();
    System.out.println("Enemy weapon: "+darthVader.getWeapon());
    System.out.println("Hero weapon: "+obiWanKenobi.getWeapon());
    Xharacter spy = summonCharacter();
    spy.attack();
    spy.heal();
  }
}
