package TaskManager;

public class Task {

    private  String name;
    private  String description;
    private  String dueDate;
    private  boolean isComplete;

    public Task(String description, String dueDate) {
        this.description = description;
        this.dueDate = dueDate;
    }

    public Task() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }


//    public static void display() {
//        System.out.println(
//            "Task Name= '" + name + '\'' +
//                    ", Description='" + description + '\'' +
//                    ", dueDate='" + dueDate + '\'' +
//                    ", isComplete=" + isComplete
//                    );
//    }
}
