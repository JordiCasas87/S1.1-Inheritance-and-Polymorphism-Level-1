package model;

public class Chordophone extends Instrument {

    public Chordophone(String name, int price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A String instrument is playing");
    }

    public static void prepare() {
        System.out.println("preparing chordophone instruments");
    }

    @Override
    public String toString() {
        return "Chordophone{} " + super.toString();
    }
}
