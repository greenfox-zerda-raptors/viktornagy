/**
 * Created by viktor on 2016.11.14..
 */

public class Workshop01 {


        public static void main(String[] args) {
            Car myCar1 = new Car();
            Car myCar2 = new Car();
            Car myCar3 = new Car();

ver
            myCar1.setColor("red");
            myCar2.setColor("silver");
            myCar3.setColor("green");
            myCar1.setKmOdometer(12313);
            myCar2.setKmOdometer(78668);
            myCar3.setKmOdometer(34535);
            myCar1.setSizeEngine(2500);
            myCar2.setSizeEngine(1500);
            myCar3.setSizeEngine(1100);
            myCar1.setTypeCar("Suzuki");
            myCar2.setTypeCar("BMW");
            myCar3.setTypeCar("Aston Martin");

            myCar2.drive(51);
            System.out.println("This "+myCar1.getTypeCar()+" is "+myCar1.getColor()+", has "+myCar1.getSizeEngine()+" cc engine and clocked "+myCar1.getKmOdometer()+" km's.");
            System.out.println("This "+myCar2.getTypeCar()+" is "+myCar2.getColor()+", has "+myCar2.getSizeEngine()+" cc engine and clocked "+myCar2.getKmOdometer()+" km's.");
            System.out.println("This "+myCar3.getTypeCar()+" is "+myCar3.getColor()+", has "+myCar3.getSizeEngine()+" cc engine and clocked "+myCar3.getKmOdometer()+" km's.");

            System.out.println("");
            System.out.println(myCar1.toString());

            Car myCar05 = new Car("Opel", "white", 1400, 25);
            Car myCar06 = new Car("VW", "grey"); // defaults to 1600 cc, 10 kms
            Car myCar07 = new Car(1100, 15); // defaults to a red

            System.out.println("");
            System.out.println(myCar05.toString());
            System.out.println(myCar06.toString());
            System.out.println(myCar07.toString());

        }
    }
