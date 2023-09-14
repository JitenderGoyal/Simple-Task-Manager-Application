// Import necessary libraries
import java.util.ArrayList; // Import ArrayList class
import java.util.Scanner; // Import Scanner class

// Class to represent a task
class Task {
    private String title;
    private String description;
    private boolean completed;

    // Constructor to create a new task
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false; // Initialize completed as false by default
    }

    // Getter method for task title
    public String getTitle() {
        return title;
    }

    // Getter method for task description
    public String getDescription() {
        return description;
    }

    // Getter method to check if task is completed
    public boolean isCompleted() {
        return completed;
    }

    // Method to mark task as completed
    public void markCompleted() {
        completed = true;
    }
}

// Class to manage tasks
class TaskManager {
    private ArrayList<Task> tasks; // ArrayList to store tasks

    // Constructor to initialize the task manager
    public TaskManager() {
        tasks = new ArrayList<>(); // Initialize an empty ArrayList for tasks
    }

    // Method to add a task to the task list
    public void addTask(Task task) {
        tasks.add(task); // Add task to the ArrayList
        System.out.println("Task added: " + task.getTitle()); // Print task added message
    }

    // Method to list all tasks
    public void listTasks() {
        System.out.println("Task List:");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println((i + 1) + ". " + task.getTitle() + " - " + (task.isCompleted() ? "Completed" : "Not Completed"));
            // Print task details with index, title, and completion status
        }
    }

    // Method to view details of a specific task
    public void viewTaskDetails(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            System.out.println("Title: " + task.getTitle());
            System.out.println("Description: " + task.getDescription());
            System.out.println("Status: " + (task.isCompleted() ? "Completed" : "Not Completed"));
            // Print task details including title, description, and completion status
        } else {
            System.out.println("Invalid task index."); // Print error message for invalid index
        }
    }

    // Method to mark a specific task as completed
    public void markTaskCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.markCompleted(); // Mark the task as completed
            System.out.println("Task marked as completed: " + task.getTitle()); // Print completion message
        } else {
            System.out.println("Invalid task index."); // Print error message for invalid index
        }
    }

    // Method to delete a specific task
    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.remove(index); // Remove task from the ArrayList
            System.out.println("Task deleted: " + task.getTitle()); // Print deletion message
        } else {
            System.out.println("Invalid task index."); // Print error message for invalid index
        }
    }
}

// Main application class
public class SimpleTaskManagerApp {
    // Method to display the main menu
    static void mainMenu() {
        System.out.println("======================= *** WELCOME TO SIMPLE TASK MANAGER *** =======================");
        System.out.println("\n============================== *** ENTER YOUR CHOICE *** =============================");
        System.out.println("1]. ADD TASK               2]. LIST TASKS     3]. VIEW TASK DETAILS");
        System.out.println("4]. MARK TASK COMPLETED    5]. DELETE TASK    6]. EXIT");
        System.out.println("======================================================================================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        TaskManager taskManager = new TaskManager(); // Create an instance of TaskManager
        int choice = 100;

        // Main application loop
        while (choice != 6) { // Continue looping until user chooses to exit
            mainMenu(); // Display the main menu
            choice = scanner.nextInt(); // Read the user's choice

            // Inner loop to handle user choices
            while (choice != 9 && choice != 0 && choice != 6) {
                switch (choice) {
                    case 1:
                        scanner.nextLine(); // Consume newline
                        System.out.print("\nEnter task title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter task description: ");
                        String description = scanner.nextLine();
                        Task task = new Task(title, description); // Create a new task
                        taskManager.addTask(task); // Add the task to the task manager
                        System.out.println("1. ADD TASK");
                        System.out.println("9. GO BACK TO MAIN MENU");
                        choice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        break;

                    case 2:
                        System.out.println("================================ *** TASK LIST *** ===============================");
                        taskManager.listTasks(); // List all tasks
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        choice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        break;

                    case 3:
                        System.out.print("\nEnter task index: ");
                        int viewIndex = scanner.nextInt();
                        taskManager.viewTaskDetails(viewIndex - 1); // View details of a specific task
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        choice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        break;

                    case 4:
                        System.out.print("\nEnter task index: ");
                        int completeIndex = scanner.nextInt();
                        taskManager.markTaskCompleted(completeIndex - 1); // Mark a specific task as completed
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        choice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        break;

                    case 5:
                        System.out.print("\nEnter task index: ");
                        int deleteIndex = scanner.nextInt();
                        taskManager.deleteTask(deleteIndex - 1); // Delete a specific task
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        choice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                        choice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        break;
                }
            }
        }

        System.out.println("Exiting..."); // Print exit message
        scanner.close(); // Close the Scanner
    }
}
