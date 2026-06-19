import java.util.ArrayList;

public class TaskFileManager {

    // save tasks
    public void saveTasks(ArrayList<Task> tasks) {
        for (Task item : tasks) {

            System.out.println(item.getId() + "|" + item.getDescription() + "|" + item.getComplete());

        }
    }

}

// Load tasks