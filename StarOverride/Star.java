import java.util.Objects;

public class Star extends CelestialObject{

    public String name;
    public double x;
    public double y;
    public double z;
    private double magnitude;

    public Star(String name, double x, double y, double z, double magnitude){
        super(name, x, y, z);
        this.magnitude = magnitude;
    }
    public Star(){
        super();
        this.magnitude = 0.0;
    }
    public double getMagnitude(){
        return this.magnitude;
    }

    public void setMagnitude(double newMagnitude){
        this.magnitude = newMagnitude;
    }

    @Override
    public String toString(){
        return String.format(getName() + " shines at the %.3f magnitude", this.magnitude);
    }

     @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if (!super.equals(obj)) return false;
        if(obj == null || this.getClass() != obj.getClass()) return false; 

        Star other = (Star) obj;

        return Double.compare(other.magnitude, this.magnitude) == 0;
           
    }
    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), magnitude);
    }
    
    public static void main(String[] args) {
        Star star = new Star();
        Star star2 = new Star();
        Star proxima = new Star("Proxima", 18.389, 832.32, 218, 0.4);
        
        System.out.println(star.toString());
        System.out.println(proxima.toString());
        System.out.println(star.equals(star2));
        System.out.println(star.equals(proxima));
    }


}