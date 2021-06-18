package zoos;

import employees.*;
import pens.*;
import java.util.ArrayList;

/**
 * Zoo Class
 */
public class Zoo {
    /**
     * {@link String} representing zoo name
     */
    private String name;
    /**
     * {@link Employee} representing zoo employee
     */
    private Employee employee;
    /**
     * {@link int} representing max pens number that can be in the zoo
     */
    private int maxPensNumber;
    /**
     * {@link ArrayList} lists pens that zoo contains
     */
    private ArrayList<Pen> pens;

    /**
     * Zoo constructor
     * @param name Zoo name
     * @param employee Employee
     * @param maxPensNumber Max pens number that can be in the zoo
     * @param pens Lists pens that zoo contains
     */
    public Zoo(String name, Employee employee, int maxPensNumber, ArrayList<Pen> pens) {
        this.name = name;
        this.employee = employee;
        this.maxPensNumber = maxPensNumber;
        this.pens = pens;
    }

    /**
     * Get zoo name
     * @return {@link Zoo#name}
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the {@link Zoo#name}
     * @param name Zoo name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get zoo employee
     * @return {@link Zoo#employee}
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * Sets the {@link Zoo#employee}
     * @param employee Zoo employee
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    /**
     * Get max pens number zoo can contain
     * @return {@link Zoo#maxPensNumber}
     */
    public int getMaxPensNumber() {
        return maxPensNumber;
    }

    /**
     * Sets the {@link Zoo#maxPensNumber}
     * @param maxPensNumber Max pens number that can contain the zoo
     */
    public void setMaxPensNumber(int maxPensNumber) {
        this.maxPensNumber = maxPensNumber;
    }

    /**
     * Get list of zoo pens
     * @return {@link Zoo#pens}
     */
    public ArrayList<Pen> getPens() {
        return pens;
    }

    /**
     * Sets the {@link Zoo#pens}
     * @param pens Pens that the zoo contains
     */
    public void setPens(ArrayList<Pen> pens) {
        this.pens = pens;
    }

    /**
     * Print number of animals that the zoo contains
     */
    public void printNumberOfAnimals() {
        int numberOfAnimal = this.pens.stream().mapToInt(Pen::getAnimalsNumber).sum();
        System.out.println("Nombre total d'animaux dans le zoo : "+numberOfAnimal);
    }

    /**
     * Print animals details that the pen contains
     */
    public void printAnimalsFromPens() {
        if(this.pens.size() > 0){
            this.pens.forEach(Pen::showDetails);
            System.out.println("---");
        } else
            System.out.println("Le zoo ne comporte pas encore d'animaux.");
    }
}
