public class Task {
    // In this section, the data stored will be saved
    private String id;
    private String description;
    private String complete;

    // Constructor
    public Task(String id, String description, String complete) {
        this.id = id;
        this.description = description;
        this.complete = complete;
    }
    // Getters

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getComplete() {
        return complete;
    }

    // Setters

    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setComplete(String complete) {
        this.complete = complete;
    }

}
