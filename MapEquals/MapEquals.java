import java.util.Map;

public class MapEquals {
    public static boolean areMapsEqual(Map<String, Integer> map1, Map<String, Integer> map2) {
        if (map1 != null){
            if(map1.isEmpty() && map2.isEmpty()) return true;
            return map1.equals(map2);
        }
        if (map1 == null && map2 == null) return true;
        return false;
    }
}