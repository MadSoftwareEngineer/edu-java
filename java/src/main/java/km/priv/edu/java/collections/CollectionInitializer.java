package km.priv.edu.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionInitializer {

    public static <T> T[] getArrayOfGenericItems(T... items) {
        T[] example1 = (T[]) Arrays.asList(items).toArray();

        T[] example2 = (T[]) Arrays.stream(items).toArray();

        return example1;
    }

    public static String[] getArrayOfStrings(String... items) {
        String[] example1 = new String[2];
        example1[0] = items[0];
        example1[1] = items[1];

        String[] example2 = new String[]{items[0], items[1]};

        return example1;
    }

    public static <T> List<T> getListOfGenericItems(T... items){
        List<T> example1 = new ArrayList<>(Arrays.asList(items));

        List<T> example2 = new LinkedList<>(Arrays.asList(items));

        List<T> example3 = Stream.of(items)
                .collect(Collectors.toList());

        return example1;
    }

    public static <T> ArrayList<T> getArrayListOfGenericItems(T... items) {
        ArrayList<T> example1 = new ArrayList<>(Arrays.asList(items));

        ArrayList<T> example2 = new ArrayList<T>() {
            {
                for(T i : items)
                    add(i);
            }
        };

        return example1;
    }

    public static ArrayList<String> getArrayListOfString(String... items) {
        ArrayList<String> example1 = new ArrayList<>(Arrays.asList(items));

        ArrayList<String> example2 = new ArrayList<String>() {
            {
                for(String i : items)
                    add(i);
            }
        };

        ArrayList<String> example3 = (ArrayList<String>) Stream.of(items)
                .collect(Collectors.toList());

        return example1;
    }
}
