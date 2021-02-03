package org.academiadecodigo.asynctomatics.sniperelite.gameobject;

public class SoldierEnemy extends Enemy {

    // subclass of enemy

    // constructor
    public SoldierEnemy(int health) {
        super(health);
    }

    // override the super class method
    @Override
    public String getMessage() {
        return "  ** I'm a friendly ENEMY! **";
    }

}
