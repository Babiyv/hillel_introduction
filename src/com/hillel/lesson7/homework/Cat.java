package com.hillel.lesson7.homework;

public class Cat {

    private String name = new String();
    private String breed = new String();
    private boolean isMale = true;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public Cat(String name, String breed, boolean isMale) {
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
        this.name = name;
    }

    public boolean getIsMale() {
        return isMale;
    }

    public void setIsMale(boolean trueIfMale) {
        this.isMale = trueIfMale;
    }

    @Override
    public String toString() {
        return /*"Cat{" +*/ // - специально убрал это, потому что не нравится как оно вывожи на консоль)
                "name='" + name + '\'' +
                        ", breed='" + breed + '\'' +
                        ", isMale=" + isMale /* +
                '}'*/;
    }
}
