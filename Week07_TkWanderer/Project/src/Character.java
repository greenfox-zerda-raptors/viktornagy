import java.util.Random;

/**
 * Created by Viktor on 2016.12.05..
 */
/*Fieldek írása
* Fügvény ami beállítja a fieldeket (életerő, pozíció, minden)
*
* */
public class Character extends GameObject {

    int maxHealthPoint;
    int currentHealthPoint;
    int defendPoint;
    int strikePoint;
    int strikeValue;
    int randomNumberDice6;
    Random randomNumber= new Random();

    public Character(String filename, int posX, int posY){
        super( filename,  posX,  posY);
    }



}
