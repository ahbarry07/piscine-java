import java.util.Objects;

public class Planet extends CelestialObject{  
    private Star centerStar;

    public Planet(){
        super();
        this.centerStar = new Star();
    }

    public Planet(String name, double x, double y, double z, Star centerStar){
        super(name, x, y, z);
        this.centerStar = centerStar;
    }

    public Star getCenterStar(){
        return this.centerStar;
    }

    public void setCenterStar(Star newCStar){
        this.centerStar = newCStar;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if (!super.equals(obj)) return false;
        if(obj == null || this.getClass() != obj.getClass()) return false; 

        Planet other = (Planet) obj;

        return this.centerStar.equals(other.centerStar);
           
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), centerStar);
    }

    @Override
    public String toString(){
        double distance = getDistanceBetween(new CelestialObject(name, x, y, z), centerStar);
        return String.format(getName()+ " circles around %s at the %.3f AU", centerStar.name, distance);
    }


    public static void main(String[] args) {
        Planet earth = new Planet();
        Planet naboo = new Planet("Naboo", 17.4389, 8349.1, 8943.92, new Star("Betelgeuse", 128.23, -12.82, 32.328, 1289.3));

        System.out.println(naboo.toString());
        System.out.println(earth.toString());
        System.out.println(naboo.getCenterStar().toString());
    }

}