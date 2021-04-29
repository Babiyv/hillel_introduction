package com.hillel.lesson12;

public class ObjectExample {

    private String someField;

    public ObjectExample(String someField){
        this.someField = someField;
    }

    public String getSomeField() {
        return someField;
    }

    public void setSomeField(String someField) {
        this.someField = someField;
    }

    @Override
    public String toString() {
        return "ObjectExample{" +
                "someField='" + someField + '\'' +
                '}';
    }
}
