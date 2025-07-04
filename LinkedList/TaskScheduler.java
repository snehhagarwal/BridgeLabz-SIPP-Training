package LinkedList;

import java.util.Scanner;

class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

public class TaskScheduler {
    private Task head = null;
    private Task current = null;

    // Add at beginning
    public void addAtBeginning(Task newTask) {
        if (head == null) {
            head = newTask;
            newTask.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) temp = temp.next;

            newTask.next = head;
            head = newTask;
            temp.next = head;
        }
    }

    // Add at end
    public void addAtEnd(Task newTask) {
        if (head == null) {
            head = newTask;
            newTask.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) temp = temp.next;

            temp.next = newTask;
            newTask.next = head;
        }
    }

    // Add at specific position (1-based)
    public void addAtPosition(Task newTask, int position) {
        if (position <= 1 || head == null) {
            addAtBeginning(newTask);
            return;
        }

        Task temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        newTask.next = temp.next;
        temp.next = newTask;
    }

    // Delete by Task ID
    public void deleteById(int id) {
        if (head == null) {
            System.out.println("No tasks to delete.");
            return;
        }

        Task curr = head, prev = null;

        // Special case: only one node
        if (head.taskId == id && head.next == head) {
            head = null;
            current = null;
            System.out.println("Task deleted.");
            return;
        }

        // Head node
        if (head.taskId == id) {
            Task tail = head;
            while (tail.next != head) tail = tail.next;

            head = head.next;
            tail.next = head;
            System.out.println("Task deleted.");
            return;
        }

        // Middle or last node
        do {
            prev = curr;
            curr = curr.next;
            if (curr.taskId == id) {
                prev.next = curr.next;
                System.out.println("Task deleted.");
                return;
            }
        } while (curr != head);

        System.out.println("Task ID not found.");
    }

    // View current and move to next
    public void viewCurrentTask() {
        if (head == null) {
            System.out.println("No tasks in the scheduler.");
            return;
        }

        if (current == null) current = head;

        System.out.println("Current Task: ");
        displayTask(current);

        current = current.next; // move to next for next cycle
    }

    // Display all tasks
    public void displayAll() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("\n--- All Scheduled Tasks ---");
        Task temp = head;
        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks to search.");
            return;
        }

        boolean found = false;
        Task temp = head;

        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) System.out.println("No tasks found with priority: " + priority);
    }

    // Display a single task
    private void displayTask(Task t) {
        System.out.println("ID: " + t.taskId + " | Name: " + t.taskName + " | Priority: " + t.priority + " | Due: " + t.dueDate);
    }

    // Main menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskScheduler scheduler = new TaskScheduler();

        while (true) {
            System.out.println("\n--- Task Scheduler Menu ---");
            System.out.println("1. Add Task at Beginning");
            System.out.println("2. Add Task at End");
            System.out.println("3. Add Task at Position");
            System.out.println("4. Delete Task by ID");
            System.out.println("5. View Current Task & Move to Next");
            System.out.println("6. Display All Tasks");
            System.out.println("7. Search Tasks by Priority");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // flush

            switch (choice) {
                case 1, 2, 3 -> {
                    System.out.print("Enter Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Task Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Priority (1-5): ");
                    int priority = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Due Date: ");
                    String due = sc.nextLine();

                    Task t = new Task(id, name, priority, due);
                    if (choice == 1) scheduler.addAtBeginning(t);
                    else if (choice == 2) scheduler.addAtEnd(t);
                    else {
                        System.out.print("Enter Position: ");
                        int pos = sc.nextInt();
                        scheduler.addAtPosition(t, pos);
                    }
                }

                case 4 -> {
                    System.out.print("Enter Task ID to delete: ");
                    int id = sc.nextInt();
                    scheduler.deleteById(id);
                }

                case 5 -> scheduler.viewCurrentTask();

                case 6 -> scheduler.displayAll();

                case 7 -> {
                    System.out.print("Enter Priority to search: ");
                    int priority = sc.nextInt();
                    scheduler.searchByPriority(priority);
                }

                case 8 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid option.");
            }
        }
    }
}
