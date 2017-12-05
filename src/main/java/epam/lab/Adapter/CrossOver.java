package epam.lab.Adapter;

public class CrossOver {
    public static void main(String[] args) {
        BoatDelivery boatDelivery = new BoatDelivery();
        boatDelivery.Boatcrossover(new SeinfeldBoat());
        boatDelivery.Boatcrossover(new FerryBoatAdapter(new PassengerCar()));
    }
}
