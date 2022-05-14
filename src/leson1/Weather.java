package leson1;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите температуру");
        int i = sc.nextInt();
        if (i > 5) {
            System.out.println("На улице тепло");
        }
        if (i < 0) {
            System.out.println("На улице холодно");
        }
    }
}