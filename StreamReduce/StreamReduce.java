import java.util.stream.*;

public class StreamReduce {
    public static Integer sumAll(Stream<Integer> s) {
        if (s == null){
            return 0;
        }
        return s.mapToInt(Integer::intValue).sum();
    }

    public static Integer divideAndAddElements(Stream<Integer> s, int divider) {
        if (s == null){
            return 0;
        }
        return (int) s.mapToDouble(val -> (double) val / divider).sum();
    }
}