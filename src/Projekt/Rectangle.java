package Projekt;

import java.util.Scanner;

public class Rectangle {
    protected static double side1;
    protected static double side2;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ввудите значение 2 сторон прямоугольника : ");
        side1 = s.nextDouble();
        side2 = s.nextDouble();
        System.out.println(" Площадь прямоугольника равна - " + (areaCalculator(side1, side2)));
        System.out.println(" Перимерт прямоугольника равен - " + (perimeterCalculator(side1, side2)));

    }

    static double areaCalculator(double side1, double side2) {
        return side1 * side2;
    }

    static double perimeterCalculator(double side1, double side2) {
        return 2 * (side1 + side2);
    }
}
