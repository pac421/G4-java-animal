import UI.ConsoleColors;
import animals.Animal;
import animals.beasts.*;
import employees.Employee;
import pens.*;
import zoos.Zoo;
import java.util.ArrayList;
import java.util.HashMap;
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
        System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT + "\n\n---------- Bienvenue sur ZooLogic ----------" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT + "Vous êtes le gérant d'un Zoo. Faites en sorte que les animaux se portent bien et soient heureux !\n" + ConsoleColors.RESET);

        initEmployee();
        initZoo();

        playDefaultInteraction();
    }

    /**
     * Initialize the employee of the zoo getting user datas
     */
    private static void initEmployee() {
        employee = new Employee();

        System.out.println("Veuillez indiquez votre nom:");
        keyboard = new Scanner(System.in);
        String choiceName = keyboard.nextLine();
        if (choiceName != null && !choiceName.isEmpty()) {
            employee.setName(choiceName);
        }

        System.out.println("Veuillez indiquez votre sexe (F ou M):");
        keyboard = new Scanner(System.in);
        String choiceGender = keyboard.nextLine();
        if (choiceGender != null && !choiceGender.isEmpty()) {
            switch (choiceGender) {
                case "F" -> {
                    employee.setGender(Employee.Gender.F);
                }
                case "M" -> {
                    employee.setGender(Employee.Gender.M);
                }
            }
        }

        System.out.println("Veuillez indiquez votre age:");
        keyboard = new Scanner(System.in);
        String choiceAge = keyboard.nextLine();
        if (choiceAge != null && !choiceAge.isEmpty() && choiceAge.matches("[+-]?\\d*(\\.\\d+)?")) {
            employee.setAge(Integer.parseInt(choiceAge));
        }


        //employee = new Employee("Michelle", Employee.Gender.F, 23);
        employee.printDescription();

        Thread employeeThread = new Thread(employee);
        employeeThread.start();
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
        Thread entryPointThread = new Thread(entryPoint);
        entryPointThread.start();
    }

    /**
     * "Zoo" Menu - Play interaction about zoo with the user
     */
    private static void playDefaultInteraction() {
        System.out.println("\n" + employee.getName() + ", que souhaitez-vous faire ?\n1: Afficher l'état du Zoo\n2: Aller dans un enclos\n3: Démissionner du Zoo");

        keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        if (choice != null && !choice.isEmpty()) {
            switch (choice) {
                case "1" -> {
                    zoo.printAnimalsFromPens();
                    playDefaultInteraction();
                }
                case "2" -> playChoosePenInteraction();
                case "3" -> {
                    System.out.println("Dommage..\nVotre fénéantise a causé la mort de tous les animaux..");
                    System.exit(0);
                }
            }
        }
    }

    /**
     * "Choix Enclos" Menu - Play interaction about choosing pen with the user
     */
    private static void playChoosePenInteraction(){
        System.out.println("\nDans quel enclos souhaitez-vous vous rendre ?");

        HashMap<Integer, Pen> penOptions = new HashMap<>();

        ArrayList<Pen> pens = zoo.getPens();
        final int[] i = {1};
        pens.forEach((pen) -> {
            penOptions.put(i[0], pen);
            System.out.println(i[0] +" - "+pen.getName());
            i[0]++;
        });

        keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        if (choice != null && !choice.isEmpty()) {
            playPenInteraction(penOptions.get(Integer.parseInt(choice)));
        }
    }

    /**
     * "Enclos" Menu - Play interaction about chosen pen with the user
     * @param pen Chosen pen
     */
    private static void playPenInteraction(Pen pen){
        System.out.println("\nQue souhaitez-vous faire dans l'enclos \""+pen.getName()+"\" ?\n1: Aller vers un animal\n2: Nettoyer l'enclos\n3: Afficher les détails\n4: Sortir de l'enclos");
        System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT + "Cette action nécéssite de l'énergie." + ConsoleColors.RESET);
        employee.printEnergyLevel();

        keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();

        if(employee.getEnergyLevel() > 0){
            if (choice != null && !choice.isEmpty()) {
                employee.decreaseEnergy();
                switch (choice) {
                    case "1" -> playChooseAnimalInteraction(pen);
                    case "2" -> {
                        pen.clean();
                        playPenInteraction(pen);
                    }
                    case "3" -> {
                        pen.showDetails();
                        playPenInteraction(pen);
                    }
                    case "4" -> playDefaultInteraction();
                }
            }
        } else {
            System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "Vous n'avez plus assez d'énergie." + ConsoleColors.RESET);
            playPenInteraction(pen);
        }
    }

    /**
     * "Choix Animal" Menu - Play interaction about chosing an animal from pen with the user
     * @param pen Chosen pen
     */
    private static void playChooseAnimalInteraction(Pen pen){
        System.out.println("\nVers quel animal souhaitez-vous aller ?");

        HashMap<Integer, Animal> animalOptions = new HashMap<>();

        ArrayList<? extends Animal> animals = pen.getAnimals();
        final int[] i = {1};
        animals.forEach((animal) -> {
            animalOptions.put(i[0], animal);
            System.out.println(i[0] +" - "+animal.getName());
            i[0]++;
        });

        keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        if (choice != null && !choice.isEmpty()) {
            playActionInteraction(animalOptions.get(Integer.parseInt(choice)), pen);
        }
    }

    /**
     * "Animal" Menu - Play interaction about chosen animal with the user
     * @param animal Chosen animal
     * @param pen Chosen pen
     */
    private static void playActionInteraction(Animal animal, Pen pen){
        System.out.println("\nQue souhaitez-vous faire à \""+animal.getName()+"\" ?\n1: Nourrir\n2: Soigner\n3: "+(animal.isAsleep() ? "Réveiller" : "Endormir")+"\n4: Afficher les détails\n5: S'éloigner de l'animal");
        System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT + "Cette action nécéssite de l'énergie." + ConsoleColors.RESET);
        employee.printEnergyLevel();

        keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();

        if(employee.getEnergyLevel() > 0){
            if (choice != null && !choice.isEmpty()) {
                employee.decreaseEnergy();
                switch (choice) {
                    case "1" -> {
                        animal.feed();
                        playActionInteraction(animal, pen);
                    }
                    case "2" -> {
                        animal.takeCare();
                        playActionInteraction(animal, pen);
                    }
                    case "3" -> {
                        animal.switchIsAsleep();
                        playActionInteraction(animal, pen);
                    }
                    case "4" -> {
                        animal.showDetails();
                        playActionInteraction(animal, pen);
                    }
                    case "5" -> playPenInteraction(pen);
                }
            }
        } else {
            System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "Vous n'avez plus assez d'énergie." + ConsoleColors.RESET);
            playActionInteraction(animal, pen);
        }
    }

    /**
     * Launch actions every minute
     */
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(40000);

                System.out.println("\n" + ConsoleColors.RED_BACKGROUND + "Il y a du nouveau !" + ConsoleColors.RESET);
                zoo.changeAnimalState();
                zoo.changePenState();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
