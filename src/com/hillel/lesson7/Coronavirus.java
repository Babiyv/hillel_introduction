package com.hillel.lesson7;

import java.util.Random;

public class Coronavirus {

    private boolean isCureResearched = false;

    private String coronavirusType;

    private boolean isCuredAndDestroyed = false; // - false был бы и так, как значение по умолчанию для булеанов, но мы просто прописали, чтобы была более наглядна логика

    public Coronavirus(String coronavirusType) {
        this.coronavirusType = coronavirusType;
    }

    public String getCoronavirusType() {
        return coronavirusType;
    }

    public void setCoronavirusType(String coronavirusType) {
        this.coronavirusType = coronavirusType;
    }

    public boolean isCuredAndDestroyed() {
        return isCuredAndDestroyed;
    }

    public void setCuredAndDestroyed(boolean curedAndDestroyed) {
        isCuredAndDestroyed = curedAndDestroyed;
    }

    public void attack(Human human){
        if (human.getHealth() > 0 || (isCureResearched = false)) {
            int damage = getRandomInt(0, human.getHealth());
            human.setHealth(damage);
        }
        System.out.println("Coronavirus attacking human ".concat(human.getName()));
        System.out.println("Human health stratus: " + human.getHealth());
    }


    private int getRandomInt(int min, int max){
        Random randomHealthDamage = new Random();
        return randomHealthDamage.ints(min, max)
                .findFirst()
                .getAsInt();
    }

    @Override
    public String toString() {
        return "Coronavirus{" +
                "coronavirusType='" + coronavirusType + '\'' +
                ", isCuredAndDestroyed=" + isCuredAndDestroyed +
                '}';
    }
}
