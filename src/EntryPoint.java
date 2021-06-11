import employees.Employee;
import pens.Pen;
import zoos.Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class EntryPoint {
    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Employee employee = new Employee("Michel", Employee.Gender.M, 25);
        System.out.println("Vous incarnez "+employee.toString());

        ArrayList<Pen> pens = new ArrayList<>();
        Zoo zoo = new Zoo("Zoo G4", employee, 10, pens);
        System.out.println("Vous devez gérer un zoo. Voici de quoi il se compose :");
        zoo.printAnimalsFromPens();

        startDialog();
    }

    private static void startDialog() {
        System.out.println("Choose 1 ou 2");
        String choice = keyboard.nextLine();
        if (choice.isEmpty()) {
            System.out.println("Wow ! Please choose something !");
        } else {
            switch (choice) {
                case "1", "2" -> System.out.println("You have chosen " + choice);
                default -> System.out.println("Don't choose anything else than 1 or 2 !");
            }
        }
    }
}
