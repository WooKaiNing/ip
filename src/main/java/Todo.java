//package src.main.java;
public class Todo extends Task{
    public Todo (String description) {
        super(description);
    }

    @Override
    public String toString() {
        return "[T][" + getStatusIcon() + "]" + description;
    }
}
