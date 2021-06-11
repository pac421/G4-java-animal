package animals;

public abstract class Oviparous extends Animal {
    protected int incubationDelay;

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

    public void lay() {
        if(this.gender == Gender.F){
            System.out.println("L'animal pond des oeufs..");
        } else
            System.out.println("Cet animal est un mâle -_-'");
    }
}
