package model;

public class Percusion extends Instrument {

    public Percusion(String name, int price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A percussion instrument is playing");
    }

    public static void prepare() {
        System.out.println("preparing percusion instruments");
    }

    @Override
    public String toString() {
        return "Percusion{} " + super.toString();
    }
}
