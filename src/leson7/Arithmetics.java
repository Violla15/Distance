package leson7;

import java.util.Scanner;

public class Arithmetics {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b <= 0) {
            System.out.println("Делить на ноль нельзя.");
        } else
            return a / b;
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Введите первое число :  ");
        Scanner sk = new Scanner(System.in);
        int a = sk.nextInt();
        System.out.print("Какое действие вы хотите выполнить (+, -, *, /): ");
        char operation = sk.next().charAt(0);
        System.out.println("Введите второе число :  ");
        int b = sk.nextInt();
        int result;

        switch (operation) {
            case '+':
                result = add(a, b);
                break;
            case '-':
                result = sum(a, b);
                break;
            case '*':
                result = mul(a, b);
                break;
            case '/':
                result = div(a, b);
                break;
            default:
                System.out.println(" Ви ввели не число ");
                return;
        }
        System.out.print(" Рузультат вашего действия : ");
        System.out.println(a + "  " + operation + "  " + b + "  =  " + result);
    }
}