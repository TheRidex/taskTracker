import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();
        // User menu
        System.out.println("hey user, what would you like to do today?\n" +
                "Option 1: create a new entry\n" +
                "Option 2: select a previous entry\n" +
                "Option 3: exit the program");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:
                String taskDetails = scanner.nextLine();
                taskManager.addTask(taskDetails);
                break;
            case 2:

                break;

            default:
                System.out.println("invalid input");
                break;
        }

    }
}