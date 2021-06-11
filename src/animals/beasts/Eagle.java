package animals.beasts;

import animals.Animal;
import animals.Oviparous;
import animals.movements.Flyer;

public class Eagle extends Oviparous implements Flyer {

    /**
     * @param name
     * @param gender
     * @param weight
     * @param size
     * @param age
     * @param incubationDelay
     */
    public Eagle(String name, Animal.Gender gender, double weight, double size, int age, int incubationDelay) {
        super(name, gender, weight, size, age, incubationDelay);
    }

    @Override
    public void fly() {

    }
}
