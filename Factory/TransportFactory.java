
public class TransportFactory {

    public int getTransport(String type){
        if (type.equalsIgnoreCase("Care")){
            return new Car().getDistance();
        }else if (type.equalsIgnoreCase("Plane")){
            return new Plane().getDistance();
        }
        return 0;
    }

}
