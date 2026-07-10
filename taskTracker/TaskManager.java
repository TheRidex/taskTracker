import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> tasksArray = new ArrayList<>();

    // addTask;
    public void addTask(String description) {
        String trimmedDescription = description.trim();
        int descriptionLength = trimmedDescription.length();
        boolean emptyDescription = trimmedDescription.isEmpty();

        try {

            if (descriptionLength <= 200 && !emptyDescription) {
                for (Task item : tasksArray) {
                    String savedDescription = item.getDescription();
                    boolean checkNewDescription = trimmedDescription.equalsIgnoreCase(savedDescription);

                    if (checkNewDescription == true) {
                        throw new IllegalArgumentException(
                                "descriptions must not repeat themselves, be empty or be more than 200 characters");
                    }
                }

            }
            Task task = new Task(trimmedDescription);
            tasksArray.add(task);
            System.out.println("Task added!");

        } catch (IllegalArgumentException e) {
            System.out.println("Error : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("an unexpected error has occured :" + e.getMessage());
        }

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

    public void markCompleted(Task IdFinderResult) {
        IdFinderResult.setComplete(true);
    }

    public void markNotCompleted(Task IdFinderResult) {
        IdFinderResult.setComplete(false);
    }

    public void listOfAllTasks() {
        for (Task item : tasksArray) {
            System.out.println(item);
        }
    }

    public ArrayList<Task> getTasksArray() {
        return tasksArray;
    }

    public void addTaskObject(Task task) {
        tasksArray.add(task);
    }

    public void updateIdCounter() {
        int highestId = 0;
        for (Task item : tasksArray) {
            int tempId = Integer.parseInt(item.getId());
            if (tempId >= highestId) {
                highestId = tempId;
            }
        }
        Task.setIdCounter(highestId);
    }

    public void readFromFile(ArrayList<Task> loadedTasks) {
        for (Task t : loadedTasks) {
            addTaskObject(t);
        }
        // update Idcounter to reflect the last id used in the save file
        int highestId = 0;
        for (Task item : tasksArray) {
            int tempId = Integer.parseInt(item.getId());
            if (tempId >= highestId) {
                highestId = tempId;
            }
        }
        Task.setIdCounter(highestId);
    }

}

// viewTask;
// DeleteTask;
// completed;
