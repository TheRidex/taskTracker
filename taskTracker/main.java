import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("hey user, what would you like to do today?\n" +
                "Option 1: create a new entry\n" +
                "Option 2: select a previous entry\n" +
                "Option 3: exit the program");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("this is case 1");
                break;

            default:
                System.out.println("invalid input");
                break;
        }

    }
}