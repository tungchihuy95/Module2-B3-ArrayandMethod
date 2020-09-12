package bt_mininarray;

import java.util.Scanner;

public class MinInArray {


    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Enter numbers: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The smallest element is: " + min);
    }
}
