package Leson10;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(-10, 11);
        }
        divide(array);
    }

    private static void divide(int[] array) {
        int positive = 0;
        int negative = 0;
        for (int elem : array) {
            if (elem > 0) positive++;
            else if (elem < 0) negative++;
        }

        int[] allPositive = new int[positive];
        int[] allNegative = new int[negative];
        positive = 0;
        negative = 0;

        for (int elem : array) {
            if (elem > 0) allPositive[positive++] = elem;
            else if (elem < 0) allNegative[negative++] = elem;
        }

        System.out.println("Positive: " + Arrays.toString(allPositive));
        System.out.println("Negative: " + Arrays.toString(allNegative));
    }

}





