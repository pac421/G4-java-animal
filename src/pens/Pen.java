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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getMaxAnimalsNumber() {
        return maxAnimalsNumber;
    }

    public void setMaxAnimalsNumber(int maxAnimalsNumber) {
        this.maxAnimalsNumber = maxAnimalsNumber;
    }

    public int getAnimalsNumber() {
        return animalsNumber;
    }

    public void setAnimalsNumber(int animalsNumber) {
        this.animalsNumber = animalsNumber;
    }

    public TreeSet<? extends Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(TreeSet<? extends Animal> animals) {
        this.animals = animals;
    }

    public State getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(State cleanliness) {
        this.cleanliness = cleanliness;
    }

    public void addAnimal() {

    }

    public void removeAnimal() {

    }

    public void feedAnimals() {

    }

    public void clean() {
        System.out.println("État de propreté de l'enclos : "+this.cleanliness);
        if(this.cleanliness == State.Bad){
            System.out.println("Nettoyage de l'enclos..");
            this.cleanliness = State.Good;
        }
        System.out.println("L'enclos est propre !");
    }

    public String toString() {
        return name;
    }
}
