import java.util.ArrayList;

public class TaskManager {

    ArrayList<Task> tasksArray = new ArrayList<>();

    // addTask;
    public void addTask(String description) {
        Task task = new Task(description);
        tasksArray.add(task);

    }

    public void displayTasks() {
        for (Task item : tasksArray) {
            System.out.println(item);
        }
    }

    public void taskDeletion(int deleteArrayIndex) {
        tasksArray.remove(deleteArrayIndex);
    }

    public Task findTask(String taskIdFinder) {
        // System.out.println(tasksArray.get(taskFinderIndex));
        for (Task task : tasksArray) {
            if (task.getId().equals(taskIdFinder)) {
                return task;
            }

        }
        return null;

    }

    public void taskCompleted(int taskFinderIndex) {
        Task task = tasksArray.get(taskFinderIndex);
        task.setComplete(true);
    }

    // viewTask;
    // DeleteTask;
    // completed;
}
