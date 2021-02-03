package org.academiadecodigo.asynctomatics.sniperelite.gameobject;

import org.academiadecodigo.asynctomatics.sniperelite.interfaces.Destroyable;

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

        // when enemy has no more health, he's destroyed
        if (health <= 0) {
            destroyed = true;
            System.out.println("Enemy is dead!");
            return;
        }
        // else decrease health
        health -= damage;
    }

    // override method from destroyable
    @Override
    public boolean isDestroyed() {
        return destroyed;
    }

    // override the super class method
    @Override
    public void getMessage() {
        System.out.println("  ** ENEMY ALERT! **");
    }
}
