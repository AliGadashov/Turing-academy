package practice.ComputeAverageScorePerStudent;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Pair> studentScores = Arrays.asList(
                new Pair("Alice", 90),
                new Pair("Bob", 80),
                new Pair("Alice", 100),
                new Pair("Bob", 70)
        );

//        computeAverageScores(studentScores);
        System.out.println("------------------------------------------------");
        computeAverageScores2(studentScores);
    }

//    public static void computeAverageScores(List<Pair> pairs) {
//        Map<String, Double> collect = pairs.stream()
//                .collect(Collectors.groupingBy(
//                        Pair::student,
//                        Collectors.averagingInt(Pair::score)
//                ));
//
//        System.out.println(collect);
//
//    }

//    Burada mapi nece sort eleyeceyimi bilemedim ona gore default sorted olunmaqi ucun asagidaki methodda treeden istifade eledim

    public static void computeAverageScores2(List<Pair> pairs) {

        TreeMap<String, Double> stringDoubleTreeMap = new TreeMap<>(pairs.stream()
                .collect(Collectors.groupingBy(
                        Pair::student,
                        Collectors.averagingInt(Pair::score)
                )));

        System.out.println(stringDoubleTreeMap);

    }

}
