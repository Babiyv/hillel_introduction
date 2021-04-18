package com.hillel.lesson9;

public class Cat extends Animal {

    private int energy;

//    если в родительском классе определен хотя бы один конструктор, то в классе-наследнике необходимо определить хотя бы один конструктор с вызовом родительского конструктора (командой "super"), иначе будет ошибка.
    public Cat(String name, int age) {
        super(name, age); // super - всегда стоит первым; аналог this, только ссылается не в пределах текущего класса, а на родительский;
        this.energy = 100;
    }

    @Override
    public void getAnimalSound() {
        System.out.println("cat sound: Miua");
    }

    public void play(){
        if (energy > 0) {
            System.out.println("cat is playing");
            energy = energy - 30;
            System.out.println("cat energy: " + energy);
        } else {
            System.out.println("cat is tired: energy is low level");
        }
    }


}
