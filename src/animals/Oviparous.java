package animals;

/**
 * Oviparous Class
 * Extends Animal
 */
public abstract class Oviparous extends Animal {
    /**
     * {@link int} representing animal incubation delay
     */
    protected int incubationDelay;

    /**
     * @param name Animal name
     * @param gender Animal gender
     * @param weight Animal weight
     * @param size Animal size
     * @param age Animal age
     * @param incubationDelay Oviparous incubation delay
     */
    public Oviparous(String name, Gender gender, double weight, double size, int age, int incubationDelay) {
        super(name, gender, weight, size, age);
        this.incubationDelay = incubationDelay;
    }

    /**
     * @return {@link Oviparous#incubationDelay}
     */
    public int getIncubationDelay() {
        return incubationDelay;
    }

    /**
     * Sets the {@link Oviparous#incubationDelay}
     * @param incubationDelay incubation delay
     */
    public void setIncubationDelay(int incubationDelay) {
        this.incubationDelay = incubationDelay;
    }

    /**
     * The oviparous lays
     */
    public void lay() {
        if(this.gender == Gender.F){
            System.out.println("L'animal pond des oeufs..");
        } else
            System.out.println("Cet animal est un mâle -_-'");
    }
}
