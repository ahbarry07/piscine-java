
public class DriverFactory {
    
    public Driver getDriver(String type){
        if (type.equalsIgnoreCase("Car")){
            return new CarDriver();
        }else if (type.equalsIgnoreCase("Plane")){
            return new PlaneDriver();
        }
        throw new IllegalArgumentException("Unknown driver type");
    }
}
