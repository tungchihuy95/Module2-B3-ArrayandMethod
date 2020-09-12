package deletenumber;

import java.lang.module.FindException;
import java.util.Scanner;

public class DeleteNumber {
    //    public static void main(String[] args) {
//        int[] numberArray = {3, 1, 8, 5, 9, 4, 15, 10};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int inputNumber = sc.nextInt();
//        int index = delete(numberArray, inputNumber);
//        for (int i = index; i < numberArray.length - 1; i++) {
//            numberArray[i] = numberArray[i + 1];
//        } numberArray[numberArray.length -1] = 0;
//        for (int i = 0; i < numberArray.length; i++) {
//            System.out.println(numberArray[i] + ", ");
//        }
//    }
//
//    public static int delete(int[] numArray, int number) {
//        int index = 0;
//        for (int i = 0; i < numArray.length; i++) {
//            if (number == numArray[i]) {
//                index = i;
//            }
//        }
//        return index;
//    }
//}
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5};
        int wantedDeleteNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number");
        wantedDeleteNumber = scanner.nextInt();

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (wantedDeleteNumber == array[i]) {
                index = i;
                for (i = index; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                }
                array[array.length - 1] = 0;
                for (i = 0; i < array.length; i++) {
                    System.out.print(array[i] + ", ");
                }

            } else {
                System.out.println("No number!");
                break;
            }
        }

    }
}

