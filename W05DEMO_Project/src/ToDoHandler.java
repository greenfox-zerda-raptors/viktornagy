import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by viktor on 2016.11.16..
 */
public class ToDoHandler {

    public ToDoHandler(){
        this.toDoList=new ArrayList<ToDoItem>();
    }

    public void SaveTodos(String filename){
    	if(this.toDoList!=null){
    	
    		try{
    		    PrintWriter writer = new PrintWriter(filename, "UTF-8");
    		   for(ToDoItem todo:this.toDoList){
    			   writer.println(todo.GetCSV());
    		   }
    		   writer.close();
    		   
    		} catch (Exception e) {
    			System.out.println("ToDos not saved: "+e.getMessage());
    		}  	
    	}
    }
    
    public void LoadToDos(String filename){
    	
    	File file = new File(filename);
    	   try{           
               Scanner filereader = new Scanner(file);             
               while(filereader.hasNextLine()){
                   //read single line, put in string
                   String dataline = filereader.nextLine();
                  
                   String [] values=dataline.split(",");
                   if(values.length==2){
                	  try
                	  {
                		  boolean completed=Boolean.parseBoolean(values[0]);
                		  this.toDoList.add(new ToDoItem(values[1],completed));
                	  }
                	   catch(Exception e) {
                		   System.out.println("Convert Error:" + e.getMessage()); 
                	   }
                   }
               }
        
               filereader.close();


           }catch (FileNotFoundException e){
               
           }
    }
    
    
    public void PrintTodos(){

        if(this.toDoList.isEmpty()){
            System.out.println("No todos for today! :)");
        }
        else{
            int indexer=1;
            for (ToDoItem todo:this.toDoList) {
                System.out.println(String.format("%d - %s",indexer,todo.GetToDoState()));
                indexer++;
            }
        }

    }

    public void AddToDo(String toDoDescription)
    {
        if(toDoDescription.length()==0){
            System.out.println("Unable to add: No task is provided");
        }else {
            this.toDoList.add(new ToDoItem(toDoDescription));
        }
    }

    public void RemoveToDo(String indexstring){

        int index=0;
        boolean convertok=false;

        if(indexstring.length()==0){
            System.out.println(("Unable to remove: No index is provided"));
        }
        else {
            try{
                index=Integer.parseInt(indexstring.trim());
                index-=1;
                convertok=true;
            }
            catch(Exception e) {
                convertok=false;
            }

            if(convertok){
                if((index<0) | (index>this.toDoList.size()-1)) {
                    System.out.println("Unable to remove: Index is out of bound");
                }
                else{
                    this.toDoList.remove(index);
                }
            }
            else{
                System.out.println("Unable to remove: Index is not a number");
            }
        }
    }


    public void CompleteToDo(String indexstring){
        int index=0;
        boolean convertok=false;

        if(indexstring.length()==0){
            System.out.println(("Unable to check: No index is provided"));
        }
        else {
            try{
                index=Integer.parseInt(indexstring.trim());
                index-=1;
                convertok=true;
            }
            catch(Exception e) {
                convertok=false;
            }

            if(convertok){
                if((index<0) | (index>this.toDoList.size()-1)) {
                    System.out.println("Unable to check: Index is out of bound");
                }
                else{
                    this.toDoList.get(index).isCompleted=true;
                }
            }
            else{
                System.out.println("Unable to check: Index is not a number");
            }
        }
    }

    ArrayList<ToDoItem> toDoList;
    
   

}
