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
public class EntryPoint {
    /**
     * Scanner getting datas from user
     */
    private static final Scanner keyboard = new Scanner(System.in);

    private static Employee employee;
    private static Zoo zoo;

    /**
     * @param args Arguments
     */
    public static void main(String[] args) {
        System.out.println("\n\n---------- Bienvenue sur ZooLogic ----------");
        System.out.println("Vous êtes le gérant d'un Zoo. Faite en sorte que les animaux se portent bien et soit heureux !\n");

        initEmployee();
        initZoo();

        // A mettre dans thread :
        /*
        zoo.changeAnimalState(); // Modifier état d'un animal aléatoirement
        zoo.changePenState(); // Modifier état d'un enclos aléatoirement
        */

        startInteraction();
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
    }

    /**
     * Begin the interaction with the user
     */
    private static void startInteraction() {
        System.out.println("\nQue souhaitez-vous faire ?\n1: Afficher les informations de tous les enclos\n2: Nourrir les animaux\n3: Soigner les animaux malades\n4: Nettoyer les enclos sales\n5: Quitter l'application");
        String choice = keyboard.nextLine();
        if (!choice.isEmpty()) {
            switch (choice) {
                case "1":
                    System.out.println("Informations des enclos");
                    zoo.printAnimalsFromPens();
                    break;
                case "2":
                    System.out.println("Nourriture des animaux en cours...");
                    if (zoo.getPens().size() > 0) {
                        zoo.getPens().forEach(Pen::feedAnimals);
                    }
                    break;
                case "3":
                    System.out.println("Soins aux animaux en cours...");
                    if (zoo.getPens().size() > 0) {
                        zoo.getPens().forEach(Pen::takeCareOfAnimals);
                    }
                    break;
                case "4":
                    System.out.println("Nettoyage des enclos en cours...");
                    if (zoo.getPens().size() > 0) {
                        zoo.getPens().forEach(Pen::clean);
                    }
                    break;
                default:
                    System.out.println("Au revoir");
            }
        }
    }
}
