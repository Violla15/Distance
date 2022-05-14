package Leson10;

import java.util.Scanner;

public class ArrFeelings {
    private static final String[] feelings = {"anger", "awe", "joy", "love", "grief"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        System.out.println(words(result));

    }

    static int [] getFreqMap(String word) {
        int[] freq = new int[26];
        for (char c : word.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                freq[c - 'a']++;
            }
        }
        return freq;
    }

    static int words(String result) {
        int[] inputFreq = getFreqMap(result);
        int count = 0;
        for (
                String word : feelings) {
            int[] wordFreq = getFreqMap(word);
            boolean ok = true;
            for (int i = 0; ok && i < inputFreq.length; i++) {
                if (wordFreq[i] > inputFreq[i]) {
                    ok = false;
                }
            }
            if (ok) {
                count++;
            }
        }
        return count;
    }
}