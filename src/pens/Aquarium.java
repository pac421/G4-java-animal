package pens;

public class Aquarium extends Pen {
    private State depth;
    private State salinity;

    public void clean() {
        System.out.println("État de propreté du bassin : "+this.cleanliness);
        if(this.cleanliness == State.Bad){
            System.out.println("Nettoyage du bassin à l'épuisette..");
            this.cleanliness = State.Good;
        }

        System.out.println("État de la profondeur du bassin : "+this.depth);
        if(this.depth == State.Bad){
            System.out.println("Ajustement de la profondeur de l'eau..");
            this.depth = State.Good;
        }

        System.out.println("État de l'indice de salinité de l'eau : "+this.salinity);
        if(this.salinity == State.Bad){
            System.out.println("Ajustement de l'indice de salinité de l'eau..");
            this.salinity = State.Good;
        }

        System.out.println("Le bassin est propre !");
    }
}

