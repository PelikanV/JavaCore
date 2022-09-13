import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
public class    Physics extends Subject {
    public static  ArrayList<Teacher> PhysicsTeachers = Physicsfilter();

        public Physics(String name){
            super("Physics");
        }
    public static ArrayList Physicsfilter(){
        ArrayList<Teacher> result = new ArrayList<>();
        for(Teacher obj:Teacher.teacherList){
            if (obj.subject.equals("Physic")){
                result.add(obj);
            }
        }
        return result;
    }
    public static void showTeachers(){
        JFrame f;
        f = new JFrame();
        f.setTitle("Physic teachers");
        String col[] = {"Name","School","Subject"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        JTable table = new JTable(tableModel);
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
        table.setAutoCreateRowSorter(true);
        for(int i = 0; i < PhysicsTeachers.size(); i++)
        {
            String name = PhysicsTeachers.get(i).name;
            String school = PhysicsTeachers.get(i).school;
            String subject = PhysicsTeachers.get(i).subject;
            Object[] data = {name, school, subject};
            tableModel.addRow(data);
        }
    }
    public static void showStudents() {
        JFrame f;
        f = new JFrame();
        f.setTitle("Physic");
        String col[] = {"Name","School","Physic grades"};
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
            Object[] data = {Student.studentList.get(i).name, Student.studentList.get(i).school, Student.studentList.get(i).PhysicsGrades};
            tableModel.addRow(data);
        }
    }

}
