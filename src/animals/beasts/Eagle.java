package animals.beasts;

import animals.Animal;
import animals.Oviparous;
import animals.movements.Flyer;

public class Eagle extends Oviparous implements Flyer {

    public Eagle(String name, Animal.Gender gender, double weight, double size, int age, int incubationDelay) {
        super(name, gender, weight, size, age, incubationDelay);
    }

    @Override
    public void fly() {
        System.out.println("L'eagle vol en cercle.");
    }

    @Override
    public void talk() {
        System.out.println("WRIIIII!!");
    }
}
