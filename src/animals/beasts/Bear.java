package animals.beasts;

import animals.Animal;
import animals.Mammal;
import animals.movements.Walker;

public class Bear extends Mammal implements Walker {

    public Bear(String name, Animal.Gender gender, double weight, double size, int age, int gestationDelay) {
        super(name, gender, weight, size, age, gestationDelay);
    }

    @Override
    public void walk() {
        System.out.println("L'ours se balade et se gratte le dos contre un arbre.");
    }

    @Override
    public void talk() {
        System.out.println("GREEEE!!");
    }
}
