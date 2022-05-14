package Leson3;

import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        String number1 = "Life";
        String number2 = "Vodafone";
        String lifecell = "063";
        String vodafone = "050";
        String kyivstar = "098";
        System.out.println("Для определения оператора введите первые 3 цифры: ");
        Scanner s = new Scanner(System.in);
        String operator = s.nextLine();
        if (operator.equals(lifecell)) {
            System.out.println("Ваш мобильный оператор Life");
        }
        else if (operator.equals(vodafone)) {
            System.out.println(" Ваш иобильнй оператор Vodafone ");
        }
        else if (operator.equals(kyivstar)) {
            System.out.println(" Ваш мобильный оператор Kyivstsr");
        }
        else {
            System.out.println("Такого опретора мобильной сети не существует");
        }
        System.out.println("Выберите один из 3 тарифных планов : 1 - 50 минут на звонки + 10 СМС," +
                " 2 - 100 минут на звонки + 30 СМС," +
                " 3 - 200 мирут на звонки + 50 СМС. ");
        Scanner t = new Scanner(System.in);
        String tariffPlan = t.next();
        int tariff = 0;

        switch (tariffPlan) {
            case "3":
                tariff += 100;
            case "2":
                tariff += 75;
            case "1":
                tariff += 30;
                break;
            default:
                System.out.println("Неверный выбор. Пожалуста выберите 1, 2, или 3.");
                break;
        }
        if (tariff != 0) {
            System.out.println("Внесите " + tariff + " гривен.");
            System.out.println("Спасибо!");
        } else {
            System.out.println("Такого тарифного плана нет");
        }
    }
}