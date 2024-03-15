package TaskManager;

import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner input = new Scanner(System.in);
        int option = 0;

        while(option != 6){
            System.out.println("1. Add a Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Check Task's Status");
            System.out.println("4. Marked as Complete or not");
            System.out.println("5. Delete a Task");

             option = input.nextInt();

            switch (option){
                case 1:
                    System.out.println("Enter Task Name: ");
                    String taskName = input.next();
                    System.out.println("Enter Task Description: ");
                    String description = input.next();
                    System.out.println("Enter Due Date: ");
                    String date = input.next();
                    taskManager.addTask(taskName, description, date);
                    break;
                case 2:
                    taskManager.getAllTask();
                    break;
                case 3:
                    System.out.println("Enter task name check is it complete or not: ");
                    String task = input.next();
                    taskManager.checkStatus(task);
                    break;
                case 4:
                    System.out.println("Enter task name as complete or not: ");
                    String name1 = input.next();
                    taskManager.taskStatus(name1);
                    break;
                case 5:
                    System.out.println("Enter a task name to delete: ");
                    String name2 = input.next();
                    taskManager.deleteTask(name2);
                    break;
                default:
                    break;

            }
        }
    }
}
