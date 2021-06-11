package pens;

public class Aviary extends Pen {
    private float height;

    public void clean() {
        System.out.println("État de propreté de la volière : "+this.cleanliness);
        if(this.cleanliness == State.Bad){
            System.out.println("Nettoyage du sol de la volière..");
            System.out.println("Nettoyage du toit à "+this.height+" mètres de haut..");
            this.cleanliness = State.Good;
        }
        System.out.println("La volière est propre !");
    }
}
