import java.util.Comparator;
import java.util.List;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        if(list != null){
            List<Integer> array = list.stream().sorted(Comparator.naturalOrder()).toList();
            return array;
        }
        return list;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        if(list != null){
            List<Integer> array = list.stream().sorted(Comparator.reverseOrder()).toList();
            return array;
        }
        return list;
    }
}
