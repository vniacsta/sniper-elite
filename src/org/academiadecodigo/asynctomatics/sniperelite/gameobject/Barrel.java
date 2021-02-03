package org.academiadecodigo.asynctomatics.sniperelite.gameobject;

import org.academiadecodigo.asynctomatics.sniperelite.interfaces.Destroyable;

public class Barrel extends GameObject implements Destroyable {

    // properties
    private int currentDamage;
    private boolean destroyed;

    // call BarrelType
    private BarrelType barrelType;

    // constructor
    public Barrel() {
        this.barrelType = BarrelType.values()[(int) (Math.random() * BarrelType.values().length)];
        currentDamage = 0;
        destroyed = false;
    }

    // override method from destroyable
    @Override
    public void hit(int damage) {

        // when current damage is at max, barrel is destroyed
        if (barrelType.getMaxDamage() == currentDamage) {
            destroyed = true;
            System.out.println("Barrel has exploded.");
        }
        currentDamage += damage;
    }

    // override method from destroyable -> getter
    @Override
    public boolean isDestroyed() {
        return destroyed;
    }

    // override the super class method
    @Override
    public void getMessage() {

        switch (barrelType) {
            case METAL:
                System.out.println("  ** Why would you shoot a caring barrel made of metal?");
            case WOOD:
                System.out.println("  ** I'm a wood barrel. Maybe I have good wine, don't shoot me.");
            case PLASTIC:
                System.out.println("  ** Hi. I'm Barrel, Plastic Barrel. I dare you to shoot me.");
        }
    }
}
