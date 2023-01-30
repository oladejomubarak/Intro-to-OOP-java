package vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.move());

        Car car = new Car();
        System.out.println(car.move());
        Lorry lorry = new Lorry();
        System.out.println(lorry.move());
        Train train = new Train();
        System.out.println(train.move());
        car.getCarModel();
    }
}
