package org.academiadecodigo.asynctomatics.sniperelite.gameobject;

import org.academiadecodigo.asynctomatics.sniperelite.gameobject.interfaces.Destroyable;

public class Barrel extends GameObject implements Destroyable {

    // properties
    private int currentDamage;
    private boolean destroyed;

    // call BarrelType
    private BarrelType barrelType;

    // constructor
    public Barrel() {
        this.barrelType = BarrelType.values()[(int) (Math.random() * (BarrelType.values().length))];
        currentDamage = 0;
        destroyed = false;
    }

    // override method from destroyable
    @Override
    public void hit(int damage) {

        // barrel takes damage
        currentDamage += damage;
        System.out.println("My barrel was hit. Damage: " + currentDamage + ".");

        // when current damage is at max, barrel is destroyed
        if (currentDamage == barrelType.getMaxDamage()) {
            destroyed = true;
            System.out.println("Barrel has exploded.");
        }

    }

    // override method from destroyable -> getter
    @Override
    public boolean isDestroyed() {
        return destroyed;
    }

    // override the super class method
    @Override
    public String getMessage() {

        switch (barrelType) {
            case METAL:
                return "  ** Why would you shoot a caring barrel made of metal?";
            case WOOD:
                return "  ** I'm a wood barrel. Maybe I have good wine, don't shoot me.";
            case PLASTIC:
                return "  ** Hi. I'm Barrel, Plastic Barrel. I dare you to shoot me.";
        }
        return "";
    }
}
