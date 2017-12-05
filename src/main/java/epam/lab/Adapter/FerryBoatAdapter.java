package epam.lab.Adapter;

public class FerryBoatAdapter implements Boat{
    Car car;

    public FerryBoatAdapter(Car car){
       this.car = car;
    }

    @Override
    public void crossover() {
        car.ferry();
    }
}
