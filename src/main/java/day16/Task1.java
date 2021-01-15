package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File fio = new File("modul.txt");
        try {
            Scanner scanner = new Scanner(fio);
            String stroka = scanner.nextLine();

            String[] num = stroka.split(" ");

            int sum = 0;
            for (String number : num)
                sum += Integer.parseInt(number);
            double sumSrAr = sum / (double) num.length;
            System.out.printf(sumSrAr + " %.5f", sumSrAr);

        } catch (FileNotFoundException e) {
            System.out.println("Фаил не найден");
        }
    }
}

