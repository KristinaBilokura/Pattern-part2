package epam.lab.Prototype;

public class Ghost extends Monsters {
    @Override
    void battle() {
        System.out.println("Ghost Start fighting!");
    }

    @Override
    void defence() {
        System.out.println("Ghost protection!");
    }

    public Ghost(){
        type = Type.GHOST;
    }


}
