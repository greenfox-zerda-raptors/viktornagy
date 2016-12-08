import java.util.Random;

/**
 * Created by Viktor on 2016.12.05..
 */
/*
* Constructor kiegészít egy string-el (képirány)
*
* */
public class Hero extends Character {
    public Hero(String positionPicture, int posX, int posY){
            super(positionPicture, posX, posY);
    }

   public void startingStats(){

       randomNumberDice6=randomNumber.nextInt(6)+1;

       maxHealthPoint= 20 + 3 * randomNumberDice6;
       currentHealthPoint= 20 + 3 * randomNumberDice6;
       defendPoint= 2 * randomNumberDice6;
       strikePoint= 5 + randomNumberDice6;

   }

    public void currentStrikeValue() {
        randomNumberDice6 = randomNumber.nextInt(6) + 1;
        strikeValue = 2 * randomNumberDice6 + strikePoint;

    }

}