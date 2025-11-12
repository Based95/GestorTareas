import java.util.ArrayList;

public class TaskManager {

        private ArrayList<Task> tasks;

        private int nextId;

        public TaskManager() {
            this.tasks = new ArrayList<>();
            this.nextId = 1;
        }

        public void addTask(String name, String description) {

            Task newTask = new Task(this.nextId, name, description);
            this.tasks.add(newTask);
            this.nextId++;

            System.out.println("Tarea agregada con ID: " + newTask.getId() + "-" + name);

        }

        public void viewAllTasks() {
            System.out.println("---Lista de tareas---");
            for (Task task : tasks) {

                String estado = (task.isComplete() ? "[X]" : "[ ]");
                System.out.println(estado + " (ID " + task.getId() + ") " + task.getTaskName() + "|" +task.getTaskDescription());

            }
        }

        public boolean deleteTask(int id) {
            Task taskToDelete = null;

            for (Task task : tasks) {
                if (task.getId() == id) {
                    taskToDelete = task;
                    break;
                }
            }

            if (taskToDelete != null) {
                this.tasks.remove(taskToDelete);
                System.out.println("Tarea con ID" +id +"ha sido eliminada.");
                return true;
            } else {
                System.out.println("Error, no se encontró la tarea con ID" +id);
                return false;
            }
        }

        public boolean updateTaskStatus(int id) {
            for (Task task : tasks) {
                if (task.getId() == id) {
                    task.markAsDone();
                    return true;
                }
            }
            System.out.println("Error, no se encontró la tareas con ID" +id +" para actualizar.");
            return false;
        }
    }