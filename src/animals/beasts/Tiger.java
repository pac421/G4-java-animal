package animals.beasts;

import animals.Animal;
import animals.Mammal;
import animals.movements.Walker;

/**
 * Tiger Class
 * Extends Mammal Class
 * Implements Walker interface
 */
public class Tiger extends Mammal implements Walker {

    /**
     * Tiger constructor
     * @param name Animal name
     * @param gender Animal gender
     * @param weight Animal weight
     * @param size Animal size
     * @param age Animal age
     * @param gestationDelay Mammal gestation delay
     */
    public Tiger(String name, Animal.Gender gender, double weight, double size, int age, int gestationDelay) {
        super(name, gender, weight, size, age, gestationDelay);
    }

    /**
     * The tiger walks
     */
    @Override
    public void walk() {
        System.out.println("Le tigre marche et grimpe dans un arbre.");
    }

    /**
     * The tiger talks
     */
    @Override
    public void talk() {
        System.out.println("ROAAAR!!");
    }
}