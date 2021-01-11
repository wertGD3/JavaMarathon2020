package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());

    }
    public static List<Person> parseFileToObjList() {
        File files = new File("people.txt");
        List<Person> people = new ArrayList<>();
        try {
            Scanner sc = new Scanner(files);
            while (sc.hasNextLine()) {
                String strings = sc.nextLine();
                String[] arrays = strings.split(" ");

                if (Integer.parseInt(arrays[1]) < 0)
                    throw new IllegalArgumentException();
                Person person = new Person(arrays[0], Integer.parseInt(arrays[1]));
                people.add(person);
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

class Person {
    String name;
    int year;

    public Person(String name, int year) {
        this.name = name;
        this.year = year;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
         return year;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
