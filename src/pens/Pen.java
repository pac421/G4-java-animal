package pens;

import animals.*;

import java.util.TreeSet;

public class Pen {
    protected enum State {
        Bad, Correct, Good
    }
    protected String name;
    protected double area;
    protected int maxAnimalsNumber;
    protected int animalsNumber;
    TreeSet<? extends Animal> animals;
    State cleanliness;

    public void addAnimal() {

    }

    public void removeAnimal() {

    }

    public void feedAnimals() {

    }

    public void clean() {
        this.cleanliness = State.Good;
        System.out.println("Nettoyage de le l'enclos..");
        System.out.println("L'enclos est désormais propre !");
    }

    public String toString() {
        return name;
    }
}
