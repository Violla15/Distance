import java.awt.*;
import java.applet.*;
import java.util.Scanner;

public class Colour {

    private static Graphics g;
    public static String value;

    public void print(String value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        value = s.nextLine();


    }

    public void paint(Graphics g) {
        Color c1 = new Color(255, 100, 100);
        Color c2 = new Color(100, 200, 233);
        Color c3 = new Color(0xff000000 | (0xc0 << 16) | (0x00 << 8) | 0x00);
        c3.brighter();
        String value = "Критика на творчество Ивана Франко";
        g.setFont(new Font("TimesRoman", Font.PLAIN, 35));
        g.setColor(c1);
        g.drawString(value, 20, 40);
        g.setColor(c2);
        g.drawString(value, 20, 110);
        g.setColor(c3);
        g.drawString(value, 20, 180);
        System.out.println(c1 + value);


    }
}

