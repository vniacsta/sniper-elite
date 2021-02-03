package org.academiadecodigo.asynctomatics.sniperelite.gameobject;

public class ArmouredEnemy extends Enemy {

    // subclass of enemy and subclass of gameObject

    // new properties
    private int armour;

    // constructor
    public ArmouredEnemy(int health, int armour) {
        super(health);
        this.armour = armour;
    }

    // method hit from destroyable
    @Override
    public void hit(int damage) {

        // if armour is not destroyed, it will take damage
        if (armour > 0) {
            armour -= damage;
            System.out.println("My armour is down!");
            return;
        }
        // if armour totally destroyed, get super method to destroy health
        super.hit(damage);
    }

    // override the super class method
    @Override
    public String getMessage() {
        return "  ** ENEMY? No, I'm your nightmare! My armour is fucking strong! **";
    }
}
