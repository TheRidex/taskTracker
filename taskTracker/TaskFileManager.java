import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TaskFileManager {

    // save tasks
    public void saveTasks(ArrayList<Task> tasks) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt"));
            for (Task item : tasks) {
                writer.write(item.getId() + "|" +
                        item.getDescription() + "|" +
                        item.getComplete() + "\n");

            }
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

// Load tasks