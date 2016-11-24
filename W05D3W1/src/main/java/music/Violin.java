package main.java.music;

import main.java.music.StringedInstrument;

/**
 * Created by viktor on 2016.11.16..
 */
public class Violin extends StringedInstrument {

    String Violinsound="Screech";

    public Violin() {
        super("Violin", 4);
    }

    @Override
    public void play() {
        System.out.printf(formatForPlay, name, numberOfStrings, Violinsound);
    }
}
