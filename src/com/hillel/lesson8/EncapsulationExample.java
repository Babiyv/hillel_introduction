package com.hillel.lesson8;

// Инкапсуляция - сокрытие реализации, используется для обеспечения безопсности состояниея полей класса/объекта, а так же для скорытия ненужной реализации, для упрощения взаимодействия с объектами программы (от глаз пользователя или програмиста клиента).
public class EncapsulationExample {

    private String name;

    private int age;

    private String sex;

    public EncapsulationExample() { // - 1тип) "конструктор по умолчанию". Даже если мы его принудительно не создадим, то в момент коомпиляции Java сама его создаст. Но, только в том случае, если у мы ен создали другой конструктор с какими-то принимаемыми значениями.
    }

    public EncapsulationExample(String name) { // - 2тип) "конструктор с переменными" - принимает в ссебя переменные;
        this(34, "male");
        this.name = name;
    }

    public EncapsulationExample(int age, String sex) { // перезагрузка конструктора с переменными;
        this.age = age;
        this.sex = sex;
    }

    public EncapsulationExample(String name, int age, String sex) { // перезагрузка конструктора с переменными;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public EncapsulationExample(EncapsulationExample myObject){ // - 3тип)  "конструктор копирования" / "конструктор по объэкту";
        this.name = myObject.name;
        this.age = myObject.age;
        this.sex = myObject.sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("It`s not possible to have age less then 0");
            age = 0;
        } else {
            this.age = age;
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("male") || sex.equals("female")) {
            this.sex = sex;
        } else {
            System.out.println("It`s not possible to have sex different from male or female");
            this.sex = "male";
        }
    }

    @Override
    public String toString() {
        return "EncapsulationExample{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
