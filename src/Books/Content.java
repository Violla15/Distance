package Books;
import java.util.Scanner;
public class Content {

    private String bookContent;
    public String getS() {
        return bookContent;
    }
    public void setBookContent(Scanner s) {
        this.bookContent = s.nextLine();
    }

    public void show() {
        System.out.println("Содержание книги: " + bookContent);
    }
}

