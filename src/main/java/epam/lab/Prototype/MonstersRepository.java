package epam.lab.Prototype;

import java.util.Hashtable;

public class MonstersRepository {
    private static Hashtable<String, Monsters> MonsterMap  = new Hashtable<>();

    public static Monsters getName(String id) {
        Monsters monstersRep = MonsterMap.get(id);
        return (Monsters) monstersRep.clone();
    }
    public static void executeRepozitory() {
        Zombie zombie = new Zombie();
        zombie.setName("Zoozoo");
        MonsterMap.put(zombie.getName(),zombie);

        Vampire vampire = new Vampire();
        vampire.setName("Drakula");
        MonsterMap.put(vampire.getName(),vampire);

        Ghost ghost = new Ghost();
        ghost.setName("Poltergeist");
        MonsterMap.put(ghost.getName(),ghost);
    }
}
