package employees;

import animals.*;
import pens.*;

/**
 * Employee Class
 */
public class Employee {
    /**
     * Enum Gender - Male or Female
     */
    public enum Gender {
        F, M
    }
    /**
     * {@link String} representing employee name
     */
    private String name;
    /**
     * {@link Employee.Gender} representing employee gender
     */
    private Gender gender;
    /**
     * {@link int} representing employee age - in years
     */
    private int age;

    /**
     * Employee constructor without parameters
     */
    public Employee() {
    }

    /**
     * Employee constructor with parameters
     * @param name Employee name
     * @param gender Employee Gender
     * @param age Employee age
     */
    public Employee(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    /**
     * Get employee name
     * @return @return {@link Employee#name}
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the {@link Employee#name}
     * @param name Employee name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get employee gender
     * @return {@link Employee#gender}
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the {@link Employee#gender}
     * @param gender Employee gender
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * Get employee age - in years
     * @return {@link Employee#age}
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the {@link Employee#age}
     * @param age Employee age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * The employee looks at pen details
     * @param pen One existing pen
     */
    public void lookAtPen(Pen pen) {
        pen.showDetails();
    }

    /**
     * The employee cleans the chosen pen
     * @param pen One existing pen
     */
    public void cleanPen(Pen pen) {
        pen.clean();
    }

    /**
     * The employee feeds animals from the chosen pen
     * @param pen One existing pen
     */
    public void feedAnimals(Pen pen) {
        pen.feedAnimals();
    }

    /**
     * The employee move an animal from a pen to another
     * @param animal The animal to move
     * @param outComingPen The pen where the animal stays
     * @param inComingPen The pen where to move the animal on
     */
    public void moveAnimal(Animal animal, Pen outComingPen, Pen inComingPen) {

    }

    /**
     * @return Employee details to string
     */
    public void printDescription() {
        System.out.println("Vous incarnez "+this.name+(this.gender == Gender.M ? ", un homme" : ", une femme")+" de "+this.age+" ans.");
    }
}
