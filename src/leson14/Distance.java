package leson14;

import java.util.Scanner;

public class Distance {
    static double distance;

    void print() {
        Distance.Converter converter = new Distance.Converter();
        System.out.println("Расстояние  в метрах - " + converter.toMeters());
        System.out.println("Растояние в километрах - " + converter.toKilometers());
        System.out.println("Растояние в милях - " + converter.toMiles());
        System.out.println("Растояние в ярдах - " + converter.toYards());
        System.out.println("Растояние в футах  - " + converter.toFt());
    }


    static class Converter {
        public double toMeters() {
            return distance * 1;
        }

        public double toKilometers() {
            return distance / 1000;
        }

        public double toMiles() {
            return distance / 1609.34;
        }

        public double toYards() {
            return distance / 0.9144;
        }

        public double toFt() {
            return distance / 0.3048;
        }
    }

    static class Test {
        public static void main(String[] args) {
            System.out.println("Введите растояние в метрах : ");
            Scanner s = new Scanner(System.in);
            distance = s.nextDouble();
            Distance distance = new Distance();
            distance.print();
        }
    }
}

