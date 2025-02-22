package practice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        computeAverageScores();
        System.out.println("----------------------");
        filterAndTransformList();
        System.out.println("----------------------");
        findUniqueCharacters();
        System.out.println("----------------------");
        groupWordsByLength();
        System.out.println("----------------------");
        firstUniqChar();
    }

//    ------------------------------------------------------------------------------------------------

//    Compute Average Score per Student
//    Given a list of (studentName, score) pairs, compute the average score for each student.
//    Example: [("Alice", 90), ("Bob", 80), ("Alice", 100), ("Bob", 70)] → {Alice=95.0, Bob=75.0}

    public static void computeAverageScores() {

        List<Pair> pairs = Arrays.asList(
                new Pair("Alice", 90),
                new Pair("Bob", 80),
                new Pair("Alice", 100),
                new Pair("Bob", 70)
        );

        System.out.println("------------------------------------------------");

        TreeMap<String, Double> stringDoubleTreeMap = new TreeMap<>(pairs.stream()
                .collect(Collectors.groupingBy(
                        Pair::student,
                        Collectors.averagingInt(Pair::score)
                )));

        System.out.println(stringDoubleTreeMap);

    }

//    ------------------------------------------------------------------------------------------------

//    Find the First Non-Repeating Character in a String
//    Given a string, return the first character that does not repeat.
//    Example: "swiss" → 'w'

    public static void firstUniqChar() {
        String word = "swiss";

        Map<Character, Long> countMap = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        countMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .ifPresent(entry -> System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue()));

    }

//    ------------------------------------------------------------------------------------------------

//    Find Unique Characters
//    Given a list of strings, return a list of unique characters across all strings, sorted in ascending order.
//    Example: ["apple", "banana", "cherry"] → ["a", "b", "c", "e", "h", "l", "n", "p", "r", "y"]

    public static void findUniqueCharacters() {

        String[] words = {"Banana", "Cherry", "Apple"};

        List<Character> uniqueChars = Arrays.stream(words)
                .flatMap(str -> str.chars().mapToObj(c -> (char) c))
                .distinct()
                .sorted()
                .toList();

        System.out.println(uniqueChars);

    }

//    ------------------------------------------------------------------------------------------------

//    Filter and Transform List
//    Given a list of integers, filter out odd numbers, square the remaining even numbers, and return them in descending order.
//    Example: [1, 2, 3, 4, 5, 6] → [36, 16, 4]

    public static void filterAndTransformList() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        ArrayList<Integer> collect = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(collect);

    }

//    ------------------------------------------------------------------------------------------------

//    Group Words by Length
//    Given a list of words, group them by their length.
//    Example: ["dog", "cat", "apple", "banana"] → {3=[dog, cat], 5=[apple], 6=[banana]}

    public static void groupWordsByLength() {

        List<String> words = Arrays.asList("Dog", "Cat", "Apple", "Banana");

        Map<Integer, List<String>> collect = words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(collect);
    }

}
