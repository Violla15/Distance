package Books;
import java.util.Scanner;

public class Author {
    private String autName;
    public String getS() {
        return autName;
    }
    public void setAutName(Scanner s) {
        this.autName = s.nextLine();
    }
    public void Show() {
        System.out.println("Автор книги: " + autName);
    }

}
