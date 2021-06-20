import animals.Animal;
import animals.beasts.*;
import employees.Employee;
import pens.*;
import zoos.Zoo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * EntryPoint Class
 * The software starts here
 */
public class EntryPoint implements Runnable {
    /**
     * Scanner getting datas from user
     */
    private static Scanner keyboard = new Scanner(System.in);

    private static Employee employee;
    private static Zoo zoo;

    /**
     * @param args Arguments
     */
    public static void main(String[] args) {
        System.out.println("\n\n---------- Bienvenue sur ZooLogic ----------");
        System.out.println("Vous êtes le gérant d'un Zoo. Faite en sorte que les animaux se portent bien et soient heureux !\n");

        initEmployee();
        initZoo();

        playInteraction();
    }

    /**
     * Initialize the employee of the zoo getting user datas
     */
    private static void initEmployee() {
        employee = new Employee("Michelle", Employee.Gender.F, 23);

        /*
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
        */

        employee.printDescription();
    }

    /**
     * Initialize the Zoo and it's content
     */
    private static void initZoo() {
        ArrayList<Bear> bears = new ArrayList<Bear>();
        bears.add(new Bear("José", Animal.Gender.M, 125, 180, 6, 18));
        bears.add(new Bear("Josiane", Animal.Gender.F, 80, 160, 2, 18));
        bears.add(new Bear("Maurice", Animal.Gender.M, 180, 170, 12, 18));

        ArrayList<Penguin> penguins = new ArrayList<Penguin>();
        penguins.add(new Penguin("Pépé le Pingouin", Animal.Gender.M, 12, 18, 2, 4));
        penguins.add(new Penguin("Lily", Animal.Gender.F, 8, 16, 4, 4));

        ArrayList<Pen> pens = new ArrayList<>();
        pens.add(new Pen("Le coin des ours", 2000, 3, 3, bears));
        pens.add(new Aquarium("Plouf chez les pingouins", 500, 10, 2, penguins));

        zoo = new Zoo("Zoo G4", employee, 10, pens);
        zoo.printAnimalsFromPens();

        EntryPoint entryPoint = new EntryPoint();
        Thread thread = new Thread(entryPoint);
        thread.start();
    }

    /**
     * Start the interaction with the user
     */
    private static void playInteraction() {
        keyboard = new Scanner(System.in);

        System.out.println("\nQue souhaitez-vous faire ?\n1: Afficher l'état du Zoo\n2: Aller dans un enclos\n3: Démissionner du Zoo");
        String choice = keyboard.nextLine();
        if (!choice.isEmpty()) {
            switch (choice) {
                case "1" -> zoo.printAnimalsFromPens();
                case "2" -> goIntoPen();
                case "3" -> {
                    System.out.println("Dommage..\nVotre fénéantise à causer la mort de tous les animaux..");
                    System.exit(0);
                }
            }
        }
    }

    private static void goIntoPen(){
        System.out.println("\nDans quel enlos souhaitez-vous vous rendre ?");

    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(10000);

                System.out.println("\nIl y a du nouveau !");
                zoo.changeAnimalState();
                zoo.changePenState();

                playInteraction();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
