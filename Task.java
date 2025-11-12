import java.util.ArrayList;

public class Task {

    private int id;
    private String taskName;
    private String taskDescription;
    private boolean isComplete;

    public Task(int id, String taskName, String taskDescription) {

        this.id = id;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.isComplete = false;
    } 
    public int getId() {
        return id;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription(){
        return taskDescription;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void markAsDone() {
        this.isComplete = true;
        System.out.println(this.taskName + "ha sido completada.");
    }
}
