package practice.groupWordsByLength;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Dog","Cat","Apple","Banana");

        groupWordsByLength(words);
    }

    public static void groupWordsByLength(List<String> words) {
        Map<Integer, List<String>> collect = words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(collect);
    }

}
