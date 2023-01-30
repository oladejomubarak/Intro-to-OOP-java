package vehicle;

public class Vehicle {
    private String name;
    private String partNumber;
    private String part;

   /* public Vehicle(String name, String partNumber, String part){
        this.name = name;
        this.partNumber = partNumber;
        this.part = part;
    }*/

    public String move(){
        return "moving as a vehicle";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }
}
