package epam.lab.Bilder;

public class Ametist extends Rockbuilder {
    @Override
    void buildName() {
        rock.setName("Ametist");
    }

    @Override
    void buildPreciousness() {
        rock.setPreciousness(Preciousness.UNEXPENSIVE);
    }

    @Override
    void buildPrice() {
        rock.setPrice(100);
        rock.setCurrency("$");
    }
}
