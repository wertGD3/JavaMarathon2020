package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        while (true) {
            double a = c.nextDouble();
            double b = c.nextDouble();

            if (b == 0)
                break;
            System.out.println(a / b);
        }
    }
}
