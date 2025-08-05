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
            String optionInput = scanner.nextLine();
            try {
                option = Integer.parseInt(optionInput);
            } catch (NumberFormatException e) {
                option = -1;
            }
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
                    String idInput = scanner.nextLine();
                    try {
                        int id = Integer.parseInt(idInput);
                        manager.markTaskCompleted(id);
                    } catch (NumberFormatException e) {
                        System.out.println("Por favor, digite um número válido. ");
                    }
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