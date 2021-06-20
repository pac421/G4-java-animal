package pens;

import UI.ConsoleColors;
import animals.*;
import employees.Employee;

import java.util.ArrayList;

/**
 * Pen class
 */
public class Pen {
    /**
     * Enum State
     * Bad, Correct or Good
     */
    public enum State {
        /**
         * Bad state
         */
        Bad,
        /**
         * Correct State
         */
        Correct,
        /**
         * Good State
         */
        Good
    }

    /**
     * {@link String} representing pen name
     */
    protected String name;
    /**
     * {@link double} representing pen area - in m2
     */
    protected double area;
    /**
     * {@link int} representing max animals number that can be in the pen
     */
    protected int maxAnimalsNumber;
    /**
     * {@link int} representing how many animals contains the pen
     */
    protected int animalsNumber;
    /**
     * {@link ArrayList} a list of all animals the pen contains
     */
    ArrayList<? extends Animal> animals;
    /**
     * {@link Pen.State} representing pen cleanliness (Good, Correct or Bad)
     */
    State cleanliness;

    /**
     * Pen constructor without any animal
     * @param name Pen name
     * @param area Pen area - in m2
     * @param maxAnimalsNumber Max animals number that can be in the pen
     */
    public Pen(String name, double area, int maxAnimalsNumber) {
        this.name = name;
        this.area = area;
        this.maxAnimalsNumber = maxAnimalsNumber;
        this.animalsNumber = 0;
        this.cleanliness = State.Good;
    }

    /**
     * Pen constructor having animals
     * @param name Pen name
     * @param area Pen area - in m2
     * @param maxAnimalsNumber Max animals number that can be in the pen
     * @param animalsNumber Number of animals contained in the pen
     * @param animals ArrayList of animals contained in the pen
     */
    public Pen(String name, double area, int maxAnimalsNumber, int animalsNumber, ArrayList<? extends Animal> animals) {
        this.name = name;
        this.area = area;
        this.maxAnimalsNumber = maxAnimalsNumber;
        this.animalsNumber = animalsNumber;
        this.animals = animals;
        this.cleanliness = State.Good;
    }

    /**
     * Get pen name
     * @return {@link Pen#name}
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the {@link Pen#name}
     * @param name Pen name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get pen area
     * @return {@link Pen#area}
     */
    public double getArea() {
        return area;
    }

    /**
     * Sets the {@link Pen#area}
     * @param area Pen area
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Get max animals number that can be in the pen
     * @return {@link Pen#maxAnimalsNumber}
     */
    public int getMaxAnimalsNumber() {
        return maxAnimalsNumber;
    }

    /**
     * Sets the {@link Pen#maxAnimalsNumber}
     * @param maxAnimalsNumber Max animals number that can be in the pen
     */
    public void setMaxAnimalsNumber(int maxAnimalsNumber) {
        this.maxAnimalsNumber = maxAnimalsNumber;
    }

    /**
     * Get how many animals contains the pen
     * @return {@link Pen#animalsNumber}
     */
    public int getAnimalsNumber() {
        return animalsNumber;
    }

    /**
     * Sets the {@link Pen#animalsNumber}
     * @param animalsNumber Number of animals being in the pen
     */
    public void setAnimalsNumber(int animalsNumber) {
        this.animalsNumber = animalsNumber;
    }

    /**
     * Get pen cleanliness
     * @return {@link Pen#cleanliness}
     */
    public State getCleanliness() {
        return cleanliness;
    }

    /**
     * Sets the {@link Pen#cleanliness}
     * @param cleanliness Pen cleanliness state
     */
    public void setCleanliness(State cleanliness) {
        this.cleanliness = cleanliness;
    }

    /**
     * Get animals that are in the pen
     * @return {@link Pen#animals}
     */
    public ArrayList<? extends Animal> getAnimals() {
        return animals;
    }

    /**
     * Add an animal in the pen if it's not full
     * @param animals  ArrayList of animals being in the pen
     * @param animal Animal to add in the pen
     * @param <T> Kind of animals being in the pen (Ex : Bears, Sharks, etc)
     */
    public <T extends Animal> void addAnimal(ArrayList<T> animals, T animal) {
        if(this.animalsNumber < this.maxAnimalsNumber){
            animals.add(animal);
            this.animals = animals;
            this.animalsNumber++;
            System.out.println("L'animal aime son nouvel enclos !");
        } else
            System.out.println("La cage est déjà pleine :(");

    }

    /**
     * Remove an animal from the pen if the animal is in this pen
     * @param animals  ArrayList of animals being in the pen
     * @param animal Animal to remove from the pen
     * @param <T> Kind of animals being in the pen (Ex : Bears, Sharks, etc)
     */
    public <T extends Animal> void removeAnimal(ArrayList<T> animals, T animal) {
        if(animals.contains(animal)){
            animals.remove(animal);
            this.animals = animals;
            this.animalsNumber--;
            System.out.println("L'animal a bien été retiré !");
        } else
            System.out.println("L'animal n'est pas dans cette cage :(");

    }

    /**
     * Feed animals being in the pen
     */
    public void feedAnimals() {
        if(this.animalsNumber > 0)
            this.animals.forEach(Animal::feed);
        else
            System.out.println(ConsoleColors.RED + "La cage est vide." + ConsoleColors.RESET);
    }

    /**
     * Take care of animals being in the pen
     */
    public void takeCareOfAnimals() {
        if(this.animalsNumber > 0)
            this.animals.forEach(Animal::takeCare);
        else
            System.out.println("La cage est vide.");
    }

    /**
     * Clean the pen - cleanliness to State Good
     */
    public void clean() {
        System.out.println("État de propreté de l'enclos : "+this.cleanliness);
        if(this.cleanliness == State.Bad){
            System.out.println("Nettoyage de l'enclos..");
            this.cleanliness = State.Good;
        }
        System.out.println(ConsoleColors.GREEN + "L'enclos est propre !" + ConsoleColors.RESET);
    }

    /**
     * Print pen details
     */
    public void showDetails() {
        System.out.println(ConsoleColors.PURPLE + "---\n\"" + this.name+"\", enclos de "+this.area+"m2, nombre d'animaux: "+this.animalsNumber+"/"+this.maxAnimalsNumber+", État: "+this.cleanliness + ", animaux :" + ConsoleColors.RESET);
        if (this.animals != null) {
            this.animals.forEach(Animal::showDetails);
        } else {
            System.out.println("Aucun animal dans cet enclos");
        }
    }
}
