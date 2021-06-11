package animals.beasts;

import animals.Animal;
import animals.Oviparous;
import animals.movements.Swimmer;

public class Shark extends Oviparous implements Swimmer {

    /**
     * @param name
     * @param gender
     * @param weight
     * @param size
     * @param age
     * @param incubationDelay
     */
    public Shark(String name, Animal.Gender gender, double weight, double size, int age, int incubationDelay) {
        super(name, gender, weight, size, age, incubationDelay);
    }

    @Override
    public void swim() {

    }
}
