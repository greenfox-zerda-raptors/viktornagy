import java.util.Scanner;

/**
 * Created by viktor on 2016.11.16..
 */
public class ToDoManager {

    public ToDoManager(){
        this.ListOfToDos=new ToDoHandler();
    }

    public void StartToDoManager(){
        this.run=true;
        this.ListOfToDos.LoadToDos(dataFileName);
        this.PrintInfo();
        while(run){
            this.ReadInstruction();
        }
        this.ListOfToDos.SaveTodos(dataFileName);
    }

    public void PrintInfo(){
        System.out.println();
        System.out.println("CLI Todo application");
        System.out.println("====================");
        System.out.println();
        System.out.println("Available commands:");
        System.out.println("list, l       Lists all the tasks");
        System.out.println("add, a        Adds a new task");
        System.out.println("remove, r     Removes an task");
        System.out.println("complete, c   Completes an task");
        System.out.println("help, h       Print out this list again");
        System.out.println("exit          Exit");
        System.out.println();
    }


    public void ReadInstruction() {
        Scanner scaninput=new Scanner(System.in);
        String readcommand= scaninput.nextLine();

        String [] instruction=readcommand.split(" ");
        String commandpayload="";

        if(instruction!=null){
            switch(instruction[0]){
            	case add_short_command:
                case add_command:
                    commandpayload="";
                    for(int i=1;i<instruction.length;i++) {
                        commandpayload+=(instruction[i]+" ");
                    }
                    this.ListOfToDos.AddToDo(commandpayload);
                    break;
                case list_short_command:
                case list_command:
                    this.ListOfToDos.PrintTodos();
                    break;
                case remove_short_command:
                case remove_command:
                    commandpayload="";
                    for(int i=1;i<instruction.length;i++) {
                        commandpayload+=(instruction[i]+" ");
                    }
                    this.ListOfToDos.RemoveToDo(commandpayload);
                    break;
                    
                case complete_short_command:

                case complete_command:
                    commandpayload="";
                    for(int i=1;i<instruction.length;i++) {
                        commandpayload+=(instruction[i]+" ");
                    }
                    this.ListOfToDos.CompleteToDo(commandpayload);
                    break;
                case help_short_command:
                case help_command:
                    this.PrintInfo();
                    break;
                case exit_command:
                    this.run=false;
                    break;
                default:
                    System.out.println("Unknown command!");
            }
        }
    }

    boolean run;

    ToDoHandler ListOfToDos;

    static final String add_command="add";
    static final String add_short_command="a";
    
    static final String list_command="list";
    static final String list_short_command="l";
    
    static final String remove_command="remove";
    static final String remove_short_command="r";
    
    static final String complete_command="complete";
    static final String complete_short_command="c";
    
    static final String help_command="help";
    static final String help_short_command="h";
    
    static final String exit_command="exit";
    
    static final String dataFileName="ToDoSave.csv";

}
