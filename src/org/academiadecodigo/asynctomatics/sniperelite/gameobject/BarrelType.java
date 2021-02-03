package org.academiadecodigo.asynctomatics.sniperelite.gameobject;

public enum BarrelType {

    PLASTIC(20),
    WOOD(20),
    METAL(40);

    // property
    private int maxDamage;

    // constructor - by default it's private
    BarrelType(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    // getter
    public int getMaxDamage() {
        return maxDamage;
    }
}
