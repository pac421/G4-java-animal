package animals.beasts;

import animals.Animal;
import animals.Oviparous;
import animals.movements.Flyer;
import animals.movements.Swimmer;
import animals.movements.Walker;

public class Penguin extends Oviparous implements Swimmer, Flyer, Walker {

    public Penguin(String name, Animal.Gender gender, double weight, double size, int age, int incubationDelay) {
        super(name, gender, weight, size, age, incubationDelay);
    }

    @Override
    public void fly() {
        System.out.println("Le pingouin s'élance dans les airs.");
    }

    @Override
    public void swim() {
        System.out.println("Le pingouin plonge dans l'eau tel une torpille.");
    }

    @Override
    public void walk() {
        System.out.println("Le pingouin marche en se dandinant.");
    }

    @Override
    public void talk() {
        System.out.println("BWAAK BWAAK");
    }
}
