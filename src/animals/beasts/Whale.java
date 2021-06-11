package animals.beasts;

import animals.Animal;
import animals.Mammal;
import animals.movements.Swimmer;

public class Whale extends Mammal implements Swimmer {

    public Whale(String name, Animal.Gender gender, double weight, double size, int age, int gestationDelay) {
        super(name, gender, weight, size, age, gestationDelay);
    }

    @Override
    public void swim() {
        System.out.println("La baleine nage paisiblement.. Dans un aquarium.. Plausible..");
    }

    @Override
    public void talk() {
        System.out.println("EEEEEEEEEEUUUUUUUUUUUUUUUUU!!!");
    }
}