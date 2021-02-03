package org.academiadecodigo.asynctomatics.sniperelite;

import org.academiadecodigo.asynctomatics.sniperelite.gameobject.*;
import org.academiadecodigo.asynctomatics.sniperelite.gameobject.interfaces.Destroyable;
import org.academiadecodigo.asynctomatics.sniperelite.gunObject.SniperRifle;

public class Game {

    // properties of game
    private int shotsFired;
    private int numberObjects;

    // call classes objects
    private ArmouredEnemy armouredEnemy;
    private SoldierEnemy soldierEnemy;
    private Tree tree;
    private SniperRifle sniper;

    // array of game objects
    private GameObject[] objects;

    // constructor
    public Game() {
        numberObjects = 5;
        shotsFired = 0;
    }

    // method to start the game - called in main
    public void start() {

        // create my objects and sniper while starting the game
        objects = createObjects(numberObjects);
        sniper = new SniperRifle(20);

        // iterate through the array and shoot only the enemies
        for (GameObject object : objects) {

            // display the object
            System.out.println(object.getMessage());

            // do not hit trees
            if (object instanceof Tree) {
                continue;
            }

            // cast destroyable objects so the game knows who to shoot
            Destroyable target = (Destroyable) object;

            // keep shooting the same enemy until it is dead
            while (!target.isDestroyed()) {
                System.out.println("Taking the shoot...");
                // call method from sniper with my target
                sniper.shoot(target);
                // increment shots fired
                shotsFired++;
            }
        }

        // show the total number of shots fired
        System.out.println("To kill my targets I shot " + shotsFired + " times.");
    }

    // method to create my game object array
    public GameObject[] createObjects(int numberObjects) {

        // instantiate my objects array inside the method to return it below
        GameObject[] objects = new GameObject[numberObjects];

        // iterate through the array of game objects to populate it
        for (int i = 0; i < objects.length; i++) {

            // define a higher probability of having enemies than trees
            if (Math.random() < 0.3) {
                objects[i] = new Tree();

            } else if (Math.random() >= 0.3) {

                // populate the array with destroyable objects
                if (Math.random() >= 0.7) {
                    objects[i] = new ArmouredEnemy(40, 20);

                } else if (Math.random() >= 0.3) {
                    objects[i] = new SoldierEnemy(40);

                } else if (Math.random() < 0.3) {
                    objects[i] = new Barrel();
                }
            }
        }
        return objects;
    }
}
