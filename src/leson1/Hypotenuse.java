package leson1;
import java.util.Arrays;
public class Hypotenuse {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 4, 5, 7};
        System.arraycopy(arr, 3, arr, 2, 3);
        Arrays.copyOf(arr, 5);
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
