package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
    List<String> lis = new ArrayList<>();
    lis.add("БМВ");
    lis.add("ВАЗ");
    lis.add("АУДИ");
    lis.add("ПЕЖО");
    lis.add("РЕНО");

    lis.add(2,"ФОРД");
    lis.remove(0);

        System.out.println(lis);
        

    }
}
