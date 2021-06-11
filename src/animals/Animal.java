package animals;

import java.util.Random;

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
    protected int age, hunger, health;
    protected boolean isAsleep;

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

    public abstract void talk();

    public void takeCare() {
        System.out.println("État de santé de l'animal (sur 100) : "+this.health);
        if(this.health < 100){
            System.out.println("Soin de l'animal..");
            this.health = 100;
        }
        System.out.println("L'animal est en parfaite santé !");
    }

    public void switchIsAsleep() {
        isAsleep = !isAsleep;
        if(this.isAsleep)
            System.out.println("L'animal s'endort.");
        else
            System.out.println("L'animal se réveille.");
    }

    public void showDetails(){
        System.out.println(this.name+", "+this.gender+", "+this.weight+"kg, "+this.size+"cm, "+this.age+"ans, faim:"+this.hunger+", santé:"+this.health+", Endormi:"+this.isAsleep);
    }
}
