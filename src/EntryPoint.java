import animals.Animal;
import animals.beasts.*;
import employees.Employee;
import pens.*;
import zoos.Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class EntryPoint {
    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Employee employee = initializeEmployee();
        Zoo zoo = initializeZoo(employee);
        startDialog();
    }

    private static Employee initializeEmployee() {
        ArrayList<String> messages = new ArrayList<>();
        messages.add("Bonjour et bienvenue au zoo ! Merci d'indiquer votre nom");
        messages.add("Indiquez votre sexe : F ou M");
        messages.add("Indiquez votre âge");

        Employee employee = new Employee();
        int i = 0;
        while (i < messages.size()) {
            System.out.println(messages.get(i));
            String response = keyboard.nextLine();
            if (!response.isEmpty()) {
                switch (i) {
                    case 0: employee.setName(response);
                        break;
                    case 1:
                        switch (response) {
                            case "F" -> employee.setGender(Employee.Gender.F);
                            default -> employee.setGender(Employee.Gender.M);
                        }
                        break;
                    case 2:
                        int age = 25;
                        boolean isNumeric =  response.matches("[+-]?\\d*(\\.\\d+)?");
                        if (isNumeric) {
                            age = Integer.valueOf(response);
                        }
                        employee.setAge(age);
                        break;
                }
                i++;
            }
        }
        System.out.println("Vous incarnez "+employee.toString());
        System.out.println("---");

        return employee;
    }

    private static Zoo initializeZoo(Employee employee) {
        ArrayList<Bear> bears = new ArrayList<Bear>();
        bears.add(new Bear("José", Animal.Gender.M, 125, 180, 6, 18));
        bears.add(new Bear("Josiane", Animal.Gender.F, 80, 160, 2, 18));
        bears.add(new Bear("Maurice", Animal.Gender.M, 180, 170, 12, 18));

        ArrayList<Pen> pens = new ArrayList<>();
        pens.add(new Pen("Le coin des ours", 2000, 3, 3, bears));

        Zoo zoo = new Zoo("Zoo G4", employee, 10, pens);
        System.out.println("Vous devez gérer un zoo. Voici de quoi il se compose :");
        zoo.printAnimalsFromPens();

        return zoo;
    }

    private static void startDialog() {
        System.out.println("Que souhaitez-vous faire ?");
        System.out.println("1: Créer un enclos - 2: Partir en balade avec un ours");
        String choice = keyboard.nextLine();
        if (!choice.isEmpty()) {
            switch (choice) {
                case "1" -> System.out.println("Vous allez créer un enclos");
                case "2" -> System.out.println("Vous partez en balade avec un ours");
                default -> System.out.println("Au revoir");
            }
        }
    }
}
