package epam.lab.Prototype;

public class Zombie extends Monsters{
    public Zombie(){
        type =Type.ZOMBIE;
    }

    @Override
    void battle() {
        System.out.println("Start fighting Zombie!");
    }

    @Override
    void defence() {
        System.out.println("Zombie protection!");
    }
}
