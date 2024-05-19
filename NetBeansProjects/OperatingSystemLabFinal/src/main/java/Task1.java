/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author masum
 */
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int n = scanner.nextInt();

        int[] cpuTimes = new int[n];
        System.out.println("Enter the CPU times:");
        for (int i = 0; i < n; i++) {
            cpuTimes[i] = scanner.nextInt();
        }

        System.out.print("Enter the time quantum: ");
        int quantum = scanner.nextInt();

        int[] waitingTimes = new int[n];
        int[] turnaroundTimes = new int[n];

        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;

        int[] remainingTime = new int[n];
        for (int i = 0; i < n; i++) {
            remainingTime[i] = cpuTimes[i];
        }

        int currentTime = 0;
        boolean[] isCompleted = new boolean[n];
        while (true) {
            boolean allProcessesCompleted = true;
            for (int i = 0; i < n; i++) {
                if (!isCompleted[i]) {
                    allProcessesCompleted = false;
                    if (remainingTime[i] > 0) {
                        if (remainingTime[i] > quantum) {
                            currentTime += quantum;
                            remainingTime[i] -= quantum;
                        } else {
                            currentTime += remainingTime[i];
                            waitingTimes[i] = currentTime - cpuTimes[i];
                            remainingTime[i] = 0;
                            isCompleted[i] = true;
                            turnaroundTimes[i] = currentTime;
                        }
                    }
                }
            }
            if (allProcessesCompleted) {
                break;
            }
        }

        System.out.println("\nProcess   Turnaround Time    Waiting Time");
        for (int i = 0; i < n; i++) {
            System.out.println("P" + (i + 1) + "\t\t" + turnaroundTimes[i] + "\t\t" + waitingTimes[i]);
            totalWaitingTime += waitingTimes[i];
            totalTurnaroundTime += turnaroundTimes[i];
        }

        double avgWaitingTime = (double) totalWaitingTime / n;
        double avgTurnaroundTime = (double) totalTurnaroundTime / n;

        System.out.println("\nAverage Waiting time: " + avgWaitingTime);
        System.out.println("Average Turnaround time: " + avgTurnaroundTime);

        scanner.close();
    }
}