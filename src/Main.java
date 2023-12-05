import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Mario", 20);
        List<Student> students = new ArrayList<>();
        students.add(student1);

        System.out.println(students);

        Student student2 = new Student("Maria", 30);
        Student student3 = new Student("Marco", 40);
        Student student4 = new Student("Simone", 50);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student1);

        System.out.println(students);
    }
}
