package animals.beasts;

import animals.Animal;
import animals.Oviparous;
import animals.movements.Swimmer;

public class Shark extends Oviparous implements Swimmer {

    public Shark(String name, Animal.Gender gender, double weight, double size, int age, int incubationDelay) {
        super(name, gender, weight, size, age, incubationDelay);
    }

    @Override
    public void swim() {
        System.out.println("Le requin nage.. Comme d'habitude.. Sinon il meurt..");
    }

    @Override
    public void talk() {
        System.out.println("*bruit de vague*");
    }
}
