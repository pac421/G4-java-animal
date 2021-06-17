package animals.beasts;

import animals.Animal;
import animals.Oviparous;
import animals.movements.Flyer;

/**
 * Eagle Class
 * Extends Oviparous Class
 * Implements Flyer interface
 */
public class Eagle extends Oviparous implements Flyer {

    /**
     * @param name Animal name
     * @param gender Animal gender
     * @param weight Animal weight
     * @param size Animal size
     * @param age Animal age
     * @param incubationDelay Oviparous incubation delay
     */
    public Eagle(String name, Animal.Gender gender, double weight, double size, int age, int incubationDelay) {
        super(name, gender, weight, size, age, incubationDelay);
    }

    /**
     * The eagle flies
     */
    @Override
    public void fly() {
        System.out.println("L'eagle vol en cercle.");
    }

    /**
     * The eagle talks
     */
    @Override
    public void talk() {
        System.out.println("WRIIIII!!");
    }
}
