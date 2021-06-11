package pens;

import animals.*;
import java.util.ArrayList;

public class Pen {
    protected enum State {
        Bad, Correct, Good
    }
    protected String name;
    protected double area;
    protected int maxAnimalsNumber;
    protected int animalsNumber;
    ArrayList<? extends Animal> animals;
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

    public State getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(State cleanliness) {
        this.cleanliness = cleanliness;
    }

    public <T extends Animal> void addAnimal(ArrayList<T> animals, T animal) {
        if(this.animalsNumber < this.maxAnimalsNumber){
            animals.add(animal);
            this.animalsNumber++;
            System.out.println("L'animal aime son nouvel enclos !");
        } else
            System.out.println("La cage est déjà pleine :(");

    }

    public <T extends Animal> void removeAnimal(ArrayList<T> animals, T animal) {
        if(animals.contains(animal)){
            animals.remove(animal);
            this.animalsNumber--;
            System.out.println("L'animal a bien été retiré !");
        } else
            System.out.println("L'animal n'est pas dans cette cage :(");

    }

    public void feedAnimals() {
        if(this.animalsNumber > 0)
            this.animals.forEach(Animal::feed);
        else
            System.out.println("La cage est vide.");
    }

    public void clean() {
        System.out.println("État de propreté de l'enclos : "+this.cleanliness);
        if(this.cleanliness == State.Bad){
            System.out.println("Nettoyage de l'enclos..");
            this.cleanliness = State.Good;
        }
        System.out.println("L'enclos est propre !");
    }

    public void showDetails() {
        System.out.println("Enclos");
        System.out.println(this.name+", "+this.area+"m2, "+this.animalsNumber+"/"+this.maxAnimalsNumber+", État:"+this.cleanliness);
        System.out.println("Animaux :");
        this.animals.forEach(Animal::showDetails);
    }
}
