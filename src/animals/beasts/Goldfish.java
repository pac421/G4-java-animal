package animals.beasts;

import animals.Animal;
import animals.Oviparous;
import animals.movements.Swimmer;

public class Goldfish extends Oviparous implements Swimmer {

    public Goldfish(String name, Animal.Gender gender, double weight, double size, int age, int incubationDelay) {
        super(name, gender, weight, size, age, incubationDelay);
    }

    @Override
    public void swim() {
        System.out.println("Le poisson rouge fait le tour de l'aquarium.");
    }

    @Override
    public void talk() {
        System.out.println("*moment génant ou rien ne se passe*");
    }
}
