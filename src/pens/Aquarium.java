package pens;

public class Aquarium extends Pen {
    private double depth;
    private double salinity;

    public void clean() {
        this.cleanliness = Cleanliness.Good;
        System.out.println("Nettoyage du bassin..");
        System.out.println("Vérification de la profondeur du bassin..");
        System.out.println("Remplissage de l'eau manquante..");
        System.out.println("Vérification de l'indice de salinité..");
        System.out.println("Réglage du taux de salinité..");
        System.out.println("L'aquarium est désormais propre !");
    }
}

