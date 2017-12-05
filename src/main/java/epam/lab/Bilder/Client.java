package epam.lab.Bilder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        director.setRockbuilder(new Ametist());
        Rock rock = director.buildRock();
        System.out.println(rock);
    }


}
