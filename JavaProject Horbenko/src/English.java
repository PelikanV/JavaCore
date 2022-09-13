import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
public class English extends Subject {
    public static  ArrayList<Teacher> EnglishTeachers = Englishfilter();
    public English(String name){
        super("English");
    }
    public static ArrayList Englishfilter(){
        ArrayList<Teacher> result = new ArrayList<>();
        for(Teacher obj:Teacher.teacherList){
            if (obj.subject.equals("English")){
                result.add(obj);
            }
        }
        return result;
    }
    public static void showTeachers(){
        JFrame f;
        f = new JFrame();
        f.setTitle("English teachers");
        String col[] = {"Name","School","Subject"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        JTable table = new JTable(tableModel);
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
        table.setAutoCreateRowSorter(true);
        for(int i = 0; i < EnglishTeachers.size(); i++)
        {
            String name = EnglishTeachers.get(i).name;
            String school = EnglishTeachers.get(i).school;
            String subject = EnglishTeachers.get(i).subject;
            Object[] data = {name, school, subject};
            tableModel.addRow(data);
        }
    }
    public static void showStudents() {
        JFrame f;
        f = new JFrame();
        f.setTitle("English ");
        String col[] = {"Name","School","English grades"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        JTable table = new JTable(tableModel);
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
        table.setAutoCreateRowSorter(true);
        for(int i = 0; i < Student.studentList.size(); i++)
        {
            Object[] data = {Student.studentList.get(i).name, Student.studentList.get(i).school, Student.studentList.get(i).EnglishGrades};
            tableModel.addRow(data);
        }
    }

}
