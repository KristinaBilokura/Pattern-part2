package epam.lab.Bilder;

public class Diamond extends Rockbuilder {
    @Override
    void buildName() {
        rock.setName("Diamond");
    }

    @Override
    void buildPreciousness() {
        rock.setPreciousness(Preciousness.EXPENSIVE);
    }

    @Override
    void buildPrice() {
        rock.setPrice(10000);
        rock.setCurrency("$");
    }


}
