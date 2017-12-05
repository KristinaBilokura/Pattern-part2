package epam.lab.Prototype;

public class main {
        public static void main(String[] args) {
            MonstersRepository.executeRepozitory();

            Monsters clonedmonster1 = (Monsters) MonstersRepository.getName("Zoozoo");
            System.out.println("Monster : " + clonedmonster1.getType());

            Monsters clonedmonster2 = (Monsters) MonstersRepository.getName("Drakula");
            System.out.println("Monster : " + clonedmonster2.getType());

            Monsters clonedmonster3 = (Monsters) MonstersRepository.getName("Poltergeist");
            System.out.println("Monster : " + clonedmonster3.getType());
        }

}
