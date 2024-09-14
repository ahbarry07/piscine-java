import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;


public class StreamCollect {
    public static Map<Character, List<String>> mapByFirstLetter(Stream<String> s) {
        if(s != null){
            Map<Character, List<String>> result = new HashMap<>();
            Iterator<String> iterator = s.iterator();
            while (iterator.hasNext()) {
                String str = iterator.next();
                if (str != null && !str.isEmpty()) {
                    Character key = Character.toUpperCase(str.charAt(0));
                    if (!result.containsKey(key)) {
                        result.put(key, new ArrayList<>());
                    }
                    result.get(key).add(str);
                }
            }
            return result;
        }
        return new HashMap<>();
    }

    public static Map<Integer, Optional<Integer>> getMaxByModulo4(Stream<Integer> s) {
        if(s != null){
            return s.collect(Collectors.groupingBy(
                n -> n % 4,
                Collectors.mapping(
                    n -> n,
                    Collectors.maxBy(Integer::compare)
                )
            ));
        }
        return new HashMap<>();
    }

    public static String orderAndConcatWithSharp(Stream<String> s) {
        
        if(s != null){
            return s.sorted()
                .collect(Collectors.joining(" # ", "{", "}"));
        }
        return "";
    }
}