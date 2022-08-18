import java.util.*;
public class ValueComparator<K extends Comparable<? super K>,
        V extends Comparable<? super V>>
        implements Comparator<Map.Entry<K, V>> {

    public int compare(Map.Entry<K, V> a, Map.Entry<K, V> b) {
        return  a.getValue().compareTo(b.getValue());
    }
}