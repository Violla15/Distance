package Leson3;
public class Test {
public static void main(String[] args) {
    char ch = '0';
    while (ch <= 9)
        System.out.print(ch++);
        }

    public static class C01_Methods {
        // Методы.

        // На 9-й строке, создаем метод с именем procedure, который ничего не принимает и ничего не возвращает.
        // В теле метода, на 10-й строке выводим на экран строку - Hello!

        static void procedure() {
            System.out.println("Hello!");
        }

        public static void main(String[] args) {

            // В теле метода Main на 17-й строке, вызываем метод procedure.

            procedure();
        }
    }
}

