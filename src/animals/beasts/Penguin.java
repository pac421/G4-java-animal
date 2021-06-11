package animals.beasts;

import animals.Animal;
import animals.Oviparous;
import animals.movements.Flyer;
import animals.movements.Swimmer;
import animals.movements.Walker;

public class Penguin extends Oviparous implements Swimmer, Flyer, Walker {

    /**
     * @param name
     * @param gender
     * @param weight
     * @param size
     * @param age
     * @param incubationDelay
     */
    public Penguin(String name, Animal.Gender gender, double weight, double size, int age, int incubationDelay) {
        super(name, gender, weight, size, age, incubationDelay);
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void walk() {

    }
}
