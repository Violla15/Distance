package Car;

public class Car {
    private int year;
    private String colour;

    public Car(String colour) {
        this.colour = colour;
    }

    public Car(int year, String colour) {
        this.year = year;
        this.colour = colour;
    }

    public static void main(String[] args) {
        Car car = new Car("black");
        Car car2 = new Car(1995, "red");
        System.out.println("Car's color is " + car.colour + " .");
        System.out.println("Year manufacture of the car " + car2.year + " . Color is " + car2.colour + " .");
    }
}

