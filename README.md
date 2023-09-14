# Simple-Task-Manager-Application
This code represents a simple task manager application implemented in Java. Here's a summary of its key components and functionality:
1. **Task Class**: It defines a `Task` class with attributes like `title`, `description`, and `completed` status. Tasks can be created with a title and description, and they are initialized as not completed by default.

2. **TaskManager Class**: This class manages a list of tasks using an `ArrayList`. It provides methods to add tasks, list all tasks, view task details, mark tasks as completed, and delete tasks.

3. **Main Application Class**: The `SimpleTaskManagerApp` class contains the main application logic. It displays a menu to the user, accepts their input, and performs the corresponding task management actions. The menu allows the user to:

   - Add a new task with a title and description.
   - List all tasks with their titles and completion status.
   - View details of a specific task, including its title, description, and completion status.
   - Mark a specific task as completed.
   - Delete a specific task.
   - Exit the application.

4. **User Input**: The code uses a `Scanner` to read user input and allows users to navigate through the menu options, input task details, and make choices.

5. **Loops**: The code employs loops to keep the application running until the user chooses to exit. It includes an inner loop for handling user choices within the main menu.

6. **Output**: The application provides informative output messages for each action, such as adding, listing, viewing, marking, or deleting tasks. It also handles invalid user inputs gracefully.

7. **Data Storage**: Task objects are stored in an `ArrayList` within the `TaskManager` class.

Overall, this code creates a basic console-based task manager application where users can manage a list of tasks by adding, viewing, completing, and deleting them. The application provides a simple command-line interface for task management.
