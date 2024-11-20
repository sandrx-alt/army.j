package Soldier;

public class attacker extends soldier {

    public attacker(String name, int health) {
        super(name, health);
    }

    public void attack(defender defender) {
        int damage = 10;
        defender.takeDamage(damage);
        System.out.println(this.getName() + " attacks " + defender.getName() + " and deals " + damage + "damage");
    }
}

