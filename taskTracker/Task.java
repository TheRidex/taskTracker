public class Task {
    // In this section, the data stored will be saved
    private static int idCounter;
    private String id;
    private String description;
    private boolean complete;

    // Constructors

    public Task(String id, String description, boolean complete) {
        this.id = id;
        this.description = description;
        this.complete = complete;
    }

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

    public void setId(String id) {
        this.id = id;
    }

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
