package leson7;

public class Recursion {
    static int factorial(int n) {
        int result;

        if (n < 2) {
            return 1;
        }
        result = factorial(n - 1) * n;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Факториал 1 - " + factorial(1));
        System.out.println("Факториал 5 - " + factorial(5));
        System.out.println("Факториал 6 - " + factorial(6));
        System.out.println("Факториал 20 - " + factorial(20));
    }
}