import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Boolean exitCondition = true;
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        // User menu

        while (exitCondition) {
            System.out.println("choose an option\n" +
                    "Option 1: create a new entry\n" +
                    "Option 2: display all tasks\n" +
                    "Option 3: exit the program\n" +
                    "Option 4: delete task\n" +
                    "Option 5: find task");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:// Creates a new task

                    System.out.println("describe te task:");

                    String description = scanner.nextLine();
                    taskManager.addTask(description);

                    System.out.println("Task added!");

                    break;
                case 2:// Displays all tasks
                    System.out.println("here are your tasks");
                    taskManager.displayTasks();
                    break;
                case 3:// Exits the program
                    System.out.println("Goodbye!");
                    exitCondition = false;
                    break;
                case 4:// Deletes a task

                    // Input the task number
                    System.out.println("please enter the tasks id number");
                    String taskToBeDeleted = scanner.nextLine();
                    scanner.nextLine();

                    if (taskManager.findTask(taskToBeDeleted) == null) {

                        System.out.println("that task does not exist");

                    } else {
                        taskManager.taskDeletion(taskToBeDeleted);

                        System.out.println("task " + taskToBeDeleted + " deleted");
                    }

                    break;
                case 5:// Find task
                    System.out.println("please enter the tasks id number");
                    String taskIdFinder = scanner.nextLine();
                    Task taskIdFinderResult = taskManager.findTask(taskIdFinder);
                    if (taskIdFinderResult == null) {

                        System.out.println("that task does not exist");

                    } else {
                        System.out.println("Here's your task");
                        System.out.println(taskIdFinderResult);
                        System.err.println("is the task completed? (y/n)");
                        String completionCheck = scanner.nextLine();

                        if (completionCheck.equals("y") || completionCheck.equals("n")) {

                            if (completionCheck.equals("y")) {
                                taskIdFinderResult.setComplete(true);
                                System.out.println("task marked as completed!");
                                System.out.println(taskIdFinderResult);
                            } else {
                                taskIdFinderResult.setComplete(false);
                                System.out.println("lets keep going then");
                            }
                        } else {
                            System.out.println("That is not a valid input");
                        }
                    }
                    break;
                default:
                    System.out.println("invalid input");

                    break;
            }
        }

    }
}