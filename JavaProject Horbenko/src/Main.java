import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<Teacher> teachers = Teacher.readFromFile("Teacherfile.txt");
        ArrayList<Student> students = Student.readFromFile("Studentfile.txt");

        School school1 = new School("Lviv Secondary School", teachers, students);
        School school2 = new School("Stembridge School", teachers, students);

        System.out.println(school1.SchoolTeachers);
        System.out.println(school2.SchoolStudents);
        System.out.println(Math.MathTeachers);

    }

}








