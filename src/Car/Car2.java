package Car;

public class Car2 {
    private int year;
    private double speed;
    private int weight;
    private String colour;

    public Car2(int weight) {
        this.weight = weight;
    }

    public Car2(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public Car2(int year, double sped, String colour) {
        this.year = year;
        this.speed = speed;
        this.colour = colour;
    }

    public Car2(int year, double speed, int weight, String colour) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.colour = colour;
    }

    class Main {
        public static void main(String[] args) {
            Car2 car = new Car2(3, "blue");
            Car2 car1 = new Car2(2002, 120.8, "red");
            Car2 car2 = new Car2(2009, 2, 170, "black");
            Car2 car3 = new Car2(5);

        }
    }
}

