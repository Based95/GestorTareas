# Aplicación CLI tareas

Simple aplicación CLI (command-line interface) para gestionar tareas. Se puede añadir (nombre y descripción, ID generada automáticamente), ver la lista de tareas, marcar como realizadas y eliminar tareas. Idea de proyecto sacada de https://roadmap.sh/projects/task-tracker 

## Características

- **Añadir una tarea** Añadir una tarea con descripción, se crea una ID incremental para cada tarea
- **Lista de tareas** Lista de todas las taras creadas, estado de por hacer o hecho, nombre y descripción.
- **Cambiar estado a completada** Actualiza el estado de la tarea de en progreso a realizada
- **Borrar tareas** Borra la tarea por su ID.

## Instalación

1. **Clonar el repositorio**

   ```consola
   git clone https://github.com/Based95/TaskManager
   cd TaskManager

2. **Compilar el código**
    ```consola
   javac Main.java Task.java TaskManager.java
3. **Ejecutar la aplicación:**
    ```consola
   java Main.java
   ```