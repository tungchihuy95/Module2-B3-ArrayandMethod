package find_value_in_array;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FindValueInArray {

    public static void main(String[] args) {

        String[] name = {"Nam", "Hoa", "Duong", "Bach", "Quan", "Phuong"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String input = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(input)){
                System.out.println("Position of the student " + input + " is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found!");
        }
    }
}
