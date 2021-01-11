package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList());
    }

    public static List<String> parseFileToStringList() {
        File files = new File("people.txt");
        List<String> people = new ArrayList<>();
        try {
            Scanner sc = new Scanner(files);
            while (sc.hasNextLine()) {
                String strings = sc.nextLine();
                String[] arrays = strings.split(" ");

                if (Integer.parseInt(arrays[1]) < 0)
                    throw new IllegalArgumentException();
                people.add(strings);
            }
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Фаил не найден");

        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");

        }
        return null;
    }
}
