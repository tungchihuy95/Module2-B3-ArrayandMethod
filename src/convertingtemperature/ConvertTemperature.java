package convertingtemperature;

import java.util.Scanner;

public class ConvertTemperature {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celcius;
        int choice;

        do {
            System.out.println("Converting Temperature: ");
            System.out.println("1. Fahrenheit to Celcius");
            System.out.println("2. Celcius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Fahrenheit:");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celcious: " + fahrenheitToCelcius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celcius:");
                    celcius = input.nextDouble();
                    System.out.println("Celcius to Fahrenheit: " + celciusToFahrenheit(celcius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0); //Khác 0 vì nếu khi chọn = 0 thì sẽ thoát luôn, còn nếu chọn 1 hay 2 (!=0)
                               //thì sẽ thực thi.

    }
    public static double celciusToFahrenheit(double celcius) {
        double fahrenheit = (9/5.0) * celcius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelcius(double fahrenheit) {
        double celcius = (5.0/9) * (fahrenheit - 32);
        return celcius;
    }
}
