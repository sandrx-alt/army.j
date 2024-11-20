package Soldier;

public class defender extends soldier {

    public defender(String name, int health) {
        super(name, health);
    }

    public void defend() {
        System.out.println(this.getName() + " is defending! ");
    }
}
