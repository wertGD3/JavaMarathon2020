package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("src/main/resources/shoes.csv");
        Scanner scan = new Scanner(file1);

        File fileWrite = new File("src/main/resources/missing_shoes.txt");
        PrintWriter pw = new PrintWriter(fileWrite);
        while (scan.hasNextLine()) {
            String[] massiv = scan.nextLine().split(";");
            if (Integer.parseInt(massiv[2]) == 0) {
                pw.println(massiv[0] + " " + massiv[1] + " " + massiv[2]);
            }
        }
        pw.close();
        scan.close();
    }
}

