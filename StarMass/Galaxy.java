import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

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

    public Map<String, Integer> computeMassRepartition() {
        Map<String, Integer> massRepartition = new HashMap<>();
        massRepartition.put("Star", 0);
        massRepartition.put("Planet", 0);
        massRepartition.put("Other", 0);

        for (CelestialObject obj : celestialObjects) {
            if (obj instanceof Star) {
                massRepartition.put("Star", massRepartition.get("Star") + obj.getMass());
            } else if (obj instanceof Planet) {
                massRepartition.put("Planet", massRepartition.get("Planet") + obj.getMass());
            } else {
                massRepartition.put("Other", massRepartition.get("Other") + obj.getMass());
            }
        }

        return massRepartition;
    }

    public static void main(String[] args) {
        Galaxy galaxy = new Galaxy();
        CelestialObject charron = new CelestialObject("Charron", -123.12, 392.238, 32.31, 157);
        CelestialObject lune = new CelestialObject("Lune", 3928.32, 327.239, -12.92, 3987);
        Star betelgeuse = new Star("Betelgeuse", 128.23, -12.82, 32.328, 1289.3, 538595);
        Star altair = new Star("Betelgeuse", 43894.34, -324.43, 9438.23, 123.54, 137273);
        Star bellatrix = new Star("Bellatrix", 584.34, 2103.32, -102.43, 413.2, 5483724);
        Planet naboo = new Planet("Naboo", 17.4389, 8349.1, 8943.92, betelgeuse, 32454);
        Planet tatooine = new Planet("Tatooine", 17.4389, 8349.1, 8943.92, betelgeuse, 2345);
        Planet mercure = new Planet("Mercure", 17.4389, 8349.1, 8943.92, altair, 19438);
        Planet venus = new Planet("Venus", 17.4389, 8349.1, 8943.92, altair, 9283);
        Planet mars = new Planet("Mars", 17.4389, 8349.1, 8943.92, altair, 2183);
        
        galaxy.addCelestialObject(lune);
        galaxy.addCelestialObject(charron);
        galaxy.addCelestialObject(mars);
        galaxy.addCelestialObject(mercure);
        galaxy.addCelestialObject(tatooine);
        galaxy.addCelestialObject(altair);
        galaxy.addCelestialObject(venus);
        galaxy.addCelestialObject(betelgeuse);
        galaxy.addCelestialObject(naboo);
        galaxy.addCelestialObject(bellatrix);
        
        System.out.println(galaxy.computeMassRepartition().toString());
    }

}