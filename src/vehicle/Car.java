package vehicle;

public class Car extends Vehicle{
    private String carModel;

   /* public Car(String name, String partNumber, String part, String carModel) {
        super(name, partNumber, part);
        this.carModel = carModel;
    }*/

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
   /* @Override
    public String move() {
        return "cruising as a car";
    }*/
}
