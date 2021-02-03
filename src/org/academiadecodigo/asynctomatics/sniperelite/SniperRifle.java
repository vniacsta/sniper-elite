package org.academiadecodigo.asynctomatics.sniperelite;

import org.academiadecodigo.asynctomatics.sniperelite.interfaces.Destroyable;

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

        int random = (int) (Math.random() * 5);

        if (random <= 3) {
            target.hit(bulletDamage);
            System.out.println("Hit! Die motherfucker! Haaa!");

        } else {
            System.out.println("It's a miss");
        }
    }
}
