import java.util.ArrayList;

public class TaskManager {

    ArrayList<String> tasks = new ArrayList<>();

    // addTask;
    public void addTask(String taskDetails) {
        tasks.add(taskDetails);
        System.out.println(tasks.get(0));
    }

    // viewTask;
    // DeleteTask;
    // completed;
}
