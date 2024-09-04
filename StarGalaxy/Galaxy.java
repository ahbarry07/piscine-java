import java.util.List;
import java.util.ArrayList;

public class Galaxy{

    private List<CelestialObject> celestialObjects;

    public Galaxy(){
        this.celestialObjects = new ArrayList<>();
    }

    public List<CelestialObject> getCelestialObjects(){
        return this.celestialObjects;
    }

    public void addCelestialObject(CelestialObject celesObj){
        this.celestialObjects.add(celesObj);
    }

    public static void main(String[] args) {
        Galaxy galaxy = new Galaxy();
        CelestialObject lune = new CelestialObject("Lune", -123.12, 392.238, 32.31);
        Star betelgeuse = new Star("Betelgeuse", 128.23, -12.82, 32.328, 1289.3);
        Planet naboo = new Planet("Naboo", 17.4389, 8349.1, 8943.92, betelgeuse);
        
        galaxy.addCelestialObject(lune);
        galaxy.addCelestialObject(betelgeuse);
        galaxy.addCelestialObject(naboo);
        
        List<CelestialObject> celestialObjects = galaxy.getCelestialObjects();
        
        for (CelestialObject celestialObject : celestialObjects) {
            System.out.println(celestialObject.toString());
        }
    }

}