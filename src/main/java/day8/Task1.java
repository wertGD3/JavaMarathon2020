package day8;

public class Task1 {
    public static void main(String[] args) {
        String text = " ";

        long one = System.currentTimeMillis();

        for (int i = 0; i < 20001; i++)
            text += i + " ";

        long two = System.currentTimeMillis();

        System.out.println("Время выполнения String: " + (two - one));
        System.out.println(text);

        StringBuilder sb = new StringBuilder(" ");

        long three = System.currentTimeMillis();

        for (int i = 0; i < 20001; i++)
            sb.append(i).append(" ");

        long four = System.currentTimeMillis();

        System.out.println("Врямя выполнения StringBuilder: " + (four - three));
        System.out.println(sb.toString());
    }
}


