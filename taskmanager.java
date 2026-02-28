import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Task Manager ===");

        while (true) {
            System.out.println("\n1. Add Task  2. View Tasks  3. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt(); sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter task: ");
                tasks.add(sc.nextLine());
                System.out.println("Task added!");
            } else if (choice == 2) {
                if (tasks.isEmpty()) System.out.println("No tasks yet.");
                else tasks.forEach(t -> System.out.println("- " + t));
            } else {
                System.out.println("Goodbye!");
                break;
            }
        }
    }
}