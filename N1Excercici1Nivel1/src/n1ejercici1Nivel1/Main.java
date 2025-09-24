package n1ejercici1Nivel1;

import model.*;

public class Main {
    public static void main(String[] args) {

        // the loading is triggered by the access to the static members of the classes, in this case
        // the prepare() method

        Wind.prepare();
        Chordophone.prepare();
        Percusion.prepare();
        System.out.println();

        // Here the loading is triggered when creating the objects
        Wind newWind = new Wind("Trompet", 100);
        Chordophone newChordophone = new Chordophone("Violin", 400);
        Percusion newPercusion = new Percusion("xilophone", 300);

        newWind.play();
        newChordophone.play();
        newPercusion.play();

    }
}
