package practice.filterAndTransformList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        filterAndTransformList(list);
    }

    public static void filterAndTransformList(List<Integer> list) {

        ArrayList<Integer> collect = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(collect);

    }
}
