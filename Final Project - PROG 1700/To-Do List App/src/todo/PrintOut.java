package todo;

public class PrintOut {
    public void printTask(Task printableTask) {
        System.out.printf("%-20s %-20s %-20s %-20s\n", printableTask.getTitle(),
                printableTask.getDueDate(), printableTask.getStatus(), printableTask.getDesc());
    }
}