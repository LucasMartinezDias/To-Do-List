package todolist;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;
    private int nextId;

    public TaskManager() {
        tasks = new ArrayList<>();
        nextId = 1;
    }

    public void addTask(String description) {
        tasks.add(new Task(nextId++, description));
        System.out.printf("Tarefa adicionada");
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.printf("Nenhuma tarefa cadastrada");
        } else {
            for (Task task : tasks) {
                System.out.printf(task);
            }
        }
    }

    public void markTaskCompleted(int id) {
        for (Task task : tasks) {;
        if (task.getId() ==id) {
            tasks.markCompleted();
            System.out.printf("Tarefa marcada como concluída");
            return;
            }
        }
        System.out.println("Tarefa não encontrada!");

    }
}
