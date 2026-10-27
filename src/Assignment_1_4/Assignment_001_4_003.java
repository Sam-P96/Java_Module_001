package Assignment_1_4;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;
import java.util.Arrays;

public class Assignment_001_4_003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] entryInt = new int[size];
        int[] noDupeArray = new int[size];
        int counter = 0;

        System.out.println("Enter the integers into the array: ");
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter integer %d: ", i + 1);
            entryInt[i] = scanner.nextInt();
        }

        for (int entry1 : entryInt) {
            boolean notInList = false;
//            System.out.println("A");
            for (int entry2 : noDupeArray) {
                if (entry1 != entry2) {
                    notInList = true;
//                    System.out.println(entry1 + "B");
                } else {
                    notInList = false;
//                    System.out.println(entry1 + "C");
                    break;
                }
            }
            if (notInList) {
                noDupeArray[counter] = entry1;
                counter += 1;
                System.out.println(entry1 + " is attatched to position " + (int)(counter -1));
            } else {
                System.out.println(entry1 + " is in noDupe");
            }
        }
        int[] noDupeSubArray = Arrays.copyOfRange(noDupeArray, 0, counter);
        System.out.println("No duplicate array: ");
        System.out.print(Arrays.toString(noDupeSubArray));
    }
}
