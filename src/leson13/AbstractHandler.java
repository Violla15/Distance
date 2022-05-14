package leson13;

import java.util.Scanner;

public abstract class AbstractHandler {
    public abstract void open();

    public abstract void create();

    public abstract void change();

    public abstract void save();
}

class XMLHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println(" Открытие файла XML");
    }

    @Override
    public void create() {
        System.out.println("Создание файла XML");
    }

    @Override
    public void change() {
        System.out.println("Редактирование файла XML");
    }

    @Override
    public void save() {
        System.out.println("Сохранение файла XML");
    }
}

class DocHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Открытие файла DOC");
    }

    @Override
    public void create() {
        System.out.println("Создание файла DOC");
    }

    @Override
    public void change() {
        System.out.println("Редактирование файла DOC");
    }

    @Override
    public void save() {
        System.out.println("Сохранение файла DOC");
    }
}

class TXTHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Открытие файла TXT");
    }

    @Override
    public void create() {
        System.out.println("Создание файла TXT");
    }

    @Override
    public void change() {
        System.out.println("Редактирование файла TXT");
    }

    @Override
    public void save() {
        System.out.println("Сохранение файла TXT");
    }
}

class Test2 {
    public static void main(String[] args) {
        String formatDoc;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter document format: ");
        formatDoc = scanner.next();

        switch (formatDoc) {
            case "DOC" -> {
                AbstractHandler doc = new DocHandler();
                doc.open();
                doc.create();
                doc.change();
                doc.save();
            }
            case "XML" -> {
                AbstractHandler xml = new XMLHandler();
                xml.open();
                xml.create();
                xml.change();
                xml.save();
            }
            case "TXT" -> {
                AbstractHandler txt = new TXTHandler();
                txt.open();
                txt.create();
                txt.change();
                txt.save();
            }
            default -> System.out.println("Failed format! Enter again!");
        }

    }
}

