package com.hillel.lesson7.homework;

/*Задача на работу с классом/объектами:
 о Создайте 2 Класса: Cat & Dog;
 о У каждого класса задайте по 3 параметра;
 о Создайте конструкторы без параметров, с 1, 2 и 3 параметрами;
 о Важно: Имена параметров классов и входящих параметров в конструкторах должны совпадать! (Используем this);
 о Создайте объекты описанных классов, используя все заданные конструкторы, в классе Main;

·  В классах Cat & Dog создайте для каждого из параметров два метода:
о Один метод должен записывать значение параметра (например: для name -> setName(String name));
о Второй метод должен возвращать значение необходимого параметра (например: для name -> getName());
о Для каждого параметра каждого класса должно быть 2 метода (1 set & 1 get);

· После чего попробуйте в классе Main задать параметры и вывести их значение в консоль обращаясь напрямую к параметрам и через созданные методы.

Пример:
// Создаем объект класса Cat
Cat cat = new Cat();
// Задаем имя напрямую обращаясь к параметру
cat.name = “Alex”;
// Печатаем напрямую обращаясь к параметру
System.out.println(cat.name);
// Задаем имя обращаясь к параметру через метод set
cat.setName(“Flex);
// Печатаем значение параметра обращаясь через get метод
System.out.println(cat.getName());
ps: Комментарии писать только если Вам необходимо как подсказка в будущем, для выполнения не обязательно.*/

public class Main {
    public static void main(String[] args) {

        Cat catNull = new Cat(); // - если бы мы не написали "= new Cat()", то у нас бы ничего и не создало?!
        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Murzik", "Siam");
        Cat cat3 = new Cat("Matylda", "Mexican", false);

        Dog dogNull = new Dog();
        Dog dog1 = new Dog("Pushok");
        Dog dog2 = new Dog("Sharik", "StreetBorzaya");
        Dog dog3 = new Dog("Rocket", "Malinois", true);

        System.out.println("cat3 parameters is: " + cat3);

        cat3.setName("Murka");
        System.out.println("cat3 parameters is: ".concat(cat3.toString())); // -  как правильнее? работает одинаково, но вроде как через плюсик зашквар же ж? а на паре вообще была запись ""...is: " + dima.toString());"

        System.out.println("Breed of cat2 is: " + cat2.getBreed());

        System.out.println(dog3);
        dog3.setName("Fury");
        dog3.setIsMale(false);
        System.out.println("Dog3 parameters after changes: " + dog3);
    }
}
