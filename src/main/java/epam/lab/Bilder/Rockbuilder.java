package epam.lab.Bilder;

public abstract class Rockbuilder {
    Rock rock;
    void builder(){
        rock = new Rock();
    }
    abstract void buildName();
    abstract void buildPreciousness();
    abstract void buildPrice();
    Rock getRock(){
        return rock;
    }

}
