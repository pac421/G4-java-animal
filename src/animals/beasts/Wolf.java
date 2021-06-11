package animals.beasts;

import animals.Animal;
import animals.Mammal;
import animals.movements.Walker;

public class Wolf extends Mammal implements Walker {

    public Wolf(String name, Animal.Gender gender, double weight, double size, int age, int gestationDelay) {
        super(name, gender, weight, size, age, gestationDelay);
    }

    @Override
    public void walk() {
        System.out.println("Le loup gambade dans son enclos.");
    }

    @Override
    public void talk() {
        System.out.println("AHOUUUUUUUU!!");
    }
}
