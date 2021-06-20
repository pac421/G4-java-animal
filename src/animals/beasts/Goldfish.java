package animals.beasts;

import animals.Animal;
import animals.Oviparous;
import animals.movements.Swimmer;

/**
 * Goldfish Class
 * Extends Oviparous Class
 * Implements Swimmer Interface
 */
public class Goldfish extends Oviparous implements Swimmer {

    /**
     * Goldfish constructor
     * @param name Animal name
     * @param gender Animal gender
     * @param weight Animal weight
     * @param size Animal size
     * @param age Animal age
     * @param incubationDelay Oviparous incubation delay
     */
    public Goldfish(String name, Animal.Gender gender, double weight, double size, int age, int incubationDelay) {
        super(name, gender, weight, size, age, incubationDelay);
    }

    /**
     * The goldfish swims
     */
    @Override
    public void swim() {
        System.out.println("Le poisson rouge fait le tour de l'aquarium.");
    }

    /**
     * The goldfish talks
     */
    @Override
    public void talk() {
        System.out.println("*moment génant ou rien ne se passe*");
    }
}
