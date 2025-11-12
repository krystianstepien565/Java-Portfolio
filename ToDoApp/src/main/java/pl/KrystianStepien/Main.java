package pl.KrystianStepien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to my ToDoApp!");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add task");
            System.out.println("2. Mark task as done");
            System.out.println("3. Show tasks");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    list.addTask(title);
                    System.out.println("Task added!");
                }
                case 2 -> {
                    System.out.print("Enter task number to mark as done: ");
                    int index = scanner.nextInt() - 1;
                    list.markTaskAsDone(index);
                    System.out.println("Task marked as done!");
                }
                case 3 -> list.showTasks();
                case 4 -> {
                    running = false;
                    System.out.println("Goodbye!");
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
