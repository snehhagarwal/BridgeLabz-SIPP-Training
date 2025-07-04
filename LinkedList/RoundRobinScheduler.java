package LinkedList;

import java.util.Scanner;

class Process {
    int processId;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime = 0;
    int turnAroundTime = 0;
    Process next;

    public Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

public class RoundRobinScheduler {
    private Process head = null;
    private Process tail = null;

    // Add process at end
    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = tail = newProcess;
            tail.next = head;
        } else {
            tail.next = newProcess;
            newProcess.next = head;
            tail = newProcess;
        }
    }

    // Display current process list
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        Process temp = head;
        System.out.println("\n--- Current Process Queue ---");
        do {
            System.out.println("PID: " + temp.processId +
                    " | Burst: " + temp.burstTime +
                    " | Remaining: " + temp.remainingTime +
                    " | Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    // Simulate Round Robin Scheduling
    public void simulateScheduling(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int time = 0;
        int completed = 0;
        int totalWaiting = 0, totalTurnaround = 0;
        int n = countProcesses();

        Process current = head;
        Process prev = tail;

        System.out.println("\n--- Starting Round Robin Scheduling ---");

        while (completed < n) {
            if (current.remainingTime > 0) {
                int execTime = Math.min(timeQuantum, current.remainingTime);
                System.out.println("\n[Time: " + time + "] Executing Process " + current.processId + " for " + execTime + " units.");
                time += execTime;
                current.remainingTime -= execTime;

                displayProcesses();

                if (current.remainingTime == 0) {
                    current.turnAroundTime = time;
                    current.waitingTime = current.turnAroundTime - current.burstTime;
                    System.out.println("Process " + current.processId + " completed. TAT: " + current.turnAroundTime + ", WT: " + current.waitingTime);
                    totalTurnaround += current.turnAroundTime;
                    totalWaiting += current.waitingTime;
                    completed++;
                }
            }

            prev = current;
            current = current.next;
        }

        System.out.println("\n--- All processes completed ---");
        System.out.printf("Average Waiting Time: %.2f\n", (float) totalWaiting / n);
        System.out.printf("Average Turnaround Time: %.2f\n", (float) totalTurnaround / n);
    }

    // Count total processes
    private int countProcesses() {
        if (head == null) return 0;
        int count = 0;
        Process temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    // Main Menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        while (true) {
            System.out.println("\n--- Round Robin Scheduler Menu ---");
            System.out.println("1. Add Process");
            System.out.println("2. Display Process Queue");
            System.out.println("3. Simulate Scheduling");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Process ID: ");
                    int pid = sc.nextInt();
                    System.out.print("Enter Burst Time: ");
                    int bt = sc.nextInt();
                    System.out.print("Enter Priority: ");
                    int pr = sc.nextInt();
                    scheduler.addProcess(pid, bt, pr);
                }
                case 2 -> scheduler.displayProcesses();
                case 3 -> {
                    System.out.print("Enter Time Quantum: ");
                    int tq = sc.nextInt();
                    scheduler.simulateScheduling(tq);
                }
                case 4 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}

