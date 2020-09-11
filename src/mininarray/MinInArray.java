package mininarray;

public class MinInArray {

    public static int minValue(int[] array) {
        int min = array[0];
        int ab = 0;  //cho bất kỳ số gì cũng được.
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i] ;
                ab = i;
            }
        }
        return ab;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 11, 9, 1, 0, 15};
        int index = minValue(arr); //phần tử nhỏ nhất của mảng arr được gán cho "index".
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
}
