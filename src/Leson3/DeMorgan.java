package Leson3;

public class DeMorgan {
    public static void main(String[] args) {

        boolean a = false;
        boolean b;
        b = a || false;
        b = !b;
        System.out.println(b);
        a = a || b;
        boolean c;
        c = a && (a || b);
        System.out.println(c);

        double m1 = 2.3;
        double m2 = 7.2;
        double m3 = 5.7;
        if (m1 < m3 & m3 < m2) {
            System.out.println("average number " + m3);
        } else System.out.println("not average number " + m3);


        boolean m;
        m = 7 >= 6;
        m = 7 != 7 || false;
        boolean w;
        w = m == false;
        System.out.println(w);


        int $ = 20;
        if ($ != 0) {
            System.out.println(100 / $);
        }


        int r = 0;
        if (r != 0) {
            System.out.println(100 / r);
        } else
            System.out.println("На нуль делить нельзя");


        boolean z = false;
        boolean d = true;
        System.out.println(z & d);
        System.out.println(!(!z | d));


        boolean a2 = true;
        boolean b2 = false;
        if (!a2 || !b2) {
            System.out.println("!a2 || !b2 = " + (!a2 || !b2));
        } else
            System.out.println("!a2 || !b2 = " + (!a2 || !b2));

        if (!(a2 && b2)) {
            System.out.println("!(a2 && b2) = " + !(a2 && b2));
        } else
            System.out.println("!(a2 && b2) = " + !(a2 && b2));


        boolean l = true;
        boolean p = true;
        System.out.println("!(l & p) = " + !(l & p));
        System.out.println("l & !z = " + (l & !z));
        System.out.println("!(!l || p) = "+! (!l || !p));
    }
}
