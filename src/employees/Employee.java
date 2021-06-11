package employees;

import animals.*;
import pens.*;

public class Employee {
    public enum Gender {
        F, M
    }
    private String name;
    private Gender gender;
    private int age;

    public Employee(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String lookAtPen(Pen pen) {
        return "Enclos examiné";
    }

    public void cleanPen(Pen pen) {

    }

    public void feedAnimals(Pen pen) {

    }

    public void moveAnimal(Animal animal, Pen outComingPen, Pen inComingPen) {

    }
}
