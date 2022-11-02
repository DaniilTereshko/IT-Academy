package exam;

import java.util.HashMap;
import java.util.Map;

public class Grade7 {
    public static void main(String[] args) {
        Integer[] ints = new Integer[] {2,3,5,6,3,6,7,4,2,4,6,4,1,3,7};
        System.out.println(arrayToMap(ints));
    }
    public static <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> ksHashMap = new HashMap<>();
        for (int i = 0; i < ks.length; i++) {
            ksHashMap.computeIfPresent(ks[i], (k,v) -> v+1);
            ksHashMap.putIfAbsent(ks[i], 1);
        }
        return ksHashMap;
    }
}
