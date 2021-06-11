package animals;

public abstract class Oviparous extends Animal {
    protected int incubationDelay;

    /**
     * @param name
     * @param gender
     * @param weight
     * @param size
     * @param age
     * @param incubationDelay
     */
    public Oviparous(String name, Gender gender, double weight, double size, int age, int incubationDelay) {
        super(name, gender, weight, size, age);
        this.incubationDelay = incubationDelay;
    }

    public int getIncubationDelay() {
        return incubationDelay;
    }

    public void setIncubationDelay(int incubationDelay) {
        this.incubationDelay = incubationDelay;
    }

    public String lay() {
        if (gender == Gender.F) {
            return "Lay";
        }
        return "Cannot lay !";
    }
}
