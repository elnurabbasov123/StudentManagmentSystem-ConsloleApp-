package bean;

import java.io.Serializable;

public abstract class Person implements Serializable {
    private int age;
    private String surname;
    private String name;

    Person(){
    }

   Person(int age, String name,String surname) {
        this.age = age;
        this.name = name;
        this.surname=surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name+" "+surname;
    }
}
