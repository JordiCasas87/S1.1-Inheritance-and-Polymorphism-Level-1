package model;

public class Wind extends Instrument {


    public Wind(String name, int price) {
        super(name, price);
    }

    public static void prepare() {
        System.out.println("preparing wind instruments");
    }

    @Override
    public void play() {
        System.out.println("A wind instrument is playing");
    }

    @Override
    public String toString() {
        return "Wind{} " + super.toString();
    }
}

