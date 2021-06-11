package animals.beasts;

import animals.Animal;
import animals.Mammal;
import animals.movements.Walker;

public class Tiger extends Mammal implements Walker {

    public Tiger(String name, Animal.Gender gender, double weight, double size, int age, int gestationDelay) {
        super(name, gender, weight, size, age, gestationDelay);
    }

    @Override
    public void walk() {
        System.out.println("Le tigre marche et grimpe dans un arbre.");
    }

    @Override
    public void talk() {
        System.out.println("ROAAAR!!");
    }
}