package pl.KrystianStepien;

public class Task {
    private String title;
    private boolean completed;

    public Task(String title) {
        this.title = title;
        this.completed = false;
    }

    public void markAsDone() {
        this.completed = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + title;
    }
}
