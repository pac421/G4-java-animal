package pens;

import UI.ConsoleColors;
import animals.Animal;
import animals.movements.Swimmer;
import java.util.ArrayList;

/**
 * Aquarium Class
 * Extends Pen Class
 */
public class Aquarium extends Pen {
    /**
     * {@link Pen.State} representing aquarium depth state (Good, Correct or Bad)
     */
    private State depth;
    /**
     * {@link Pen.State} representing aquarium salinity state (Good, Correct or Bad)
     */
    private State salinity;

    /**
     * Aquarium constructor without any animal
     * @param name Pen name
     * @param area Pen area - in m2
     * @param maxAnimalsNumber Max animals number that can be in the pen
     */
    public Aquarium(String name, double area, int maxAnimalsNumber) {
        super(name, area, maxAnimalsNumber);
        this.depth = State.Good;
        this.salinity = State.Good;
    }

    /**
     * Aquarium constructor having animals
     * @param name Pen name
     * @param area Pen area - in m2
     * @param maxAnimalsNumber Max animals number that can be in the pen
     * @param animalsNumber Number of animals contained in the pen
     * @param animals ArrayList of animals contained in the pen
     */
    public Aquarium(String name, double area, int maxAnimalsNumber, int animalsNumber, ArrayList<? extends Animal> animals) {
        super(name, area, maxAnimalsNumber, animalsNumber, animals);
        this.depth = State.Good;
        this.salinity = State.Good;
    }

    /**
     * Clean the aquarium - cleanliness to State Good
     */
    public void clean() {
        System.out.println("État de propreté du bassin : "+this.cleanliness);
        if(this.cleanliness == State.Bad){
            System.out.println("Nettoyage du bassin à l'épuisette..");
            this.cleanliness = State.Good;
        }

        System.out.println("État de la profondeur du bassin : "+this.depth);
        if(this.depth == State.Bad){
            System.out.println("Ajustement de la profondeur de l'eau..");
            this.depth = State.Good;
        }

        System.out.println("État de l'indice de salinité de l'eau : "+this.salinity);
        if(this.salinity == State.Bad){
            System.out.println("Ajustement de l'indice de salinité de l'eau..");
            this.salinity = State.Good;
        }

        System.out.println(ConsoleColors.GREEN + "Le bassin est propre !" + ConsoleColors.RESET);
    }

    /**
     * Add an animal in the aquarium
     * @param animals  ArrayList of animals being in the aquarium
     * @param animal Animal to add in the aquarium
     * @param <T> Kind of animals being in the aquarium (Ex : Sharks, etc)
     */
    public <T extends Animal> void addAnimal(ArrayList<T> animals, T animal) {
        if(this.animalsNumber < this.maxAnimalsNumber){
            if (animal instanceof Swimmer){
                animals.add(animal);
                System.out.println("L'animal aime son nouveau bassin !");
            } else
                System.out.println("Ce n'est pas un animal marin -_-'");
        } else
            System.out.println("La cage est déjà pleine :(");
    }
}

