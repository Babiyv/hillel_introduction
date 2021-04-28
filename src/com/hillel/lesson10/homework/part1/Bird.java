package com.hillel.lesson10.homework.part1;

public abstract class Bird extends Animal {

    private final  boolean hasFeather = true;
    protected String featherDesc;

    public Bird(String name, String homeland) {
        super(name, homeland);
    }

    private String describeFeather() {
        return String.format("I %s feathers. %s", isHasFeather() ? "have" : "don't have", getFeatherDesc());
    }

    public boolean isHasFeather() {
        return hasFeather;
    }

    public String getFeatherDesc() {
        return featherDesc;
    }

    @Override
    protected String getFlyingGreeting() {
        return String.format("I %s wings, %s %s fly. %s",
                hasWings() ? "have" : "don't have",
                hasWings() ^ canFly() ? "although" : "so",
                canFly() ? "can" : "can't",
                describeFeather());
    }

    @Override
    protected String getWalkingGreeting() {
        return String.format("I %s walk.", canWalk() ? "can" : "can't");
    }
}
