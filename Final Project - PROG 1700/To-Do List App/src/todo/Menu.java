package todo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    //global task-list made accessible from anywhere
    public static ArrayList<Task> taskArrayList = new ArrayList<>();

    public static void run() {
        Scanner scan = new Scanner(System.in);

        try {
            boolean flag = true;
            while (flag) {
                System.out.println("Main Menu \n" +
                        "1. Add a task \n" +
                        "2. Mark a task as done \n" +
                        "3. Remove a task \n" +
                        "4. Edit a task \n" +
                        "5. Display all tasks \n" +
                        "6. Exit");
                int menuChoice = scan.nextInt();
                scan.nextLine();
                System.out.println();//formatting

                switch (menuChoice){
                    case 1:
                        Functions.makeNewTask();
                        break;

                    case 2:
                        System.out.print("What task ID# would you like to mark as done? ");
                        int taskChoice = scan.nextInt();
                        scan.nextLine();//catch blank space
                        Functions.markDone(taskChoice-1);
                        break;

                    case 3:
                        System.out.println("What task ID# would you like to remove?");
                        taskChoice = scan.nextInt();
                        Functions.removeTask(taskChoice-1);
                        break;

                    case 4:
                        System.out.println("What task ID# would you like to edit?");
                        taskChoice = scan.nextInt();
                        Functions.editTask(taskChoice - 1);
                        break;

                    case 5:
                        Functions.displayAllTasks();
                        break;

                    case 6:
                        System.out.print("Are you sure you want to exit? Y/N: ");
                        String exitDecision = scan.next();
                        if(exitDecision.equalsIgnoreCase("Y")){
                            flag = false;
                            break;
                        }else{
                            System.out.println("__________________________________________" +
                                    "\n");
                            break;
                        }
                    default:
                        //Notify when the input is an integer that is not available
                        System.out.println("The number you provided is not listed in the menu.\n");
                }
            }
        } catch (InputMismatchException e){
            System.out.println("You must input a number to select an option.");//Stop the program if a non-integer value was given at Main Menu
        }
    }

    //Initialize here
    public static void main(String[] args) {
        Menu.run();
    }
}