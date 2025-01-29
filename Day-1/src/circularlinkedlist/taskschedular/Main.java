package circularlinkedlist.taskschedular;

public class Main {
         public static void main(String[] args) {
            TaskScheduler ts = new TaskScheduler();

            ts.addAtEnd(1, "Task1", 3, "2025-01-30");
            ts.addAtBeginning(2, "Task2", 1, "2025-01-28");
            ts.addAtPosition(3, "Task3", 2, "2025-01-29", 1);

            System.out.println("All Tasks:");
            ts.displayAllTasks();

            System.out.println("\nViewing current tasks:");
            ts.viewCurrentTask();
            ts.viewCurrentTask();

            System.out.println("\nSearching for tasks with priority 2:");
            ts.searchByPriority(2);

            System.out.println("\nRemoving task with ID 2:");
            ts.removeByTaskId(2);
            ts.displayAllTasks();

            System.out.println("\nTotal Tasks: " + ts.getSize());
        }
    }


