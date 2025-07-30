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
        System.out.println("Tarefa adicionada");
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    public void markTaskCompleted(int id) {
        for (Task task : tasks) {;
        if (task.getId() ==id) {
            task.markCompleted();
            System.out.println("Tarefa marcada como concluída");
            return;
            }
        }
        System.out.println("Tarefa não encontrada!");

    }
}
