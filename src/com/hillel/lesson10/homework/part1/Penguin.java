package com.hillel.lesson10.homework.part1;

public final class Penguin extends Bird {

    private static final int BREATH_HOLD_TIME = 18;
    private static final int SWIM_DEPTH = 530;

    public Penguin(String name, String homeland) {
        super(name, homeland);
        super.featherDesc = "My feathers are very short and thin.";
    }

    public String swimAction() {
        return String.format("I can hold my breath on %d minutes. And dive on the %s meters depth.", BREATH_HOLD_TIME, SWIM_DEPTH) ;
    }

    @Override
    public boolean hasWings() {
        return true;
    }

    @Override
    public boolean canFly() {
        return false;
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
        return super.toString() + " " + swimAction();
    }
}
