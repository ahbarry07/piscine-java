import java.io.IOException;
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
        return s.mapToInt(String::length).sum();
    }

    public static List<String> upperCaseAllString(Stream<String> s) {
        if(s == null){
            return new ArrayList<>();
        }
        return s.map(str -> str.toUpperCase()).toList();
    }
    
    public static Set<Integer> uniqIntValuesGreaterThan42(Stream<Double> s) {
        if (s == null){
            return new HashSet<>();
        }

        return s.filter(num -> num >= 42)
            .map(val -> val.intValue()).collect(Collectors.toSet());
    }

    public static void main(String[] args) throws IOException {
        System.out.println(StreamMap.sumOfStringLength(Stream.of("Bonjour", "le", "monde !")));
        System.out.println(StreamMap.upperCaseAllString(Stream.of("IL", "Fait", "beaU !!")));
        System.out.println(StreamMap.uniqIntValuesGreaterThan42(Stream.of(23.439, 42.34, 39194.4)));
    }
}