public class task {    //extra features to be implemented- reminders; undo
    String title = "";
    String Description = "";
    String Date ="";
    boolean complete = false;
    String priority = "low";

    public void gettitle(){
        title=this.title;
    }
    public void getdescription(){
        Description=this.Description;
    }
    public void getdate(){
        Date= this.Date;
    }
    public void ifcomplete(task a){
        if(a.complete==true){
            System.out.println("the task"+ a.title +" is como=pleted");
        }
    }
    public void markdone(task a){
        a.complete=true;
    }

    public void gettaskinfo(task a){
        System.out.println(a.title);
        System.out.println(a.Description);
        System.out.println(a.Date);
        System.out.println(a.priority);

    }
    public static void main(String[] args) {
        
    }
    
}
