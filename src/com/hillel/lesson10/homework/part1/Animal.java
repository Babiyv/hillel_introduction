package com.hillel.lesson10.homework.part1;

public abstract class Animal implements Swimmable, Walkable {
    private final String name;
    private final  String homeland;

    public Animal(String name, String homeland) {
        this.name = name;
        this.homeland = homeland;
    }

    protected String getSwimmingGreeting() {
        return String.format("I %s fins, %s %s swim.",
                            hasFins() ? "have" : "don't have",
                            hasFins() ^ canSwim() ? "although" : "so",
                            canSwim() ? "can" : "can't");
    }

    protected abstract String getFlyingGreeting();
    protected abstract String getWalkingGreeting();

    @Override
    public String toString() {
        return String.format("Hello!My name is %s. I'm from %s. %s %s %s",
                name, homeland, getWalkingGreeting(), getFlyingGreeting(), getSwimmingGreeting());
    }
}
