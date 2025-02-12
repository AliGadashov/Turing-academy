import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int[] randomArray = generateRandomArray(10, 5);

        int[] arr = {1,2,2,3,3,3,4,4,4,4};

        frequency(arr);

//        mostCommonUsedWords("qwer edrftgyh qwer tyui bnm bnm bnm bn tyuio ");

    }

    public static boolean frequencyCheck(int[] input) {
        return false;
    }

    public static void frequency(int[] input) {

        Map<Integer,Integer> numberList = new HashMap<>();
        Arrays.stream(input).forEach(number -> {
            numberList.merge(number, 1, Integer::sum);
        });



    }

    public static int[] generateRandomArray(int length, int uniqueNumbers) {
        Random random = new Random();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(uniqueNumbers) + 1;
        }
        return array;
    }


//    ====================================================================================

    public static void mostCommonUsedWords(String text) {

        text = text.toLowerCase();
        String[] words = text.split(" ");
        Map<String,Integer> wordsList = new HashMap<>();
        Arrays.stream(words).forEach(word -> {
            wordsList.merge(word.toLowerCase(), 1, Integer::sum);
        });

        mostCommonUsedWord(wordsList);
    }

    public static void mostCommonUsedWord(Map<String,Integer> wordsList) {

        wordsList.forEach((key, value) -> {
            String wordCount = value.toString();
            System.out.println("Soz: " + key + "\nCount: " + wordCount);
            System.out.println("============================");
        });

        wordsList.forEach((word, count) -> {
            if (Objects.equals(count, Collections.max(wordsList.values()))) {
                System.out.println("Ən çox işlənən söz: " + word + " (" + count + " dəfə)");
            }
        });
    }

//    ---------------------------------------------------------

    public static void binarySearchMethod() {
        int[] array = newArray();
        Arrays.sort(array);
        int target = new Random().nextInt(100);

        int index = binarySearch(array, target);

        if (index != -1) {
            System.out.println("Element " + target + " tapıldı, indeksi: " + index);
        } else {
            System.out.println("Element " + target + " tapılmadı.");
        }
    }

    public static int[] newArray() {

        int[] arr;

        Random random = new Random();

        arr = IntStream.range(0, 10).map(i -> random.nextInt(100)).toArray();

        System.out.println(Arrays.toString(arr));

        return arr;

    }

    public static int binarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}