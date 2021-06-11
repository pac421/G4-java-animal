package animals.beasts;

import animals.Animal;
import animals.Mammal;
import animals.movements.Walker;

public class Tiger extends Mammal implements Walker {

    /**
     * @param name
     * @param gender
     * @param weight
     * @param size
     * @param age
     * @param gestationDelay
     */
    public Tiger(String name, Animal.Gender gender, double weight, double size, int age, int gestationDelay) {
        super(name, gender, weight, size, age, gestationDelay);
    }

    @Override
    public void walk() {

    }
}