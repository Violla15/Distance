package leson13;
import java.util.Scanner;
 interface Playable {
    void play();
    void pause();
    void stop();
}
 interface Recodable {
    void record();
    void pause();
    void stop();
}
class Player implements Playable, Recodable {
    public void play() {
        System.out.println("Проигрывание");
    }
    public void pause() {
        System.out.println("Пауза");
    }
    public void stop() {
        System.out.println("Стоп");
    }
    public void record() {
        System.out.println("Запись");
    }
}
class Test {
    public static void main(String[] args) {
        Player player = new Player();
        String play = "1";
        String pause = "2";
        String stop = "3";
        String record = "4";
        String recordingPause = "5";
        String recordingStop = "6";
        System.out.println("Чтобы начать проигрывание введите 1 \nЧтобы начать запись введите 4 ");
        Scanner s = new Scanner(System.in);
        String number1 = s.nextLine();
        if (number1.equals(play)) {
            player.play();
        } else if (number1.equals(record)) {
            player.record();
        }
        System.out.println("Поставить на паузу проигрывание введите 2 \nПоставить на паузу запись введите 5 ");
        String number2 = s.nextLine();
        if (number1.equals(pause)) {
            player.pause();
        } else if (number2.equals(recordingPause)) {
            player.record();
        }
        System.out.println("Остановить проигрывание введите 3 \nОстановить запись введите 6  ");
        String number3 = s.nextLine();
        if (number2.equals(stop)) {
            player.stop();
        } else if (number3.equals(recordingStop)) {
            player.stop();
        } else {
            System.out.println("Не правильный ввод");
        }
    }
}



