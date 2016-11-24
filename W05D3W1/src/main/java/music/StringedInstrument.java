package main.java.music;

/**
 * Created by viktor on 2016.11.16..
 */
public abstract class StringedInstrument extends Instrument {



    int numberOfStrings;
    final String formatForPlay = "%s, a %d-stringed instrument that %s\n";

    public StringedInstrument(String name, int numberOfStrings) {
        super.name=name;
        this.numberOfStrings=numberOfStrings;
    }

}
