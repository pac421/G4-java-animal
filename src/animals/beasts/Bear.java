package animals.beasts;

import animals.Animal;
import animals.Mammal;
import animals.movements.Walker;

/**
 * Class Bear
 * Extends Mammal Class
 * Implements Walker Interface
 */
public class Bear extends Mammal implements Walker {

    /**
     * @param name Animal name
     * @param gender Animal gender
     * @param weight Animal weight
     * @param size Animal size
     * @param age Animal age
     * @param gestationDelay Mammal gestation delay
     */
    public Bear(String name, Animal.Gender gender, double weight, double size, int age, int gestationDelay) {
        super(name, gender, weight, size, age, gestationDelay);
    }

    /**
     * The bear walks
     */
    @Override
    public void walk() {
        System.out.println("L'ours se balade et se gratte le dos contre un arbre.");
    }

    /**
     * The bear talks
     */
    @Override
    public void talk() {
        System.out.println("GREEEE!!");
    }
}
