package Soldier;
import Soldier.attacker;
import Soldier.attacker;
import Soldier.defender;

public class Main {
    public static void main(String[] args) {

        attacker attacker1 = new attacker("Jozef", 80);
        attacker attacker2 = new attacker("Peter", 80);
        attacker attacker3 = new attacker("John", 100);

        defender defender1 = new defender("Alice", 90);
        defender defender2 = new defender("Laura", 70);
        defender defender3 = new defender("Martin", 90);

        attacker[] attackers = {attacker1, attacker2, attacker3};
        defender[] defenders = {defender1, defender2, defender3};

        for (int i = 0; i < attackers.length;i++) {
        attackers[i].attack(defenders[i]);
        System.out.println(defenders[i]);
    }
   }
}