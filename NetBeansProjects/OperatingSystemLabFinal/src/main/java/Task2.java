/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author masum
 */
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int n = scanner.nextInt();

        int[] burstTime = new int[n];
        int[] priority = new int[n];
        int[] waitingTime = new int[n];
        int[] turnaroundTime = new int[n];

        System.out.println("Enter CPU times:");
        for (int i = 0; i < n; i++) {
            burstTime[i] = scanner.nextInt();
        }

        System.out.println("Enter priorities:");
        for (int i = 0; i < n; i++) {
            priority[i] = scanner.nextInt();
        }

        calculateWaitingTime(burstTime, priority, waitingTime);
        calculateTurnaroundTime(burstTime, turnaroundTime, waitingTime);

        System.out.println("Process\t   Waiting Time   \tTurnaround Time");
        double totalWaitingTime = 0, totalTurnaroundTime = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("P" + (i + 1) + "\t\t" + waitingTime[i] + "\t   \t" + turnaroundTime[i]);
            totalWaitingTime += waitingTime[i];
            totalTurnaroundTime += turnaroundTime[i];
        }

        System.out.println("\nAverage Waiting Time: " + (totalWaitingTime / n));
        System.out.println("Average Turnaround Time: " + (totalTurnaroundTime / n));
    }

    public static void calculateWaitingTime(int[] burstTime, int[] priority, int[] waitingTime) {
        int n = burstTime.length;
        int[] remainingTime = new int[n];
        System.arraycopy(burstTime, 0, remainingTime, 0, n);

        int currentTime = 0, completed = 0, minPriority;
        int processWithMinPriority = -1;
        boolean[] isCompleted = new boolean[n];

        while (completed != n) {
            minPriority = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (!isCompleted[i] && priority[i] < minPriority && remainingTime[i] > 0 && currentTime >= priority[i]) {
                    minPriority = priority[i];
                    processWithMinPriority = i;
                }
            }

            if (processWithMinPriority == -1) {
                currentTime++;
                continue;
            }

            remainingTime[processWithMinPriority]--;
            currentTime++;

            if (remainingTime[processWithMinPriority] == 0) {
                waitingTime[processWithMinPriority] = currentTime - burstTime[processWithMinPriority];
                isCompleted[processWithMinPriority] = true;
                completed++;
            }
        }
    }

    public static void calculateTurnaroundTime(int[] burstTime, int[] turnaroundTime, int[] waitingTime) {
        int n = burstTime.length;
        for (int i = 0; i < n; i++) {
            turnaroundTime[i] = burstTime[i] + waitingTime[i];
        }
    }
}