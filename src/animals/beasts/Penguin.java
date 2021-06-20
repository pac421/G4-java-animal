package animals.beasts;

import animals.Animal;
import animals.Oviparous;
import animals.movements.Flyer;
import animals.movements.Swimmer;
import animals.movements.Walker;

/**
 * Penguin Class
 * Extends Oviparous Class
 * Implements Swimmer, Flyer and Walker Interfaces
 */
public class Penguin extends Oviparous implements Swimmer, Flyer, Walker {

    /**
     * Penguin constructor
     * @param name Animal name
     * @param gender Animal gender
     * @param weight Animal weight
     * @param size Animal size
     * @param age Animal age
     * @param incubationDelay Oviparous incubation delay
     */
    public Penguin(String name, Animal.Gender gender, double weight, double size, int age, int incubationDelay) {
        super(name, gender, weight, size, age, incubationDelay);
    }

    /**
     * The penguin flies
     */
    @Override
    public void fly() {
        System.out.println("Le pingouin s'élance dans les airs.");
    }

    /**
     * The penguin swims
     */
    @Override
    public void swim() {
        System.out.println("Le pingouin plonge dans l'eau tel une torpille.");
    }

    /**
     * The penguin walks
     */
    @Override
    public void walk() {
        System.out.println("Le pingouin marche en se dandinant.");
    }

    /**
     * The penguin talks
     */
    @Override
    public void talk() {
        System.out.println("BWAAK BWAAK");
    }
}
