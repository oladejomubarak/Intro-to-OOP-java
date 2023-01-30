package vehicle;

public class Train extends Vehicle{
    private String stationLocation;

   /* public Train(String name, String partNumber, String part, String stationLocation) {
        super(name, partNumber, part);
        this.stationLocation = stationLocation;
    }*/

    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }
    @Override
    public String move(){
        return "Excess load on top train";
    }
}
