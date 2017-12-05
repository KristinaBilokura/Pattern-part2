package epam.lab.Bilder;

public class Rock {
    private  String name ;
    private Preciousness preciousness;
    private int price;
    private String currency;

    public void setName(String name) {
        this.name = name;
    }

    public void setPreciousness(Preciousness preciousness) {
        this.preciousness = preciousness;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name: "+name+" Preciousness: "+preciousness+" Price: "+price+currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
