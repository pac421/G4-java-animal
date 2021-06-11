package pens;

import animals.*;

import java.util.TreeSet;

public class Pen {
    enum Cleanliness {
        Bad, Correct, Good
    }
    protected String name;
    protected double area;
    protected int maxAnimalsNumber;
    protected int animalsNumber;
    TreeSet<? extends Animal> animals;
    Cleanliness cleanliness;

    public void addAnimal() {

    }

    public void removeAnimal() {

    }

    public void feedAnimals() {

    }

    public void clean() {
        this.cleanliness = Cleanliness.Good;
        System.out.println("Nettoyage de le l'enclos..");
        System.out.println("L'enclos est désormais propre !");
    }

    public String toString() {
        return name;
    }
}
