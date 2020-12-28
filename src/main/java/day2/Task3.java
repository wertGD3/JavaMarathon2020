package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        int a = g.nextInt();
        int b = g.nextInt();

        int i = a + 1;
        while (a < b) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.println(i + " ");
                i++;
            }
        }
    }
}
