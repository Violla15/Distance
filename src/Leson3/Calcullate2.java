package Leson3;

import java.util.Scanner;

public class Calcullate2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Для операции + пожалуйста введите первую цифру");
        int a = s.nextInt();
        System.out.println("Для операции + пожалуйста введите вторую цифру");
        int b = s.nextInt();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int c = a + b;
        System.out.println("a + b = " + c);

        System.out.println("Для операции - пожалуйста введите первую цифру");
        int q = s.nextInt();
        System.out.println("Для операции - пожалуйста введите вторую цифру");
        int w = s.nextInt();
        System.out.println("q = " + q);
        System.out.println("w = " + w);
        int e = q - w;
        System.out.println("q - w = " + e);

        System.out.println("Для операции * пожалуйста введите первую цифру");
        int r = s.nextInt();
        System.out.println("Для операции * пожалуйста введите вторую цифру");
        int t = s.nextInt();
        System.out.println("r = " + r);
        System.out.println("t =" + t);
        int y = r * t;
        System.out.println("r * t = " + y);

        System.out.println("Для операции / пожалуйста введите первую цифру");
        int u = s.nextInt();
        System.out.println("Для операции / пожалуйста введите вторую цифру");
        int i = s.nextInt();
        System.out.println("u = " + u);
        System.out.println("i = " + i);
        int o = u / i;
        System.out.println("u / i = " + o);

    }
}

