import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class TaskFileManager {

    public ArrayList<Task> loadTasks() {
        ArrayList<Task> tasks = new ArrayList<>();
        String filePath = "C:\\Users\\apple\\OneDrive\\Desktop\\GitTesting\\Tasks.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");

                String id = parts[0];
                String description = parts[1];
                boolean complete = Boolean.parseBoolean(parts[2]);

                Task task = new Task(id, description, complete);

                tasks.add(task);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Something went wrong");
        }
        return tasks;

    }

    // save tasks
    public void saveTasks(ArrayList<Task> tasks) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Tasks.txt"));
            for (Task item : tasks) {
                writer.write(item.getId() + "|" +
                        item.getDescription() + "|" +
                        item.getComplete());
                writer.newLine();

            }
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

// Load tasks