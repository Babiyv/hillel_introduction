package com.hillel.lesson8.homework;

/*    · Создайте класс с 3 параметрами final. Создайте в нем конструктор по-умолчанию и конструктор со всеми параметрами.
    Создайте для всех полей getter и setter.
        ps: Задание с подвохом. Если что-то заметили, закомментируйте эту  часть кода и напишите комментарий.*/

public class Chairs {
//    первые догадки про возможный подвох уже написал в главном классе):
//    " сходу кажется, что подвоха два:
//         1. объявлять константную переменную нужно в аппере кейсе (но это как-то слабый подвох)),
//         2. объявлять константу нужно не в самом классе объекта, а в главном (иначе не будут работать сетеры)."

/*   кажется таки угадал)
    static final String MATERIAL = new String();
    static final String COLOR = new String();
    static final boolean IS_IT_ADJUSTABLE = true; // - заставило явно присвоить какое-то значение;*/

    private String material;
    private String color;
    private boolean isItAdjustable;

    public Chairs() { // <- конструтор по умолчанию;
    }

    public Chairs(String material, String color, boolean isItAdjustable) { // <- конструктор со всеми переменными. Хотел попробовать вносить в него сразу 3 параметрами final, но понял, что не будут работать сетеры;
        this.material = material;
        this.color = color;
        this.isItAdjustable = isItAdjustable;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isItAdjustable() {
        return isItAdjustable;
    }

    public void setItAdjustable(boolean itAdjustable) {
        isItAdjustable = itAdjustable;
    }

//    не было сил уже что-то делать с красивыми выводами
    @Override
    public String toString() {
        return "Chairs{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", isItAdjustable=" + isItAdjustable +
                '}';
    }
}
