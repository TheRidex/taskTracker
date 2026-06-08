public class Task {
    // In this section, the data stored will be saved
    private static int idCounter;
    private String id;
    private String description;
    private Boolean complete = false;

    // Constructor
    public Task(String description) {
        // How could I connect the id to the Array id
        this.id = String.format("%02d", ++idCounter);
        this.description = description;

    }
    // Getters

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getComplete() {
        return complete;
    }

    // Setters

    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    @Override
    public String toString() {
        return "Task [id=" + id + ", description=" + description + ", complete=" + complete + "]";
    }

}
