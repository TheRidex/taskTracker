import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();
        // User menu
        System.out.println("hey user, what would you like to do today?\n" +
                "Option 1: create a new entry\n" +
                "Option 2: display all tasks\n" +
                "Option 3: exit the program");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:

                System.out.println("describe te task:");

                String description = scanner.nextLine();
                taskManager.addTask(description);
                Task task = new Task(description);

                System.out.println(task.toString());
                break;
            case 2:
                System.out.println("");
                break;

            default:
                System.out.println("invalid input");
                break;
        }

    }
}