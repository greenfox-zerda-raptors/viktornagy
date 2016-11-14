/**
 * Created by viktor on 2016.11.09..
 */
/**************************************************************************************************
 * Workshop: Practice With Exceptions: Arithmetic Overflow
 * Write a routine that catches an arithmetic overflow (that is, larger than the Integer.MAX_VALUE)
 * Note that Integer and int are NOT the same thing; and that Integer offers you properties such as
 * MAX_VALUE.
 * Use the Scanner routine to take the input from the keyboard; if the value is okay then
 * print "Yum", and then 1/2 the value entered.  For example:-
 * INPUT or 0 to end?  12334556677723131
 * Invalid value
 * (and the Java exception messages)
 * INPUT or 0 to end?  12345678
 * Yum 1234
 * INPUT or 0 to end?  123456
 * Yum 123
 * INPUT or 0 to end? 0
 * Bye!
 **************************************************************************************************/

import java.util.*;

public class Workshop03{

    public static void main(String[] args){


        boolean _read=true;
        Scanner userInput = new Scanner(System.in);
        Integer intInput=0;
        while (_read){

            try {
                System.out.println("INPUT or 0 to end?");
                intInput = userInput.nextInt();
                if (intInput == 0) {
                    _read=false;
                    System.out.println("Bye!");
                }
                else {
                    System.out.print("Yum ");
                    String stringNumber = intInput.toString();
                    String stringNumberhalf = stringNumber.substring(0, stringNumber.length() / 2);
                    System.out.println(stringNumberhalf);
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println("Kivétel történt!! De folytatjuk....");
                System.out.println("Hiba: "+e.getLocalizedMessage());
                userInput.next();
            }

        }



    } //main
} //Workshop03
