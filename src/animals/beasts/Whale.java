package animals.beasts;

import animals.Animal;
import animals.Mammal;
import animals.movements.Swimmer;

/**
 * Whale Class
 * Extends Mammal Class
 * Implements Swimmer interface
 */
public class Whale extends Mammal implements Swimmer {

    /**
     * @param name Animal name
     * @param gender Animal gender
     * @param weight Animal weight
     * @param size Animal size
     * @param age Animal age
     * @param gestationDelay Mammal gestation delay
     */
    public Whale(String name, Animal.Gender gender, double weight, double size, int age, int gestationDelay) {
        super(name, gender, weight, size, age, gestationDelay);
    }

    /**
     * The whale swims
     */
    @Override
    public void swim() {
        System.out.println("La baleine nage paisiblement.. Dans un aquarium.. Plausible..");
    }

    /**
     * The whale talks
     */
    @Override
    public void talk() {
        System.out.println("EEEEEEEEEEUUUUUUUUUUUUUUUUU!!!");
    }
}