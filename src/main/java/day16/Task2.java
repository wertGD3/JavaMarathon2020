package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Random random = new Random();

        File file1 = new File("file1.txt");
        PrintWriter pw3 = new PrintWriter(file1);
        for (int i = 0; i < 1000; i++) {
            pw3.println(random.nextInt(100));
        }
        pw3.close();
        Scanner sc5 = new Scanner(file1);
        File file2 = new File("file2.txt");
        PrintWriter pw4 = new PrintWriter(file2);

        int count = 0;
        int sum = 0;
        while (sc5.hasNextLine()) {
            sum += Integer.parseInt(sc5.nextLine());
            count++;
            if (count == 20) {
                pw4.println(sum / 20.0);
            }
            count = 0;
            sum = 0;
        }
        pw4.close();
        Scanner sc6 = new Scanner(file2);
        double result = 0;
        while (sc6.hasNextLine()) {
            result += Double.parseDouble(sc6.nextLine());
            System.out.println((int) result);
        }
    }
}
