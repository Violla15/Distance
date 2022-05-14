package Computer;

class MyComputer {
    protected static Computer[] models = new Computer[5];

    public static void main(String[] args) {
        models[0] = new Computer("Lenovo");
        models[1] = new Computer("Acer");
        models[2] = new Computer("Apple");
        models[3] = new Computer("Asus");
        models[4] = new Computer("Intel");
        for (int i = 0; i < 5; i++) {
            System.out.println(models[i].name);
        }
    }
    static class Computer {
        String name;

        public Computer(String name) {
            this.name = name;
        }
    }
}
