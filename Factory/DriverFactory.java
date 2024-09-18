
public class DriverFactory {
    
    public static Driver getDriver(String type){
        if (type.equalsIgnoreCase("Car")){
            return new CarDriver();
        }else if (type.equalsIgnoreCase("Plane")){
            return new PlaneDriver();
        }
        throw new IllegalArgumentException("Unknown driver type");
    }

    public static void main(String[] args)  {

        System.out.println(DriverFactory.getDriver("Car").createTransport().getDistance());
        System.out.println(DriverFactory.getDriver("Plane").createTransport().getDistance());
    }
}
