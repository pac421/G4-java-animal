package animals;

public abstract class Animal {
    enum Gender {
        F, M
    }
    protected String name;
    protected Gender gender;
    protected double weight, size;
    protected int age;
    protected int hunger, health;
    protected boolean isAsleep;

    public void eat() {
        if (!isAsleep) {

        }
    }

    public void switchIsAsleep() {
        isAsleep = !isAsleep;
    }

    public String talk() {
        return "Roar";
    }

    public void takeCare() {

    }
}
