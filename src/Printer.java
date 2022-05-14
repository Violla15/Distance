import java.util.Scanner;

public class Printer {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public void print(String value) {
        System.out.println(ANSI_GREEN + value);
    }

    static class PrinterBlue extends Printer {
        @Override
        public void print(String value) {
            System.out.println(ANSI_BLUE + value);
        }
    }

    static class PrinterYellow extends Printer {
        @Override
        public void print(String value) {
            super.print(ANSI_YELLOW + value);
        }
    }

    static class PrinterRed extends Printer {
        @Override
        public void print(String value) {
            super.print(ANSI_RED + value);
        }
    }

    static class PrintPurple extends Printer {
        @Override
        public void print(String value) {
            super.print(ANSI_PURPLE + value);
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите строку : ");
        Scanner s = new Scanner(System.in);
        Printer yellow = new PrinterYellow();
        yellow.print(s.nextLine());
        Printer blue = new PrinterBlue();
        blue.print(s.nextLine());
        PrinterRed red = new PrinterRed();
        red.print(s.nextLine());
        Printer purple = new PrintPurple();
        purple.print(s.nextLine());
    }
}