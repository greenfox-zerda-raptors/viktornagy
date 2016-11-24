/**
 * Created by viktor on 2016.11.14..
 */
public class Car {

    private int sizeEngine;
    private String color;
    private String typeCar;
    private int kmOdometer;
    private static int counter;


    public Car() {
        this.typeCar="Mazda";
        this.color="red";
        this.sizeEngine=1600;
        this.kmOdometer=10;
        counter++;
    }

    public Car(String typeCar, String color, int sizeEngine) {
        this();
        this.typeCar=typeCar;
        this.color=color;
        this.sizeEngine=sizeEngine;
    }

    public Car(String typeCar, String color, int sizeEngine, int kmOdometer) {
        this.typeCar=typeCar;
        this.color=color;
        this.sizeEngine=sizeEngine;
        this.kmOdometer=kmOdometer;
    }

    public Car(String typeCar, String color) {
        this();
        this.typeCar=typeCar;
        this.color=color;
    }


    public Car(int sizeEngine, int kmOdometer) {
        this();
        this.sizeEngine=sizeEngine;
        this.kmOdometer=kmOdometer;
    }


    public int getKmOdometer() {
        return kmOdometer;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public int getSizeEngine() {
        return sizeEngine;
    }

    public String getColor() {
        return color;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar=typeCar;
    }

    public void setKmOdometer(int kmOdometer) {
        this.kmOdometer=kmOdometer;
    }

    public void setColor(String color) {
        this.color=color;
    }

    public void setSizeEngine(int sizeEngine) {
        this.sizeEngine=sizeEngine;
    }

  //  public void setDrive(int drive) {
    //    this.drive=drive;
   // }

    public void drive(int kmDrive) {

        if (kmDrive<20) {
            System.out.println("brrm,"+color+" "+typeCar+" just drove around town "+kmDrive+" clicks.");
        }
        else if (kmDrive>50) {
            System.out.println("brrm, screech, brrm, screech; "+color+" "+typeCar+" commuted "+kmDrive+" clicks.");
        }
        else {
            System.out.println("whee, "+color+" "+typeCar+" "+kmDrive+" clicks.");
        }
    }
    @Override
    public String toString() {
        return "This "+getTypeCar()+" is "+getColor()+", has "+getSizeEngine()+" cc engine and clocked "+getKmOdometer()+" km's.";
    }

    public Integer getCount(){
        return counter;
    }

}
