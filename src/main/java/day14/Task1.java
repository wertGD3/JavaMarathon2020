package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File f = new File("text.txt");
        try {
            Scanner sc = new Scanner(f);
            String string = sc.nextLine();
            String[] arr = string.split(" ");

            if (arr.length != 10)
                throw new IllegalArgumentException();
            int sum = 0;
            for (String array : arr)
                sum += Integer.parseInt(array);
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}