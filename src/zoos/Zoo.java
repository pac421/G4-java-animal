package zoos;

import employees.*;
import pens.*;
import java.util.ArrayList;

public class Zoo {
    private String name;
    private Employee employee;
    private int maxPensNumber;
    private ArrayList<Pen> pens;

    public Zoo(String name, Employee employee, int maxPensNumber, ArrayList<Pen> pens) {
        this.name = name;
        this.employee = employee;
        this.maxPensNumber = maxPensNumber;
        this.pens = pens;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getMaxPensNumber() {
        return maxPensNumber;
    }

    public void setMaxPensNumber(int maxPensNumber) {
        this.maxPensNumber = maxPensNumber;
    }

    public ArrayList<Pen> getPens() {
        return pens;
    }

    public void setPens(ArrayList<Pen> pens) {
        this.pens = pens;
    }

    public void printNumberOfAnimals() {
        int numberOfAnimal = this.pens.stream().mapToInt(Pen::getAnimalsNumber).sum();
        System.out.println("Nombre total d'animaux dans le zoo : "+numberOfAnimal);
    }

    public void printAnimalsFromPens() {
        if(this.pens.size() > 0){
            this.pens.forEach(Pen::showDetails);
            System.out.println("---");
        } else
            System.out.println("Le zoo ne comporte pas encore d'animaux.");
    }
}
