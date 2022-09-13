import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
public class Math extends Subject {
    public static  ArrayList<Teacher> MathTeachers = Mathfilter();
    public Math(String name){
        super("Math");
    }
    public static ArrayList Mathfilter(){
        ArrayList<Teacher> result = new ArrayList<>();
            for(Teacher obj:Teacher.teacherList){
                if (obj.subject.equals("Math")){
                    result.add(obj);
                }
        }
        return result;
    }
    public static void showTeachers(){
        JFrame f;
        f = new JFrame();
        f.setTitle("Math teachers");
        String col[] = {"Name","School","Subject"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        JTable table = new JTable(tableModel);
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
        table.setAutoCreateRowSorter(true);
        for(int i = 0; i < MathTeachers.size(); i++)
        {
            Object[] data = {MathTeachers.get(i).name, MathTeachers.get(i).school, MathTeachers.get(i).subject};
            tableModel.addRow(data);
        }
    }
    public static void showStudents() {
        JFrame f;
        f = new JFrame();
        f.setTitle("Math ");
        String col[] = {"Name","School","Math grades"};
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
            Object[] data = {Student.studentList.get(i).name, Student.studentList.get(i).school, Student.studentList.get(i).MathGrades};
            tableModel.addRow(data);
        }
    }
}
