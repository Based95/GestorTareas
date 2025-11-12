import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        TaskManager taskManager = new TaskManager();

        Scanner sc = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("\n--- GESTOR DE TAREAS ---");
            System.out.println("1. Añadir nueva tarea");
            System.out.println("2. Ver todas las tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
    
            int id = 0;

            int choice = sc.nextInt(); 
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.println("Introduce el nombre de la tarea: ");
                    String name = sc.nextLine();
                    System.out.println("Introduce la descripción de la tarea: ");
                    String description = sc.nextLine();
                    taskManager.addTask(name, description);
                    break;
                case 2:
                    taskManager.viewAllTasks();
                    break;
                case 3: {
                    System.out.print("Introduce el ID de la tarea a completar: ");
                    id = sc.nextInt();
                    taskManager.updateTaskStatus(id);
                    break; }
                case 4: {
                    System.out.print("Introduce el ID de la tarea a eliminar: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    taskManager.deleteTask(id);
                    break; }
                case 5:
                    System.out.println("Saliendo de la aplicación!");
                    running = false;
                    break;
            
                default:
                    break;
            }

        }

        sc.close();

    }
}
