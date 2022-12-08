package todo;

import java.util.InputMismatchException;
import java.util.Scanner;

import static todo.Menu.taskArrayList;

public class Functions {
    //Global scanner available to all methods
    static Scanner scan = new Scanner(System.in);
    //multipurpose global temporary task object
    static Task tempTask;

    //Option 1 from main menu
    public static void makeNewTask() {
        Task newTask = new Task();
        Scanner scan = new Scanner(System.in);

        System.out.print("Task Name: ");
        newTask.setTitle(scan.nextLine());

        System.out.print("Due date (dd-mm-yyyy): ");
        newTask.setDueDate(scan.nextLine());

        System.out.println(newTask.getTitle() + " starts with a " +
                "status of `Not done` \n" +
                "You can change this from the main menu.");

        System.out.print("Task description: ");
        newTask.setDesc(scan.nextLine());
        System.out.print("Do you wish to this task to the list? Y/N: ");
        String addDecision = scan.nextLine();

        if (addDecision.equalsIgnoreCase("Y")) {
            taskArrayList.add(newTask);
            System.out.println(newTask.getTitle() + " has been added to your task-list.");
            System.out.println();//formatting
        } else {
            System.out.println("This task will not be added to the list");
            System.out.println();//formatting
        }
    }

    //Option 2 from main menu
    public static void markDone(int taskChoice) {
        try {
            tempTask = taskArrayList.get(taskChoice);//fetching from arrayList
        } catch (Exception e) {
            System.out.println("You have selected a task # not listed. \n" +
                    "Only integers present in the task-list are accepted. \n");
            return;
        }
        tempTask.setStatus("Done");

        System.out.print("Do you want to remove this task? Y/N: ");
        String alsoRemoveChoice = scan.nextLine();
        //Polymorphic option to remove the current task
        if (alsoRemoveChoice.equalsIgnoreCase("Y")) {
            Functions.removeTask(taskChoice);
        }
    }

    //Option 3 from main menu
    public static void removeTask(int taskChoice) {
        try {
            tempTask = taskArrayList.get(taskChoice);//fetching from arrayList
        } catch (Exception e) {
            System.out.println("You have selected a task # not listed. \n" +
                    "Only integers present in the task-list are accepted. \n");
            return;
        }
        System.out.println(tempTask.getTitle() + " has been removed.");
        taskArrayList.remove(taskChoice);
        System.out.println();
    }

    //Option 4 from main menu
    public static void editTask(int taskChoice) {
        try {
            tempTask = taskArrayList.get(taskChoice);//fetching from arrayList
        } catch (Exception e) {
            System.out.println("You have selected a task # not listed. \n" +
                    "Only integers present in the task-list are accepted. \n");
            return;
        }
        //Display task details to give context to the user
        System.out.printf("%-20s %-20s %-20s %-20s\n", "Task", "Due Date", "Status", "Description");
        tempTask.printTask(tempTask);
        int menuChoice;
        try {
            System.out.println("\nWhat would you like to edit?: \n" +
                    "1. Name \n" +
                    "2. Due Date \n" +
                    "3. Status \n" +
                    "4. Description");
            menuChoice = scan.nextInt();
            scan.nextLine();//catch blank space

            if(menuChoice == 0 || menuChoice > 4){
                System.out.println("You have selected an option not listed. \n");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("You have input a value not recognized. \n");
            return;
        }
        switch (menuChoice) {
            case 1:
                System.out.print("Enter new name: ");
                tempTask.setTitle(scan.nextLine());
                break;
            case 2:
                System.out.print("Enter new due date: ");
                tempTask.setDueDate(scan.nextLine());
                break;
            case 3:
                Functions.markDone(taskChoice);
                break;
            case 4:
                System.out.print("Enter new description: ");
                tempTask.setDesc(scan.nextLine());
                break;

        }
    }

    //Option 5 from main menu
    public static void displayAllTasks() {
        if (taskArrayList.size() == 0) {
            System.out.println("There are no items in the to-do list. \n");
            return;
        }
        System.out.println("All tasks in your To-do list:");
        System.out.println("__________________________________________________________________________________________");
        System.out.print("        ");
        System.out.printf("%-20s %-20s %-20s %-20s\n", "Task", "Due Date", "Status", "Description");//Attribute Header Row
        for (int i = 0; i < taskArrayList.size(); i++) {
            tempTask = taskArrayList.get(i);//fetching from arrayList
            System.out.print("Task #" + (i + 1) + " ");
            tempTask.printTask(tempTask);
        }
        System.out.println("__________________________________________________________________________________________");
        System.out.println();
    }
}