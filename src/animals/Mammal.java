package animals;

public abstract class Mammal extends Animal{
    protected int gestationDelay;

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

    public void calve() {
        if(this.gender == Gender.F){
            System.out.println("L'animal met bas..");
        } else
            System.out.println("Cet animal est un mâle -_-'");
    }
}
