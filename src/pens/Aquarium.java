package pens;

import animals.Animal;
import animals.movements.Swimmer;
import java.util.ArrayList;

public class Aquarium extends Pen {
    private State depth;
    private State salinity;

    public Aquarium(String name, double area, int maxAnimalsNumber) {
        super(name, area, maxAnimalsNumber);
        this.depth = State.Good;
        this.salinity = State.Good;
    }

    public Aquarium(String name, double area, int maxAnimalsNumber, int animalsNumber, ArrayList<? extends Animal> animals) {
        super(name, area, maxAnimalsNumber, animalsNumber, animals);
        this.depth = State.Good;
        this.salinity = State.Good;
    }

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

        System.out.println("Le bassin est propre !");
    }

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

