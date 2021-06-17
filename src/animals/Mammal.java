package animals;

/**
 * Mammal Class
 * Extends Animal Class
 */
public abstract class Mammal extends Animal{
    /**
     * {@link int} representing animal gestation delay
     */
    protected int gestationDelay;

    /**
     * @param name Animal name
     * @param gender Animal gender
     * @param weight Animal weight
     * @param size Animal size
     * @param age Animal age
     * @param gestationDelay Mammal gestation delay
     */
    public Mammal(String name, Gender gender, double weight, double size, int age, int gestationDelay) {
        super(name, gender, weight, size, age);
        this.gestationDelay = gestationDelay;
    }

    /**
     * @return {@link Mammal#gestationDelay}
     */
    public int getGestationDelay() {
        return gestationDelay;
    }

    /**
     * Sets the {@link Mammal#gestationDelay}
     * @param gestationDelay Animal gestation delay
     */
    public void setGestationDelay(int gestationDelay) {
        this.gestationDelay = gestationDelay;
    }

    /**
     * The mammal calves
     */
    public void calve() {
        if(this.gender == Gender.F){
            System.out.println("L'animal met bas..");
        } else
            System.out.println("Cet animal est un mâle -_-'");
    }
}
