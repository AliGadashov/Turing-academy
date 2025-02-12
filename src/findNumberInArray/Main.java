package findNumberInArray;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Find.find(5);

        List<Integer> list = List.of();

        list.stream()
                .filter(e -> e % 2 == 0)
                .reduce(Integer::sum)
                .ifPresentOrElse(System.out::println, () -> System.out.println("Nothing found"));
    }

}

