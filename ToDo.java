import java.util.ArrayList;
import java.util.*;

public class ToDo{
    public static void main(String[] args) {
        ArrayList<task> todo = new ArrayList<>();
        int green=1;
        Scanner input = new Scanner(System.in);
        while(green==1){
            task newtodo = new task();
            System.out.println();
            //adding a task
            System.out.println("What's the Task ?");
            newtodo.title = input.nextLine();
            System.out.println();

            //adding a description
            System.out.println("Give a brief Description of the Task ");
            newtodo.Description = input.nextLine();
            System.out.println();

            //adding the due date
            System.out.println("whats the Due Date of The Task, for example 12th of December,2023 ");
            newtodo.Date = input.nextLine();
            System.out.println();

            //priority level
            System.out.println("whats the priority level of this task, low, medium, high ?");
            newtodo.priority = input.nextLine();
            System.out.println();

            //adding to the arraylist
            todo.add(newtodo);

            // getting task info 
            newtodo.gettaskinfo(newtodo);

            //asking for new input;
            System.out.println("if you want to add a new task pls enter 1, or else enter 0 to quit the edit mode");
            green = input.nextInt();
            input.nextLine();

        }

        System.out.println("If you would like to mark a task done Enter 1; if you would like to know the priority status of a task pls enter 2; if you would like to know both Enter 3; ");
        int mark = input.nextInt();
        input.nextLine();
        if( mark == 1){
            System.out.println("Enter the task title to marked as done");
            String task = input.nextLine();
            marktaskdone(task, todo);
        }
        else if( mark == 2){
            System.out.println("Enter the task title to get priority for");
            String task = input.nextLine();
            gettaskpriority(task, todo);
        }

        else if(mark == 3){
            System.out.println("Enter the task title to marked as done");
            String task = input.nextLine();
            marktaskdone(task, todo);
            System.out.println("Enter the task title to get priority for");
            String task1 = input.nextLine();
            gettaskpriority(task1, todo);
        }
        else{
            System.out.println("Invalid input");
        }


    }

    public static void marktaskdone(String task, List<task> todo){
        for( int i = 0 ; i < todo.size() ; i++){
            if(todo.get(i).title.equals(task)){
                todo.get(i).complete=true;
                System.out.println("the task" + task + " is marked as done");
            }
        }
    }


    public static void gettaskpriority(String task, List<task> todo){
        for( int i = 0 ; i < todo.size() ; i++){
            if(todo.get(i).title.equals(task)){
                System.out.println("the tasks priority is :" + todo.get(i).priority);
            }
        }
    }



    
}