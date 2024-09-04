import java.util.Objects;

public class CelestialObject {
    
    public static final double KM_IN_ONE_AU = 150000000;

    public double x;
    public double y;
    public double z;
    public String name;
    

    public CelestialObject(){
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.name = "Soleil";
    }

    public CelestialObject(String name, double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    /******************** For X ****************/
    public double getX(){
        return this.x;
    }

    public void setX(double newX){
        this.x = newX;
    }

    /******************** For Y ****************/
    public double getY(){
        return this.y;
    }

    public void setY(double newY){
        this.y = newY;
    }

    /******************** For Z ****************/
    public double getZ(){
        return this.z;
    }

    public void setZ(double newZ){
        this.z = newZ;
    }

    /********************For Name ****************/
    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public static double getDistanceBetween(CelestialObject start, CelestialObject finalDes){
        return Math.sqrt(Math.pow((finalDes.getX()-start.getX()), 2) + Math.pow((finalDes.getY()-start.getY()), 2) + Math.pow((finalDes.getZ()-start.getZ()), 2));
    }

    public static double getDistanceBetweenInKm(CelestialObject start, CelestialObject finalDes){
        return KM_IN_ONE_AU * getDistanceBetween(start, finalDes);
    }

    public String toString(){
        return String.format(this.getName() + " is positioned at (%.3f, %.3f, %.3f)", this.getX(), this.getY(), this.getZ());
    }

    public boolean equals(Object obj){
       if(this == obj) return true;
       if(obj == null || this.getClass() != obj.getClass()) return false; 

       CelestialObject other = (CelestialObject) obj;

       return Double.compare(other.x, this.x) == 0.0 && 
            Double.compare(other.y, this.y) == 0.0 &&
            Double.compare(other.z, this.z) == 0.0 && 
            name.equals(other.name);
    }

    public int hashCode(){
        return Objects.hash(x, y, z, name);
    }
    public static void main(String[] args) {
        CelestialObject celestialObject = new CelestialObject();
        CelestialObject earth = new CelestialObject("Terre", 1.0, 2.0, 2.0);
        CelestialObject earth1 = new CelestialObject("Terre", 1.0, 2.0, 2.0);

        System.out.println(earth.toString());
        System.out.println(earth.equals(earth1));
        System.out.println(earth.equals(celestialObject));

        System.out.println(earth.hashCode());
        System.out.println(celestialObject.hashCode());
    }

}
