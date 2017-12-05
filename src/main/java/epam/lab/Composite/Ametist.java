package epam.lab.Composite;

import java.util.ArrayList;
import java.util.List;

public class Ametist {
    private List<Feature> featuresList = new ArrayList<>();
    public void addFeature(Feature feature){
        featuresList.add(feature);
    }
    public void removeFeature(Feature feature){
        featuresList.remove(feature);
    }
    public  void createRock(){
        System.out.println("Its Ametist");
        for (Feature feature:featuresList){
            feature.writeFeature();
        }
    }

}
