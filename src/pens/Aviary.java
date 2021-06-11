package pens;

public class Aviary extends Pen {
    private State height;

    public void clean() {
        this.cleanliness = State.Good;
        System.out.println("Nettoyage de la volière..");
        System.out.println("Récupération de l'échelle permettant de monter à "+height+" m de hauteur..");
        System.out.println("Nettoyage du toit de la volière.");
        System.out.println("La volière est désormais propre !");
    }
}
