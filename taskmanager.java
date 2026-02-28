import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Task Manager - final ===");

        while (true) {
            System.out.println("\n1. Add Task  2. View Tasks  3. Exit 4. delete task");
            System.out.print("Choose: ");
            int choice = sc.nextInt(); sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter task: ");
                tasks.add(sc.nextLine());
                System.out.println("Task added!");
            } else if (choice == 4) {
				deleteTask(sc);
                if (tasks.isEmpty()) System.out.println("No tasks yet.");
                else tasks.forEach(t -> System.out.println("- " + t));
            } else {
                System.out.println("Goodbye!");
                break;
            }
        }
    }
	static void deleteTask(Scanner sc) {
    if (tasks.isEmpty()) { System.out.println("No tasks!"); return; }
    tasks.forEach(t -> System.out.println((tasks.indexOf(t)+1) + ". " + t));
    System.out.print("Enter task number to delete: ");
    int num = sc.nextInt(); sc.nextLine();
    if (num > 0 && num <= tasks.size()) {
        System.out.println("Deleted: " + tasks.remove(num - 1));
    } else {
        System.out.println("Invalid number.");
    }
}
}