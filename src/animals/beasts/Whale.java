package animals.beasts;

import animals.Animal;
import animals.Mammal;
import animals.movements.Swimmer;

public class Whale extends Mammal implements Swimmer {

    /**
     * @param name
     * @param gender
     * @param weight
     * @param size
     * @param age
     * @param gestationDelay
     */
    public Whale(String name, Animal.Gender gender, double weight, double size, int age, int gestationDelay) {
        super(name, gender, weight, size, age, gestationDelay);
    }

    @Override
    public void swim() {

    }
}