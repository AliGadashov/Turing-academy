package customizeNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        showNumbers();
    }

    public static void showNumbers() {
        var reFormatedNumbers = reFormatNumbers();

        reFormatedNumbers.keySet().stream()
                .sorted()
                .map(key -> key + ": " + reFormatNumbers().get(key))
                .forEach(System.out::println);
    }

    public static Map<String, String> reFormatNumbers() {

        var numbers = defaultNumber();

        return numbers.keySet().stream()
                .collect(Collectors.toMap(
                        key -> key,
                        key -> "+994" + numbers.get(key).substring(1)
                ));

    }

    public static Map<String, String> defaultNumber() {
        Map<String, String> numbers = new HashMap<>();

        numbers.put("Ali1", "0123456789");
        numbers.put("Ali2", "0123456788");
        numbers.put("Ali3", "0123456787");
        numbers.put("Ali4", "0123456786");
        numbers.put("Ali5", "0123456785");
        numbers.put("Ali6", "0123456784");
        numbers.put("Ali7", "0123456783");
        numbers.put("Ali8", "0123456782");
        numbers.put("Ali9", "0123456781");
        numbers.put("Ali10", "0123456780");

        return numbers;
    }


}
