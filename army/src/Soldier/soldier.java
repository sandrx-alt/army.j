package Soldier;

public class soldier {
    private String name;
    private int health;

    public soldier(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {

        return name;
    }

    public int getHealth() {

        return health;
    }

    public void takeDamage(int damage) {

        this.health -= damage;
        if (this.health < 0) this.health = 0;
    }

    @Override
    public String toString() {

        return name + "(Health:" + health + ")";
    }
}

