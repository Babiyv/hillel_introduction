package com.hillel.lesson10.homework.part1;

public final class Duck extends Bird {
    private static final String VOICE = "quack";
    private static final int EGGS_COUNT = 250;

    public Duck(String name, String homeland) {
        super(name, homeland);
        super.featherDesc = "My feathers are very beautiful.";
    }

    public String talk() {
        return String.format("I said %s. And I can lay %d eggs per year.", VOICE, EGGS_COUNT);
    }

    @Override
    public boolean hasWings() {
        return true;
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public boolean canWalk() {
        return true;
    }

    @Override
    public boolean hasFins() {
        return false;
    }

    @Override
    public boolean canSwim() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + " " + talk();
    }
}
