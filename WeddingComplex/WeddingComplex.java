import java.util.*;

public class WeddingComplex {
    public static Map<String, String> createBestCouple(Map<String, List<String>> first, Map<String, List<String>> second) {
        Map<String, String> couples = new HashMap<>();
        Map<String, Integer> secondPreferenceIndex = new HashMap<>();
        Queue<String> freeFirst = new LinkedList<>(first.keySet());
        
        // Initialize preference index for second group
        for (String person : second.keySet()) {
            secondPreferenceIndex.put(person, 0);
        }
        
        while (!freeFirst.isEmpty()) {
            String currentFirst = freeFirst.poll();
            List<String> preferences = first.get(currentFirst);
            
            for (String preferredSecond : preferences) {
                if (!couples.containsValue(preferredSecond)) {
                    couples.put(currentFirst, preferredSecond);
                    break;
                } else {
                    String currentPartner = null;
                    for (Map.Entry<String, String> entry : couples.entrySet()) {
                        if (entry.getValue().equals(preferredSecond)) {
                            currentPartner = entry.getKey();
                            break;
                        }
                    }
                    
                    List<String> secondPreferences = second.get(preferredSecond);
                    int currentIndex = secondPreferences.indexOf(currentPartner);
                    int newIndex = secondPreferences.indexOf(currentFirst);
                    
                    if (newIndex < currentIndex) {
                        couples.remove(currentPartner);
                        couples.put(currentFirst, preferredSecond);
                        freeFirst.add(currentPartner);
                        break;
                    }
                }
            }
        }
        
        return couples;
    }
}