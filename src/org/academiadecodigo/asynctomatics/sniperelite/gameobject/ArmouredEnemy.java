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

        // if armour is totally destroyed, destroy health
        if (armour <= 0) {
            super.hit(damage);
            System.out.println("My armour is down!");
            return;
        }

        // else armour is damaged
        armour -= damage;
    }

    // override the super class method
    @Override
    public void getMessage() {
        System.out.println("  ** ENEMY? No, I'm your nightmare! **");
    }
}
