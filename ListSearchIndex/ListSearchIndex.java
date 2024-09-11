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
        if(list != null && list.contains(value)){
            List<Integer> array = new ArrayList<>();
            for(int i = 0; i < list.size(); i++){
                if ((int) list.get(i) == (int) value){
                    array.add(i);
                }
            }
            return array;
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        System.out.println(ListSearchIndex.findLastIndex(List.of(9, 13, 89, 8, 23, 1, 0, 89), 89));
        System.out.println(ListSearchIndex.findFirstIndex(List.of(9, 13, 89, 8, 23, 1, 0, 89), 89));
        System.out.println(ListSearchIndex.findAllIndexes(List.of(43784, 13, 89, 8, 23, 1, 0, 89), 43784).toString());
    }
}