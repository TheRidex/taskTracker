import java.util.ArrayList;

public class TaskManager {

    ArrayList<String> tasksArray = new ArrayList<>();

    // addTask;
    public void addTask(String description) {
        tasksArray.add(description);

        System.out.println(tasksArray.get(0));
    }

    // viewTask;
    // DeleteTask;
    // completed;
}
