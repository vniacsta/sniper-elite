package org.academiadecodigo.asynctomatics.sniperelite.gameobject;

public class Tree extends GameObject {

    // subclass of GameObject
    // does not need a constructor

    // override the string method
    @Override
    public String getMessage() {
        return "  ** I'm a tree, please don't kill me! **";
    }
}
