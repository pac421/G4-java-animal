package zoos;

import employees.*;
import pens.*;

import java.util.ArrayList;

public class Zoo {
    private String name;
    private Employee employee;
    private int maxPensNumber;
    private ArrayList<Pen> pens;

    public String printNumberOfAnimals() {
        return "Nombre d'animaux";
    }

    public String printAnimalsFromPens() {
        return "Animaux des enclos";
    }

    public static void main(String[] args) {
        System.out.println("Démarrage de l'application");
    }
}
