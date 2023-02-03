package com.walking.zoo;

public class Animal {
    private final String name;
    private final String sound;


    protected Animal(String name, String sound){
        this.name = name;
        this.sound = sound;
    }


    protected String sound(){
        return sound;
    }

    public String getName(){
        return name;
    }

}
