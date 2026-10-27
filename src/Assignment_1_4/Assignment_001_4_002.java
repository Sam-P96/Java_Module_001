package Assignment_1_4;

import java.util.Scanner;
import java.util.Arrays;

public class Assignment_001_4_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] entryInt = new int[size];

        System.out.println("Enter the integers into the array: ");
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter integer %d: ", i + 1);
            entryInt[i] = scanner.nextInt();
        }

        int maxSum = entryInt[0];
        int bestStart = 0;
        int bestEnd = 0;

        for (int start = 0; start < size; start++) {
            int currentSum = 0;

            for (int end = start; end < size; end++) {
                currentSum += entryInt[end];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    bestStart = start;
                    bestEnd = end;


                }
            }
        }

        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Integers: " + ((int) bestStart +1) + " - " + ((int) bestEnd+1));
    }
}
