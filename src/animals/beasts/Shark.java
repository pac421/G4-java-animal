package animals.beasts;

import animals.Animal;
import animals.Oviparous;
import animals.movements.Swimmer;

/**
 * Shark Class
 * Extends Oviparous Class
 * Implements Swimmer Interface
 */
public class Shark extends Oviparous implements Swimmer {

    /**
     * @param name Animal name
     * @param gender Animal gender
     * @param weight Animal weight
     * @param size Animal size
     * @param age Animal age
     * @param incubationDelay Oviparous incubation delay
     */
    public Shark(String name, Animal.Gender gender, double weight, double size, int age, int incubationDelay) {
        super(name, gender, weight, size, age, incubationDelay);
    }

    /**
     * The shark swims
     */
    @Override
    public void swim() {
        System.out.println("Le requin nage.. Comme d'habitude.. Sinon il meurt..");
    }

    /**
     * The shark talks
     */
    @Override
    public void talk() {
        System.out.println("*bruit de vague*");
    }
}
