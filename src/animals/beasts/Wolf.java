package animals.beasts;

import animals.Animal;
import animals.Mammal;
import animals.movements.Walker;

/**
 * Wolf Class
 * Extends Mammal Class
 * Implements Walker interface
 */
public class Wolf extends Mammal implements Walker {

    /**
     * @param name Animal name
     * @param gender Animal gender
     * @param weight Animal weight
     * @param size Animal size
     * @param age Animal age
     * @param gestationDelay Mammal gestation delay
     */
    public Wolf(String name, Animal.Gender gender, double weight, double size, int age, int gestationDelay) {
        super(name, gender, weight, size, age, gestationDelay);
    }

    /**
     * The wolf walks
     */
    @Override
    public void walk() {
        System.out.println("Le loup gambade dans son enclos.");
    }

    /**
     * The wolf talks
     */
    @Override
    public void talk() {
        System.out.println("AHOUUUUUUUU!!");
    }
}
