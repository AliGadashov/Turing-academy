package practice.groupByFrequent;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple","apple","banana", "apple", "orange", "banana", "banana");
        int k = 3;
        getTopKFrequentWords(words, k);

    }

    public static void getTopKFrequentWords(List<String> words, int k) {
        Map<String, Integer> wordFrequencyMap = words.stream()
                .collect(Collectors.toMap(word -> word, word -> 1, Integer::sum));

        var wordsWithFrequencyK = wordFrequencyMap.keySet().stream()
                .filter(word -> wordFrequencyMap.get(word) == k)
                .sorted(Comparator.naturalOrder())
                .toList();

        if (wordsWithFrequencyK.isEmpty()) {
            System.out.println("No words found with frequency: " + k);
        } else {
            wordsWithFrequencyK.forEach(word ->
                    System.out.println(word + " -> " + wordFrequencyMap.get(word)));
        }
    }

}
