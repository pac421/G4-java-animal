package model.animals;

public class Mammal extends Animal{
    protected int gestationDelay;

    public String calve() {
        if (gender == Gender.F) {
            return "Calve";
        }
        return "Cannot calve !";
    }
}
