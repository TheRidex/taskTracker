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

    public void taskDeletion(Task DeletionIdFinder) {
        tasksArray.remove(DeletionIdFinder);

    }

    public Task findTask(String taskIdFinder) {

        for (Task task : tasksArray) {
            if (task.getId().equals(taskIdFinder)) {
                return task;
            }
        }
        return null;
    }

    public void Completed(Task IdFinderResult) {
        IdFinderResult.setComplete(true);
    }

    public void notCompleted(Task IdFinderResult) {
        IdFinderResult.setComplete(false);
    }
}

// viewTask;
// DeleteTask;
// completed;
