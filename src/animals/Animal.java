package animals;

/**
 * Abstract class Animal
 */
public abstract class Animal {
    protected enum Gender {
        F, M
    }
    protected String name;
    protected Gender gender;
    protected double weight, size;
    protected int age;
    protected int hunger, health;
    protected boolean isAsleep;


    /**
     * @param name
     * @param gender
     * @param weight
     * @param size
     * @param age
     */
    public Animal(String name, Gender gender, double weight, double size, int age) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.size = size;
        this.age = age;
        this.hunger = 100;
        this.health = 100;
        this.isAsleep = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isAsleep() {
        return isAsleep;
    }

    public void setAsleep(boolean asleep) {
        isAsleep = asleep;
    }

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
