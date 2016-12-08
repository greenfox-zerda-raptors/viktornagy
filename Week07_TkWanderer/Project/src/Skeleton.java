import java.util.Random;

/**
 * Created by Viktor on 2016.12.05..
 */

public class Skeleton extends Character {
    public Skeleton(String positionPicture, int posX, int posY) {
        super(positionPicture, posX, posY);
    }

    public void startingStats(){

        randomNumberDice6=randomNumber.nextInt(6)+1;

        maxHealthPoint= 2 /* *x* */ *randomNumberDice6;
        currentHealthPoint= 2 /* *x* */ *randomNumberDice6;
        defendPoint= /* x/2* */ randomNumberDice6;
        strikePoint= /* x* */ randomNumberDice6;


    }

    public void currentStrikeValue() {
        randomNumberDice6 = randomNumber.nextInt(6) + 1;
        strikeValue = 2 * randomNumberDice6 + strikePoint;

    }

}