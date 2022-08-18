
import java.util.HashMap;

public class Student {
        public Integer course = 0;
        public String name = "";




        public Integer getCourse() {
                return course;
        }


        public String getName() {
                return name;
        }
        public Student(int course,String name){

                this.course = course;
                this.name = name;
        }

        @Override
        public String toString() {
                return getName()+ " " + getCourse();
        }
        public static void printStudents(HashMap<Integer,String> students, Integer course) {
                System.out.println(students.get(course) + " " + course);

        }}

