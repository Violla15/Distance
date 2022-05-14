package Car;

public class Main {
    public static void main(String[] args) {
        Car3 nisan = new Car3(2009, 120, 3);
        Car3 bmw = new Car3(1997);
        Car3 fiat = new Car3(1995, 189, 2, "black");
        System.out.println(" BMW (info): " + bmw.getYear());
        System.out.println(" Nisan(info): year - " + nisan.getYear() + ". Speed - " + nisan.getSpeed() + " . Weight - " + nisan.getWeight());
        System.out.println(" Fiat (info): year - " + fiat.getYear() + ", speed- " + fiat.getSpeed() + ", weight - " + fiat.getWeight() + ", colour - " + fiat.getColour());
    }
}
