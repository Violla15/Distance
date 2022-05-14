package Books;
import java.util.Scanner;

public class Tetle {
    private String bookName;
    public String getS() {
        return bookName;
    }
    public void setBookName(Scanner s) {
        this.bookName = s.nextLine();
    }
    public void show() {
        System.out.println("Название книги: " + bookName);
    }
}



