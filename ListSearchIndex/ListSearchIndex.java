import java.util.*;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if(list.contains(value)){
            return list.lastIndexOf(value);
        }
        return null;
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if(list.contains(value)){
            return list.indexOf(value);
        }
        return null;
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        if(list.contains(value)){
            List<Integer> array = new ArrayList<>();
            for(int i = 0; i < list.size(); i++){
                if (list.get(i) == value){
                    array.add(i);
                }
            }
            return array;
        }
        return new ArrayList<>();
    }
}