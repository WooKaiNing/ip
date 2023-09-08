//package src.main.java;
public class Deadline extends Task {
    protected String date;
    public Deadline (String description, String date) {
        super(description);
        this.date = date;
    }
    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "[D][" + getStatusIcon() + "]" + description + " (by:" + getDate()+ ")";
    }
}
