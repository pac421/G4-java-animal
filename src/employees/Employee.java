package employees;

import animals.*;
import pens.*;

public class Employee {
    enum Gender {
        F, M
    }
    private String name;
    private Gender gender;
    private int age;

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
