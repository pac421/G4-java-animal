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

    public Employee() {
    }

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

    public void lookAtPen(Pen pen) {
        pen.showDetails();
    }

    public void cleanPen(Pen pen) {
        pen.clean();
    }

    public void feedAnimals(Pen pen) {
        pen.feedAnimals();
    }

    public void moveAnimal(Animal animal, Pen outComingPen, Pen inComingPen) {

    }

    @Override
    public String toString() {
        return this.name+(this.gender == Gender.M ? ", un homme" : " une femme")+" de "+this.age+" ans";
    }
}
