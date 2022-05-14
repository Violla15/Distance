package Books;

import java.util.Scanner;

public class Book {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Author author = new Author();
        System.out.println("Введите имя автора книги : ");
        author.setAutName(s);
        author.Show();
        Tetle tetle = new Tetle();
        System.out.println("Введите название книги : ");
        tetle.setBookName(s);
        tetle.show();
        Content content = new Content();
        System.out.println("О чем данная кникаав : ");
        content.setBookContent(s);
        content.show();

    }
}