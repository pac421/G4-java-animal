package pens;

import animals.Animal;
import animals.movements.Flyer;
import java.util.ArrayList;

public class Aviary extends Pen {
    private float height;

    public Aviary(String name, double area, int maxAnimalsNumber, float height) {
        super(name, area, maxAnimalsNumber);
        this.height = height;
    }

    public Aviary(String name, double area, int maxAnimalsNumber, int animalsNumber, ArrayList<? extends Animal> animals, float height) {
        super(name, area, maxAnimalsNumber, animalsNumber, animals);
        this.height = height;
    }

    public void clean() {
        System.out.println("État de propreté de la volière : "+this.cleanliness);
        if(this.cleanliness == State.Bad){
            System.out.println("Nettoyage du sol de la volière..");
            System.out.println("Nettoyage du toit à "+this.height+" mètres de haut..");
            this.cleanliness = State.Good;
        }
        System.out.println("La volière est propre !");
    }

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
