package todolist;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        int option;

        do {
            System.out.println("\n--- To-Do-List ---");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Listar Tarefas");
            System.out.println("3 - Marcar como concluída");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.print("Descrição da tarefa: ");
                    String description = scanner.nextLine();
                    manager.addTask(description);
                    break;
                case 2:
                    manager.listTasks();
                    break;
                case 3:
                    System.out.print("ID da tarefa: ");
                    int id = scanner.nextInt();
                    manager.markTaskCompleted(id);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (option != 0);

        scanner.close();
    }
}