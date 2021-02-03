package org.academiadecodigo.asynctomatics.sniperelite.gameobject;

public class Tree extends GameObject {

    // subclass of GameObject
    // does not need a constructor

    // override the string method
    @Override
    public void getMessage() {
        System.out.println("  ** I'm a tree, please don't kill me! **");
    }
}
