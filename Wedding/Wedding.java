import java.util.*;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        List<String> firstList = new ArrayList<>(first);
        List<String> secondList = new ArrayList<>(second);
        
        Collections.shuffle(secondList); // Shuffle second list to ensure randomness
        
        Map<String, String> coupleMap = new HashMap<>();
        
        // Iterate over the first list and pair with names from the shuffled second list
        for (int i = 0; i < Math.min(firstList.size(), secondList.size()); i++) {
            coupleMap.put(firstList.get(i), secondList.get(i));
        }
        
        return coupleMap;
    }
}
