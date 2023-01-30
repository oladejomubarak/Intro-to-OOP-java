package vehicle;

public class Lorry extends Vehicle{
    private String lorryYear;
    private String lorryCapacity;

   /* public Lorry(String name, String partNumber, String part, String lorryYear, String lorryCapacity) {
        super(name, partNumber, part);
        this.lorryYear = lorryYear;
        this.lorryCapacity = lorryCapacity;
    }*/

    public String getLorryYear() {
        return lorryYear;
    }

    public void setLorryYear(String lorryYear) {
        this.lorryYear = lorryYear;
    }

    public String getLorryCapacity() {
        return lorryCapacity;
    }

    public void setLorryCapacity(String lorryCapacity) {
        this.lorryCapacity = lorryCapacity;
    }
    @Override
    public String move() {
        return "hustling lorry";
    }
}
