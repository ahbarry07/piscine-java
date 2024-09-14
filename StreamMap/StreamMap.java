import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
    public static Integer sumOfStringLength(Stream<String> s) {
        if (s == null){
            return 0;
        }
        return (int) s.count();
    }

    public static List<String> upperCaseAllString(Stream<String> s) {
        if(s == null){
            return new ArrayList<>();
        }
        return s.filter(str -> str.equals(str.toUpperCase())).toList();
    }
    
    public static Set<Integer> uniqIntValuesGreaterThan42(Stream<Double> s) {
        if (s == null){
            return new HashSet<>();
        }

        return s.map(val -> val.intValue())
                .filter(num -> num > 42).collect(Collectors.toSet());
    }
}