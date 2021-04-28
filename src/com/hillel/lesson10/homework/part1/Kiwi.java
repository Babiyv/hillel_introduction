package com.hillel.lesson10.homework.part1;

public final class Kiwi extends Bird {

    private static final String ACTION = "run";
    private static final int SHELTER_COUNT = 50;

    public Kiwi(String name, String homeland) {
        super(name, homeland);
        super.featherDesc = "My feathers are like wool.";
    }

    public String run() {
      return String.format("Either I can %s fast.", ACTION) ;
    }

    public String additionalInfo() {
        return String.format("I have more than  %d shelters.", SHELTER_COUNT) ;
    }

    @Override
    public boolean hasWings() {
        return false;
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
        return false;
    }

    @Override
    protected String getWalkingGreeting() {
        return super.getWalkingGreeting() + " " + run() + " " + additionalInfo();
    }
}
