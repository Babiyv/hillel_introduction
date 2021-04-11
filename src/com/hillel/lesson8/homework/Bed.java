package com.hillel.lesson8.homework;

/*    · Создайте новый класс, у которого должно быть 9 переменных (8 примитивов + String);
    Для каждой переменной напишите getter и setter;
    Напишите конструкторы начиная от конструктора по-умолчанию до конструктора с 9 параметрами;*/

public class Bed {

    private byte oneByte;
    private short twoShort;
    private int threeInt;
    private long fourLong;
    private float fifeFloat;
    private double sixDouble;
    private char sevenChar;
    private boolean eightBoolean;
    private String nineString;

//     опять подвох в задании?)) вначале сказано написать геттеры и сеттеры, а только потом конструкторы?! Хотя вначале ж должны идти конструтокы?!)

    public Bed() {
    }

    public Bed(byte oneByte) {
        this.oneByte = oneByte;
    }

    public Bed(byte oneByte, short twoShort) {
        this.oneByte = oneByte;
        this.twoShort = twoShort;
    }

    public Bed(byte oneByte, short twoShort, int threeInt) {
        this.oneByte = oneByte;
        this.twoShort = twoShort;
        this.threeInt = threeInt;
    }

    public Bed(byte oneByte, short twoShort, int threeInt, long fourLong) {
        this.oneByte = oneByte;
        this.twoShort = twoShort;
        this.threeInt = threeInt;
        this.fourLong = fourLong;
    }

    public Bed(byte oneByte, short twoShort, int threeInt, long fourLong, float fifeFloat) {
        this.oneByte = oneByte;
        this.twoShort = twoShort;
        this.threeInt = threeInt;
        this.fourLong = fourLong;
        this.fifeFloat = fifeFloat;
    }

    public Bed(byte oneByte, short twoShort, int threeInt, long fourLong, float fifeFloat, double sixDouble) {
        this.oneByte = oneByte;
        this.twoShort = twoShort;
        this.threeInt = threeInt;
        this.fourLong = fourLong;
        this.fifeFloat = fifeFloat;
        this.sixDouble = sixDouble;
    }

    public Bed(byte oneByte, short twoShort, int threeInt, long fourLong, float fifeFloat, double sixDouble, char sevenChar) {
        this.oneByte = oneByte;
        this.twoShort = twoShort;
        this.threeInt = threeInt;
        this.fourLong = fourLong;
        this.fifeFloat = fifeFloat;
        this.sixDouble = sixDouble;
        this.sevenChar = sevenChar;
    }

    public Bed(byte oneByte, short twoShort, int threeInt, long fourLong, float fifeFloat, double sixDouble, char sevenChar, boolean eightBoolean) {
        this.oneByte = oneByte;
        this.twoShort = twoShort;
        this.threeInt = threeInt;
        this.fourLong = fourLong;
        this.fifeFloat = fifeFloat;
        this.sixDouble = sixDouble;
        this.sevenChar = sevenChar;
        this.eightBoolean = eightBoolean;
    }

    public Bed(byte oneByte, short twoShort, int threeInt, long fourLong, float fifeFloat, double sixDouble, char sevenChar, boolean eightBoolean, String nineString) {
        this.oneByte = oneByte;
        this.twoShort = twoShort;
        this.threeInt = threeInt;
        this.fourLong = fourLong;
        this.fifeFloat = fifeFloat;
        this.sixDouble = sixDouble;
        this.sevenChar = sevenChar;
        this.eightBoolean = eightBoolean;
        this.nineString = nineString;
    }


    public byte getOneByte() {
        return oneByte;
    }

    public void setOneByte(byte oneByte) {
        this.oneByte = oneByte;
    }

    public short getTwoShort() {
        return twoShort;
    }

    public void setTwoShort(short twoShort) {
        this.twoShort = twoShort;
    }

    public int getThreeInt() {
        return threeInt;
    }

    public void setThreeInt(int threeInt) {
        this.threeInt = threeInt;
    }

    public long getFourLong() {
        return fourLong;
    }

    public void setFourLong(long fourLong) {
        this.fourLong = fourLong;
    }

    public float getFifeFloat() {
        return fifeFloat;
    }

    public void setFifeFloat(float fifeFloat) {
        this.fifeFloat = fifeFloat;
    }

    public double getSixDouble() {
        return sixDouble;
    }

    public void setSixDouble(double sixDouble) {
        this.sixDouble = sixDouble;
    }

    public char getSevenChar() {
        return sevenChar;
    }

    public void setSevenChar(char sevenChar) {
        this.sevenChar = sevenChar;
    }

    public boolean getEightBoolean() {
        return eightBoolean;
    }

    public void setEightBoolean(boolean eightBoolean) {
        this.eightBoolean = eightBoolean;
    }

    public String getNineString() {
        return nineString;
    }

    public void setNineString(String nineString) {
        this.nineString = nineString;
    }

//    честно прописал все 160 строк кода выше без единого копи-паста и т.д.


    //    в задании нет, но для привычки решил сгенерить(нет сил прописывать) .toString ниже
    @Override
    public String toString() {
        return "Bed{" +
                "oneByte=" + oneByte +
                ", twoShort=" + twoShort +
                ", threeInt=" + threeInt +
                ", fourLong=" + fourLong +
                ", fifeFloat=" + fifeFloat +
                ", sixDouble=" + sixDouble +
                ", sevenChar=" + sevenChar +
                ", eightBoolean=" + eightBoolean +
                ", nineString='" + nineString + '\'' +
                '}';
    }
}
