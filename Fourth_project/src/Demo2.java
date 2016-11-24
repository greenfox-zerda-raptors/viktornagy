import java.util.*;
/**
 * Created by viktor on 2016.11.11..
 */
public class Demo2 {



    public static  void ForLoop(ArrayList<String> testarray,String instruction,String ChangeThis,String ChangeToThis,String RemoveThis)
    {
        switch(instruction)
        {
            case "WalkAndPrint":
                for(int i=0;i<testarray.size();i++)
                {
                    System.out.print(testarray.get(i)+" ");
                }
                System.out.println("");
                break;

            case "WalkAndChange":
                for(int i=0;i<testarray.size();i++)
                {
                    if(testarray.get(i)==ChangeThis)
                    {
                        testarray.set(i,ChangeToThis);
                    }
                }
                System.out.println(testarray);
                break;

            case "WalkAndRemove":
                for(int i=0;i<testarray.size();i++)
                {
                    if(testarray.get(i)==RemoveThis)
                    {
                        testarray.remove(i);
                    }
                }
                System.out.println(testarray);
                break;
        }
    }

    public static void ForEach(ArrayList<String> testarray,String instruction,String ChangeThis,String ChangeToThis,String RemoveThis)
    {
        switch(instruction)
        {
            case "WalkAndPrint":

                for(String element:testarray )
                {
                    System.out.print(element+" ");
                }
                System.out.println("");
                break;
            case "WalkAndChange":
                for(String element:testarray )
                {
                    if(element==ChangeThis)
                    {
                        //element=ChangeToThis;
                        testarray.set(testarray.indexOf(element),ChangeToThis);
                    }
                }
                System.out.println(testarray);
                break;

            case "WalkAndRemove":
                for(String element:testarray )
                {
                    if(element==RemoveThis)
                    {
                        //testarray.remove(testarray.indexOf(element));
                        testarray.remove(element);
                    }
                }
                System.out.println(testarray);
                break;
        }

    }

    public static  void Iterate(ArrayList<String> testarray,String instruction,String ChangeThis,String ChangeToThis,String RemoveThis)
    {

        ListIterator<String> it=null;
        switch (instruction)
        {
            case "WalkAndPrint":
                it=testarray.listIterator();
                while(it.hasNext()) {
                    System.out.print(it.next()+" ");
                }
                System.out.println("");
                break;

            case "WalkAndChange":
                it=testarray.listIterator();
                while(it.hasNext())
                {
                    if(it.next()==ChangeThis)
                    {
                        it.set(ChangeToThis);
                    }
                }
                System.out.println(testarray);
                break;

            case "WalkAndRemove":
                it=testarray.listIterator();
                while(it.hasNext())
                {
                    if(it.next()==RemoveThis)
                    {
                        it.remove();
                    }
                }
                System.out.println(testarray);
                break;
        }
    }


    public static  ArrayList<String> GenerateTestArray()
    {
        ArrayList<String> testarray = new ArrayList<String>(Arrays.asList("egy", "ketto", "harom", "negy", "negy","negy", "ot", "hat","negy"));
        return testarray;
    }

    public static  void main(String... args){


        String ChangeThis="harom";
        String ChangeToThis="three";
        String RemoveThis="negy";

        Scanner scaninput=new Scanner(System.in);
        boolean rundemo=true;

        System.out.println("Demo program Started....");

        while(rundemo)
        {
            //MENU
            System.out.println("=====================");
            System.out.println("| SELECT TEST CASE: |");
            System.out.println("| 0--Exit           |");
            System.out.println("| 1--For Loop       |");
            System.out.println("| 2--For each       |");
            System.out.println("| 3--Iterator       |");
            System.out.println("=====================");

            int readedcommand=scaninput.nextInt();

            switch(readedcommand)
            {
                case 0:
                    rundemo=false;
                    break;

                case 1:
                    System.out.println("");
                    System.out.println("=================");
                    System.out.println("| FOR LOOP TEST |");
                    System.out.println("=================");
                    System.out.println("1. WalkAndprint:");
                    ForLoop(GenerateTestArray(),"WalkAndPrint",ChangeThis,ChangeToThis,RemoveThis);
                    System.out.println("");
                    System.out.println("2. WalkAndChange harom to three:");
                    ForLoop(GenerateTestArray(),"WalkAndChange",ChangeThis,ChangeToThis,RemoveThis);
                    System.out.println("");
                    System.out.println("3. WalkAndRemove negy:");
                    ForLoop(GenerateTestArray(),"WalkAndRemove",ChangeThis,ChangeToThis,RemoveThis);
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("=================");
                    System.out.println("| FOR-EACH TEST |");
                    System.out.println("=================");
                    System.out.println("1. WalkAndprint:");
                    ForEach(GenerateTestArray(),"WalkAndPrint",ChangeThis,ChangeToThis,RemoveThis);
                    System.out.println("");
                    System.out.println("2. WalkAndChange harom to three:");
                    ForEach(GenerateTestArray(),"WalkAndChange",ChangeThis,ChangeToThis,RemoveThis);
                    System.out.println("");
                    System.out.println("3. WalkAndRemove negy:");
                    System.out.println("");
                    try {
                        ForEach(GenerateTestArray(),"WalkAndRemove", ChangeThis, ChangeToThis, RemoveThis);
                    }
                    catch (ConcurrentModificationException e) {
                        System.out.println("You can not change the List size in a for-each loop\n" + e.getMessage());
                    }
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("");
                    System.out.println("=================");
                    System.out.println("| ITERATOR TEST |");
                    System.out.println("=================");
                    System.out.println("1. WalkAndprint:");
                    Iterate(GenerateTestArray(),"WalkAndPrint",ChangeThis,ChangeToThis,RemoveThis);
                    System.out.println("");
                    System.out.println("2. WalkAndChange harom to three:");
                    Iterate(GenerateTestArray(),"WalkAndChange",ChangeThis,ChangeToThis,RemoveThis);
                    System.out.println("");
                    System.out.println("3. WalkAndRemove negy:");
                    Iterate(GenerateTestArray(),"WalkAndRemove",ChangeThis,ChangeToThis,RemoveThis);
                    System.out.println("");
                    break;

                default:
                    System.out.println("Invalid command. Please give me a number between 0 and 3!");
                    break;
            }
        }

        System.out.println("Thank you for your attention!!!");

    }

}
