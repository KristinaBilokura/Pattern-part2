package epam.lab.Bilder;

public class Director {
    Rockbuilder rockbuilder;
    public void setRockbuilder(Rockbuilder rockbuilder){
        this.rockbuilder= rockbuilder;
    }

    Rock buildRock(){
        rockbuilder.builder();
        rockbuilder.buildName();
        rockbuilder.buildPreciousness();
        rockbuilder.buildPrice();
        Rock rock = rockbuilder.getRock();
        return rock;
    }
}
