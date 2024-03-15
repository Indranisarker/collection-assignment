package TaskManager;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TaskManager {
    Map<String, Task> taskMap = new HashMap<>();

    //add a task
    public void addTask(String taskName, String des, String date){
        Task newTask = new Task(des, date);
        taskMap.put(taskName, newTask);
        System.out.println("New Task Added Successfully!");
        //Task.display();
    }

    //View all the task
    public void getAllTask(){
        for(Map.Entry<String, Task> map : taskMap.entrySet()){
            Task task = map.getValue();
            System.out.println("Task Name: " + map.getKey());
            System.out.println("Task Description: " + task.getDescription());
            System.out.println("Task Date: " + task.getDueDate());
            System.out.println("Task Status: " + task.isComplete());
        }
    }

    //Check task status
    public void checkStatus(String taskName){
       Task task = taskMap.get(taskName);
        if(task.isComplete() == false){
            task.setComplete(true);
            System.out.println("The Task is recently completed");
        }
        else{
            System.out.println("The Task has already been Completed");
        }
    }

    // Marked as Completed
    public void taskStatus(String taskName){
        if(taskMap.get(taskName).isComplete() == true){
            System.out.println(taskName + " is completed!!!");
        }
        else{
            System.out.println(taskName + " is not completed!!!");
        }

    }
    //remove task
    public void deleteTask(String taskName){
        if(taskMap.containsKey(taskName)){
            taskMap.remove(taskName);
            System.out.println(taskName + " is removed...");
        }
        else{
            System.out.println(taskName + " is not present in the map");
        }

    }
}
