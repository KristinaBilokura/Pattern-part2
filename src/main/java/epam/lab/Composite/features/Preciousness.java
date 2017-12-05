package epam.lab.Composite.features;

import epam.lab.Composite.Feature;

public class Preciousness implements Feature {
    enum Precious{EXPENSIVE,UNEXPENSIVE};
    String name = "expensive";
    Precious precious = Precious.valueOf(name.toUpperCase());
    public void writeFeature() {
        System.out.println(precious);
    }
}
