package practice.FindUniqueCharacters;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String[] words = {"Banana", "Cherry", "Apple"};

        findUniqueCharacters(words);

    }

    public static void findUniqueCharacters(String[] words) {

        Set<String> letters = Arrays.stream(words)
                .map(String::toLowerCase)
                .flatMap(s -> Arrays.stream(s.split("")))
                .collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet<String> collect = letters.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(collect);

    }

}
