package animals;

import java.util.Random;

/**
 * Abstract class Animal - representing any type of animal
 */
public abstract class Animal {
    /**
     * Enum - Male or Female
     */
    public enum Gender {
        F, M
    }
    /**
     * {@link String} representing animal name
     */
    protected String name;
    /**
     * {@link Gender} representing animal gender
     */
    protected Gender gender;
    /**
     * {@link double} representing animal weight - in kg
     */
    protected double weight;
    /**
     * {@link double} representing animal size - in cm
     */
    protected double size;
    /**
     * {@link int} representing animal age - in year
     */
    protected int age;
    /**
     * {@link int} representing hunger indice - Between 0 and 100
     */
    protected int hunger;
    /**
     * {@link int} representing health indice - Between 0 and 100
     */
    protected int health;
    /**
     * {@link boolean} Is the animal asleep ?
     */
    protected boolean isAsleep;

    /**
     * @param name Animal name
     * @param gender Animal Gender
     * @param weight Animal Weight (in kg)
     * @param size Animal Size (in cm)
     * @param age Animal age (in year)
     */
    public Animal(String name, Gender gender, double weight, double size, int age) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.size = size;
        this.age = age;
        this.hunger = 100;
        this.health = 100;
        this.isAsleep = new Random().nextBoolean();
    }

    /**
     * @return {@link Animal#name}
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the {@link Animal#name}
     * @param name Animal name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return {@link Animal#gender}
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the {@link Animal#gender}
     * @param gender Animal gender
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * @return {@link Animal#weight}
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the {@link Animal#weight}
     * @param weight Animal weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return {@link Animal#size}
     */
    public double getSize() {
        return size;
    }

    /**
     * Sets the {@link Animal#size}
     * @param size Animal size
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * @return {@link Animal#age}
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the {@link Animal#age}
     * @param age Animal age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return {@link Animal#hunger}
     */
    public int getHunger() {
        return hunger;
    }

    /**
     * Sets the {@link Animal#hunger}
     * @param hunger Animal hunger
     */
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    /**
     * @return {@link Animal#health}
     */
    public int getHealth() {
        return health;
    }

    /**
     * Sets the {@link Animal#health}
     * @param health Animal health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return {@link Animal#isAsleep}
     */
    public boolean isAsleep() {
        return isAsleep;
    }

    /**
     * Sets the {@link Animal#isAsleep}
     * @param asleep Animal asleep
     */
    public void setAsleep(boolean asleep) {
        isAsleep = asleep;
    }

    /**
     * Feed the animal putting {@link Animal#hunger} to 100/100
     */
    public void feed() {
        if (this.isAsleep)
            System.out.println("L'animal dort.");
        else {
            System.out.println("État de la faim de l'animal (sur 100) : "+this.hunger);
            if(this.hunger < 100){
                System.out.println("Nourrissage de l'animal..");
                this.hunger = 100;
            }
            System.out.println("L'animal à le ventre plein !");
        }
    }

    /**
     * The animal talks
     */
    public abstract void talk();

    /**
     * Takes care of animal putting {@link Animal#health} to 100/100
     */
    public void takeCare() {
        System.out.println("État de santé de l'animal (sur 100) : "+this.health);
        if(this.health < 100){
            System.out.println("Soin de l'animal..");
            this.health = 100;
        }
        System.out.println("L'animal est en parfaite santé !");
    }

    /**
     * If the animal is asleep -> wakes it up
     * If the animal is awake -> it is asleep
     * Switch {@link Animal#isAsleep}
     */
    public void switchIsAsleep() {
        isAsleep = !isAsleep;
        if(this.isAsleep)
            System.out.println(this.name+" s'endort.");
        else
            System.out.println(this.name+" se réveille.");
    }

    /**
     * Shows details about the animal
     */
    public void showDetails(){
        System.out.println("- "+this.name+", "+this.gender+", "+this.weight+"kg, "+this.size+"cm, "+this.age+" ans, faim: "+this.hunger+"/100, santé: "+this.health+"/100, "+(this.isAsleep ? "Endormi" : "Éveillé"));
    }
}
