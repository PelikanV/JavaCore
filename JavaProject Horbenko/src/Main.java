import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Teacher> teachers = Teacher.readFromFile("Teacherfile.txt");
        ArrayList<Student> students = Student.readFromFile("Studentfile.txt");
        School school1 = new School("Lviv Secondary School", teachers, students);
        School school2 = new School("Stembridge School", teachers, students);
        School school3 = new School("World School Lviv", teachers, students);
        ArrayList<School> schools = new ArrayList<>();
        schools.add(school1);
        schools.add(school2);
        schools.add(school3);
        Integer inp;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter number 1-5 :\n");
        System.out.print("1: Schools rating\n");
        System.out.print("2: Teachers sorted by schools\n");
        System.out.print("3: Students sorted by schools\n");
        System.out.print("4: Teachers sorted by subjects\n");
        System.out.print("5: Students sorted by subjects\n");
        inp = console.nextInt();
            switch (inp) {
                case 1:
                    showSchoolRating(schools);
                    break;

                case 2:
                    for (int i=0;i<=schools.size()-1;i++)
                {
                    schools.get(i).TableforTeachers();
                }
                    break;
                case 3:
                    for (int i=0;i<=schools.size()-1;i++)
                    {
                        schools.get(i).TableforStudents();

                    }
                    break;
                case 4:
                    Math.showTeachers();
                    Physics.showTeachers();
                    English.showTeachers();
                    break;
                case 5:
                    Math.showStudents();
                    English.showStudents();
                    Physics.showStudents();
                    break;
            }
    }
    public static void showSchoolRating(ArrayList<School> schools){
        Comparator<School> byRating = Comparator.comparing(School::getRating);
        Collections.sort(schools, byRating);
            JFrame f;
            JTable j;
            f = new JFrame();
            f.setTitle("School rating");
            String col[] = {"Name","Rating","Number of students"};
            DefaultTableModel tableModel = new DefaultTableModel(col, 0);
            JTable table = new JTable(tableModel);
            table.setBounds(30, 40, 200, 300);
            JScrollPane sp = new JScrollPane(table);
            f.add(sp);
            f.setSize(500, 200);
            f.setVisible(true);
            table.setAutoCreateRowSorter(true);
            for(int i = 0; i < schools.size(); i++)
            {
                Object[] data = {schools.get(i).name,String.format("%.2f",schools.get(i).rating),  String.valueOf(schools.get(i).SchoolStudents.size())};
                tableModel.addRow(data);
            }
        }
    }