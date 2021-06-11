package zoos;

import employees.*;
import pens.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    private String name;
    private Employee employee;
    private int maxPensNumber;
    private ArrayList<Pen> pens;
    Scanner keyboard = new Scanner(System.in);

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
        this.pens.forEach((pen) -> System.out.println(pen.toString()));
    }

    public static void main(String[] args) {
        System.out.println("Démarrage de l'application");
        // Create employee
        Employee employee = new Employee("Solange", Employee.Gender.F, 32);
        // Create animals
        // Create pens with these animals
        ArrayList<Pen> pens = new ArrayList<>();
        // Create zoo with these pens and this employee
        Zoo zoo = new Zoo("Zoo G4", employee, 10, pens);

        System.out.println(zoo.sayHello(zoo.getEmployee()));
        zoo.chooseSomething();
    }

    public String sayHello(Employee employee) {
        return "Hello " + employee.getName();
    }

    public void chooseSomething() {
        System.out.println("Choose 1 ou 2");
        String choice = keyboard.nextLine();
        if (choice.isEmpty()) {
            System.out.println("Wow ! Please choose something !");
        } else {
            switch (choice) {
                case "1":
                case "2":
                    System.out.println("You have chosen " + choice);
                    break;
                default:
                    System.out.println("Don't choose anything else than 1 or 2 !");
            }
        }
    }
}
