public class CelestialObject {

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
    public static void main(String[] args) {
        CelestialObject defaultStar = new CelestialObject();
        System.out.println(defaultStar.getX());
        System.out.println(defaultStar.getY());
        System.out.println(defaultStar.getZ());
        System.out.println(defaultStar.getName());

        defaultStar.setName("Terre");
        defaultStar.setX(0.43);
        defaultStar.setY(0.98);
        defaultStar.setZ(1.43);
        System.out.println(defaultStar.getX());
        System.out.println(defaultStar.getY());
        System.out.println(defaultStar.getZ());
        System.out.println(defaultStar.getName());

    }

}