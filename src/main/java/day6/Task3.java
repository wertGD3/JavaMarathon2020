package day6;

import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        Teacher teach = new Teacher("Петр","Химия");
        Student stud = new Student("Максим");
        teach.getИмя();
        stud.getИмя();
        teach.evaluate(stud);
    }
}
class Teacher{
    Random g = new Random();
    private String Имя;
    private String Предмет;

    public Teacher(String Имя,String Предмет){
        this.Имя = Имя;
        this.Предмет=Предмет;
    }

    public String getИмя() {
        return Имя;
    }
    public String getПредмет() {
        return Предмет;
    }

    public void evaluate(Student a){
           int k = g.nextInt(5);
           switch (k){
               case 2:
                   System.out.println("неудовлетворительно");
                   break;
               case 3:
                   System.out.println("удовлетворительно");
                   break;
               case 4:
                   System.out.println("хорошо");
                   break;
               case 5:
                   System.out.println("отлично");
                   break;
               default:
                   System.out.println("ошибка");
           }
        System.out.println("Преподаватель "+ getИмя() +  " оценил студента с именем "+getИмя()+" по предмету "+getПредмет()+" оценка "+k);
       }

    }
class Student{
    private String Имя ;
    public Student(String Имя){
        this.Имя = Имя;
    }

    public void setИмя(String имяя) {
        this.Имя = имяя;
    }
    public String getИмя() {
        return Имя;
    }
}
