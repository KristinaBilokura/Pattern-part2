package epam.lab.Adapter;

public class PassengerCar implements Car {
    @Override
    public void ferry() {
        System.out.println("Passenger car carries out delivery throw the channel");
    }
}
