package circularlinkedlist.roundrobinalgorithm;

public class Main {
        public static void main(String[] args) {
            RoundRobin rrScheduler = new RoundRobin();

            rrScheduler.addProcess(1, 10, 2);
            rrScheduler.addProcess(2, 5, 1);
            rrScheduler.addProcess(3, 8, 3);

            System.out.println("Initial Process List:");
            rrScheduler.displayProcesses();

            int timeQuantum = 3;

            System.out.println("\nSimulating Round Robin Scheduling:");
            rrScheduler.roundRobinScheduling(timeQuantum);
        }
    }


