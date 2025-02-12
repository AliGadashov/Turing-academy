package findNumberInArray;

import java.util.Arrays;
import java.util.Random;

public class Find {

    public static int[] generateRandomArray(int length, int uniqueNumbers) {
        Random random = new Random();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(uniqueNumbers) + 1;
        }
        return array;
    }

    public static void find(int number) {
        int[] randomArray = generateRandomArray(10, 5);

        System.out.println(Arrays.toString(randomArray));
        for (int i = 0; i < 10; i++) {
            if (randomArray[i] == number){
                System.out.println("Find: "+ number);

            }
        }
    }
}
