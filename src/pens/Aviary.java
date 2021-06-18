package pens;

import animals.Animal;
import animals.movements.Flyer;
import java.util.ArrayList;

/**
 * Aviary Class
 * Extends Pen Class
 */
public class Aviary extends Pen {
    /**
     * {@link Pen.State} representing aviary height state (Good, Correct or Bad)
     */
    private State height;

    /**
     * Aviary constructor without any animal
     * @param name Pen name
     * @param area Pen area - in m2
     * @param maxAnimalsNumber Max animals number that can be in the pen
     */
    public Aviary(String name, double area, int maxAnimalsNumber) {
        super(name, area, maxAnimalsNumber);
        this.height = State.Good;
    }

    /**
     * Aviary constructor having animals
     * @param name Pen name
     * @param area Pen area - in m2
     * @param maxAnimalsNumber Max animals number that can be in the pen
     * @param animalsNumber Number of animals contained in the pen
     * @param animals ArrayList of animals contained in the pen
     */
    public Aviary(String name, double area, int maxAnimalsNumber, int animalsNumber, ArrayList<? extends Animal> animals) {
        super(name, area, maxAnimalsNumber, animalsNumber, animals);
        this.height = State.Good;
    }

    /**
     * Clean the aviary - cleanliness to State Good
     */
    public void clean() {
        System.out.println("État de propreté de la volière : "+this.cleanliness);
        if(this.cleanliness == State.Bad){
            System.out.println("Nettoyage du sol de la volière..");
            this.cleanliness = State.Good;
        }
        System.out.println("La volière est propre !");
    }

    /**
     * Add an animal in the aviary
     * @param animals  ArrayList of animals being in the aviary
     * @param animal Animal to add in the aviary
     * @param <T> Kind of animals being in the aviary (Ex : Bears, etc)
     */
    public <T extends Animal> void addAnimal(ArrayList<T> animals, T animal) {
        if(this.animalsNumber < this.maxAnimalsNumber){
            if (animal instanceof Flyer){
                animals.add(animal);
                System.out.println("L'oiseau aime sa nouvelle volière !");
            } else
                System.out.println("Ce n'est pas un oiseau -_-'");
        } else
            System.out.println("La cage est déjà pleine :(");
    }
}
