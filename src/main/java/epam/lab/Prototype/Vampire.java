package epam.lab.Prototype;

public class Vampire extends Monsters {
    public Vampire(){
        type = Type.VAMPIRE;
    }
    @Override
    void battle() {
        System.out.println("Vampire Start fighting!");
    }

    @Override
    void defence() {
        System.out.println("Vampire protection!");
    }
}
