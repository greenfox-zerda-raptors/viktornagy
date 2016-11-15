import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by viktor on 2016.11.14..
 */
public class Workshop01Array {
    public static void main(String[] args) {


        String[] colors = new String[]{"white", "blue", "red", "silver", "black", "green", "banana"};
        String[] makes = new String[]{"toyota", "mazda", "bmw", "vw", "opel", "suzuki", "ford", "mercedes"};
        int[] engineSizes = new int[]{1100, 1400, 1600, 1800, 2500};

        Random randomNumber = new Random();

        ArrayList<Object> carsList = new ArrayList<Object>();

        for (int i = 0; i < 10; i++) {
            int rnde = randomNumber.nextInt(engineSizes.length);
            int rndm = randomNumber.nextInt(makes.length);
            int rndc = randomNumber.nextInt(colors.length);
            Car car001 = new Car(makes[rndm], colors[rndc], engineSizes[rnde]);

            carsList.add(i, car001);
            System.out.println(carsList.get(i).toString());
            System.out.println(car001.getCount());


            if (i == 9) {
                System.out.println("The number of cars is:   " + car001.getCount());
            }
        }
    }
}