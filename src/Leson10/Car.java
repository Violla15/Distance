package Leson10;

public abstract class  Car {
    private int id = 5;
    private String nane = "bmw";

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNane(String nane) {
        this.nane = nane;
    }

    public String getNane() {
        return nane;
    }
    public abstract void test (int id);


}