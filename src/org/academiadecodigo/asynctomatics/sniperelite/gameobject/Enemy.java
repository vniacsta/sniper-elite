package org.academiadecodigo.asynctomatics.sniperelite.gameobject;

import org.academiadecodigo.asynctomatics.sniperelite.gameobject.interfaces.Destroyable;

abstract public class Enemy extends GameObject implements Destroyable {

    // subclass of GameObject
    // will have two subclasses: armoured enemy and soldier enemy

    // properties
    private int health;
    private boolean destroyed;

    // constructor
    public Enemy(int health) {
        this.health = health;
        this.destroyed = false;
    }

    // override method from destroyable
    @Override
    public void hit(int damage) {


        health -= damage;
        System.out.println("Ohhh... I'm hit! Damage: " + health + ".");

        if (health <= 0) {
            System.out.println("Enemy is dead!");
            destroyed = true;
        }
    }

    // override method from destroyable
    @Override
    public boolean isDestroyed() {
        return destroyed;
    }

    // override the super class method
    @Override
    public String getMessage() {
        return "  ** ENEMY ALERT! **";
    }
}
