/**
 * Created by viktor on 2016.11.16..
 */
public class ToDoItem {

    public ToDoItem(){
        this.taskDescription="";
        this.isCompleted=false;
    }

    public ToDoItem(String taskDescription){
        this.taskDescription=taskDescription;
        this.isCompleted=false;
    }

  public ToDoItem(String taskDescription,boolean isCompleted){
	  this.taskDescription=taskDescription;
	  this.isCompleted=isCompleted;
  }
    
    public void setCompleted(){
        this.isCompleted=true;
    }

    boolean isCompleted;

    public String GetToDoState(){
        return " - [" +(this.isCompleted?"X":" ") +"] "+this.taskDescription;
    }

    public String GetCSV(){
    return String.format("%b,%s",this.isCompleted,this.taskDescription);
    }
    
    String taskDescription;

}
