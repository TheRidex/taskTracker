import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Boolean exitCondition = true;
        TaskManager taskManager = new TaskManager();
        // User menu

        while (exitCondition) {
            System.out.println("choose an option\n" +
                    "Option 1: create a new entry\n" +
                    "Option 2: display all tasks\n" +
                    "Option 3: exit the program\n" +
                    "Option 4: delete task\n" +
                    "Option 5: find task");
            Scanner scanner = new Scanner(System.in);
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
                    System.out.println("please enter the tasks id number");
                    int deleteArrayIndex = scanner.nextInt();
                    scanner.nextLine();
                    deleteArrayIndex--;

                    if (deleteArrayIndex < 0 || deleteArrayIndex >= taskManager.tasksArray.size()) {

                        System.out.println("that task does not exist");

                    } else {
                        taskManager.taskDeletion(deleteArrayIndex);
                        deleteArrayIndex++;

                        System.out.println("task " + deleteArrayIndex + " deleted");
                    }

                    break;
                case 5:// Find task
                    System.out.println("please enter the tasks id number");
                    int taskFinderIndex = scanner.nextInt();
                    scanner.nextLine();
                    taskFinderIndex--;
                    if (taskFinderIndex < 0 || taskFinderIndex > taskManager.tasksArray.size()) {

                        System.out.println("that task does not exist");

                    } else {
                        System.out.println("Here's your task");
                        taskManager.findTask(taskFinderIndex);
                        System.err.println("would you like to mark it as completed? (y/n)");
                        String completionCheck = scanner.nextLine();

                        if (completionCheck.equals("y") || completionCheck.equals("n")) {

                            if (completionCheck.equals("y")) {
                                taskManager.taskCompleted(taskFinderIndex);
                                System.out.println("task marked as completed!");
                            } else {
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