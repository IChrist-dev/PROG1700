package todo;

public class Task extends PrintOut{
    private String title;
    private String dueDate;
    private String status;
    private String desc;

    //Default constructor
    public Task(){
        status = "Not done"; //A new task should always have this status initially
    }

    //getters
    public String getTitle() {return title;}
    public String getDueDate() {return dueDate;}
    public String getStatus() {return status;}
    public String getDesc() {return desc;}

    //setters
    public void setTitle(String title) {this.title = title;}
    public void setDueDate(String dueDate) {this.dueDate = dueDate;}
    public void setStatus(String status) {this.status = status;}
    public void setDesc(String desc) {this.desc = desc;}
}