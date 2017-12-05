package epam.lab.Composite;

import epam.lab.Composite.features.Location;
import epam.lab.Composite.features.Preciousness;
import epam.lab.Composite.features.Weight;

public class Rock {
    public static void main(String[] args) {
        Ametist ametist = new Ametist();
        Feature origin = new Location();
        Feature weight = new Weight();
        Feature preciousness = new Preciousness();
        ametist.addFeature(preciousness);
        ametist.addFeature(origin);
        ametist.addFeature(weight);
        ametist.createRock();
    }



}
