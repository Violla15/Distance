package Leson3;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        long a;
        long d;
        long result;
        char operation;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        a = reader.nextLong();
        d = reader.nextLong();
        System.out.print("Какое действие вы хотите выполнить (+, -, *, /): ");
        operation = reader.next().charAt(0);
        switch (operation) {
            case '+':
                result = a + d;
                break;
            case '-':
                result = a - d;
                break;
            case '*':
                result = a * d;
                break;
            case '/':
                result = a / d;
                break;
            default:
                System.out.printf(" Ви ввели не число ");
                return;
        }
        System.out.print(" Рузультат вашего действия");
        System.out.printf(a + " " + operation + " " + d + " = " + result);
    }
}