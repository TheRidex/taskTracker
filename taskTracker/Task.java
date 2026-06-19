public class Task {
    // In this section, the data stored will be saved
    private static int idCounter;
    private String id;
    private String description;
    private boolean complete;

    // Constructor
    public Task(String description) {
        // How could I connect the id to the Array id
        this.id = String.format("%02d", ++idCounter);
        this.complete = false;
        this.description = description;

    }
    // Getters

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean getComplete() {
        return complete;
    }

    // Setters

    public void setDescription(String description) {
        this.description = description;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    @Override
    public String toString() {
        return "Task [id = " + id + ", description = " + description + ", completed = " + complete + "]";
    }

}
