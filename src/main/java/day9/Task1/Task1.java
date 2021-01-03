package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student st = new Student("Макс", "spacestudents");
        Teacher teacher = new Teacher("Алекс", "Биология");

        System.out.println("Учебная группа: " + st.getGroupName());
        System.out.println("Название предмета: " + teacher.getSubjectName());

        st.printInfo();
        teacher.printInfo();
    }
}

class Human {
    String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Это человек с именем " + getName());
    }
}

class Student extends Human {
    String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + getName());
    }
}

class Teacher extends Human {
    String subjectName;

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + getName());
    }
}
