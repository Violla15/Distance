package Leson10;

public class Animal implements Animal1{

    public void eat() {
        System.out.println("Я буду есть ");
    }
    public void run(){
        System.out.println("Я буду бегать ");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.run();
    }
}
