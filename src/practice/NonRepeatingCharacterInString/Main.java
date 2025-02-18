package practice.NonRepeatingCharacterInString;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String word = "swiss";

        firstUniqChar(word);

    }

    public static void firstUniqChar(String s) {

        Map<Character, Long> countMap = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        LinkedHashMap::new,
                        Collectors.counting())
                );

        countMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .ifPresent(entry -> System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue()));

    }

}
