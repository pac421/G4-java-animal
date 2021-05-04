package model.animals;

public class Oviparous extends Animal {
    protected int incubationDelay;

    public String lay() {
        if (gender == Gender.F) {
            return "Lay";
        }
        return "Cannot lay !";
    }
}
