package day6;

import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        Teacher teach = new Teacher("Петр", "Химия");
        Student stud = new Student("Максим");
        stud.getName();
        teach.evaluate(stud);
    }
}

class Teacher {
    Random g = new Random();
    private String Имя;
    private String Предмет;

    public Teacher(String Имя, String Предмет) {
        this.Имя = Имя;
        this.Предмет = Предмет;
    }

    public String getИмя() {
        return Имя;
    }

    public String getПредмет() {
        return Предмет;
    }

    public void evaluate(Student a) {
        int k = g.nextInt(4) + 2;
        String x = " ";
        switch (k) {
            case 2:
                x = "неудовлетворительно";
                break;
            case 3:
                x = "удовлетворительно";
                break;
            case 4:
                x = "хорошо";
                break;
            case 5:
                x = "отлично";
                break;

        }
        System.out.println("Преподаватель " + Имя + " оценил студента с именем " + a.getName() + " по предмету " + Предмет + " на оценку " + x);
    }

}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
