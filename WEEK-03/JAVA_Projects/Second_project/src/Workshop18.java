
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by viktor on 2016.11.05..
 */
public class Workshop18 {



     public static int sum_the_numbers() {
         ArrayList<Integer> numbers_list = new ArrayList<Integer>();
        boolean _read=true;


         Scanner scanner_numbers = new Scanner(System.in);

         while(_read)
         {
             /*
             String temp_read=scanner_numbers.next();
             if("q".equals(temp_read))
             {

               _read=false;
             }
             */
             int read_int=scanner_numbers.nextInt();

             if(read_int==0)
             {
                 _read=false;
             }
             else
             {
                 //int num = 0;
                 //num = Integer.parseInt(temp_read);
                 numbers_list.add(read_int);
             }
         }

         int sum=0;
         for(int actnum:numbers_list)
         {
          sum+=actnum;

         }
         return sum;
     }

    public static void main(String[] args) {
        // write a function that sum all the numbers until the given parameter

             //ArrayList<String> list = new ArrayList<String>();
             //for(int i =0; i<20; i++)
             //{
             //    list.add("string"+i);
             //}

        System.out.println(sum_the_numbers());
    }
}
