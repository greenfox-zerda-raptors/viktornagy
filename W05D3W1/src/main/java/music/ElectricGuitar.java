package main.java.music;

/**
 * Created by viktor on 2016.11.16..
 */
public class ElectricGuitar extends StringedInstrument {
    private final String Electricguitarsound="Twang";


    public ElectricGuitar() {
        super("Electric guitar", 6);
    }

    public ElectricGuitar(int numberOfString){
        super("Electric guitar", numberOfString);
    }

    @Override
    public void play() {
        System.out.printf(formatForPlay, name, numberOfStrings, Electricguitarsound);
    }
}
