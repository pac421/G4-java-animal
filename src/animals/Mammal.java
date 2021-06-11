package animals;

public abstract class Mammal extends Animal{
    protected int gestationDelay;

    /**
     * @param name
     * @param gender
     * @param weight
     * @param size
     * @param age
     * @param gestationDelay
     */
    public Mammal(String name, Gender gender, double weight, double size, int age, int gestationDelay) {
        super(name, gender, weight, size, age);
        this.gestationDelay = gestationDelay;
    }

    public int getGestationDelay() {
        return gestationDelay;
    }

    public void setGestationDelay(int gestationDelay) {
        this.gestationDelay = gestationDelay;
    }

    public String calve() {
        if (gender == Gender.F) {
            return "Calve";
        }
        return "Cannot calve !";
    }
}
