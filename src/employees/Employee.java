package employees;

import UI.ConsoleColors;
import animals.*;
import pens.*;

/**
 * Employee Class
 */
public class Employee implements Runnable {
    /**
     * Enum Gender - Male or Female
     */
    public enum Gender {
        /**
         * Female
         */
        F,
        /**
         * Male
         */
        M
    }
    /**
     * {@link String} representing employee name
     */
    private String name;
    /**
     * {@link Employee.Gender} representing employee gender
     */
    private Gender gender;
    /**
     * {@link int} representing employee age - in years
     */
    private int age;

    /**
     * {@link int} representing employee energy level - /5
     */
    private int energyLevel;

    /**
     * Employee constructor without parameters
     */
    public Employee() {
        this.energyLevel = 5;
    }

    /**
     * Employee constructor with parameters
     * @param name Employee name
     * @param gender Employee Gender
     * @param age Employee age
     */
    public Employee(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.energyLevel = 5;
    }

    /**
     * Get employee name
     * @return {@link Employee#name}
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the {@link Employee#name}
     * @param name Employee name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get employee gender
     * @return {@link Employee#gender}
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the {@link Employee#gender}
     * @param gender Employee gender
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * Get employee age - in years
     * @return {@link Employee#age}
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the {@link Employee#age}
     * @param age Employee age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Get employee energy level
     * @return {@link Employee#energyLevel}
     */
    public int getEnergyLevel() {
        return energyLevel;
    }

    /**
     * Decrease {@link Employee#energyLevel}
     */
    public void decreaseEnergy() {
        this.energyLevel--;
        this.printEnergyLevel();
    }

    /**
     * Decrease {@link Employee#energyLevel}
     */
    public void increaseEnergy() {
        this.energyLevel++;
        System.out.println("\n" + ConsoleColors.GREEN_BOLD_BRIGHT + "+1 énergie" + ConsoleColors.RESET);
        this.printEnergyLevel();
    }

    /**
     * The employee looks at pen details
     * @param pen One existing pen
     */
    public void lookAtPen(Pen pen) {
        pen.showDetails();
    }

    /**
     * The employee cleans the chosen pen
     * @param pen One existing pen
     */
    public void cleanPen(Pen pen) {
        pen.clean();
    }

    /**
     * The employee feeds animals from the chosen pen
     * @param pen One existing pen
     */
    public void feedAnimals(Pen pen) {
        pen.feedAnimals();
    }

    /**
     * Print Employee description to string
     */
    public void printDescription() {
        System.out.println("Vous incarnez "+this.name+(this.gender == Gender.M ? ", un homme" : ", une femme")+" de "+this.age+" ans.");
        this.printEnergyLevel();
    }

    /**
     * Print Employee energy level to string
     */
    public void printEnergyLevel() {
        System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT + "Niveau d'énergie: " + this.energyLevel + "/5." + ConsoleColors.RESET);
    }

    /**
     * Launch action each 10 seconds : increase employee energy
     */
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(10000);

                if(this.energyLevel < 5) {
                    increaseEnergy();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
