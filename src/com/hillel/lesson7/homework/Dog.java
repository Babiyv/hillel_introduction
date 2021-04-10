package com.hillel.lesson7.homework;

public class Dog {

    private String name = new String();
    private String breed = new String();
    private boolean isMale = true;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public Dog(String name, String breed, boolean isMale) {
        this.name = name;
        this.breed = breed;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean getIsMale() {
        return isMale;
    }

    public void setIsMale(boolean trueIfMale) {
        this.isMale = trueIfMale;
    }

    @Override
    public String toString() {
        return "Name of Dog is: " + name + "; Breed: " + breed + "; Is it male: " + isMale;
    }
}
