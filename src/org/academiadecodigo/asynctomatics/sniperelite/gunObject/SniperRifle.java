package org.academiadecodigo.asynctomatics.sniperelite.gunObject;

import org.academiadecodigo.asynctomatics.sniperelite.gameobject.interfaces.Destroyable;

public class SniperRifle {

    // property
    private int bulletDamage;

    // constructor
    public SniperRifle(int bulletDamage) {
        this.bulletDamage = bulletDamage;
    }

    // method
    // when shooting has a probability of hitting the target
    public void shoot(Destroyable target) {

        if (Math.random() > 0.3) {
            System.out.println("Hit! It's a hit.");
            target.hit(bulletDamage);

        } else {
            System.out.println("Shit, I missed!");
        }
    }
}
