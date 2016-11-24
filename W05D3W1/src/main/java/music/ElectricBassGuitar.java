package main.java.music;

/**
 * Created by viktor on 2016.11.16..
 */
public class ElectricBassGuitar extends StringedInstrument {

    public ElectricBassGuitar() {
        super("Bass Guitar", 4);
    }

    public ElectricBassGuitar(int NumberOfString) {
        super("Bass Guitar", NumberOfString);
    }

    @Override
    public void play() {
        System.out.printf(formatForPlay, name, numberOfStrings, "Duum-duum-duum");
    }
}
