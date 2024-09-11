import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SetOperations {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        if(set1 != null){
            Set<Integer> newSet = set1;
            newSet.addAll(set2.stream().distinct()
                .filter(element -> !newSet.contains(element))
                .collect(Collectors.toSet())
            );
            return newSet;
        }
        return null;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        if(set1 != null){
            Set<Integer> set = set1.stream().filter(element -> set2.contains(element)).collect(Collectors.toSet());
            return set;
        }
        return null;
    }


    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        Set<Integer> unionSet = SetOperations.union(set1, set2);
        System.out.println(unionSet); // Expected Output: [1, 2, 3, 4]

        Set<Integer> intersectionSet = SetOperations.intersection(set1, set2);
        System.out.println(intersectionSet); // Expected Output: [2, 3]
    }
}