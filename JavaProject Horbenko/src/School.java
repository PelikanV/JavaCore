import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class School   {
    public ArrayList<Teacher> teachlists;
    public  ArrayList<Student> studentlists;
    public  String name;
    public  ArrayList<Teacher> SchoolTeachers = new ArrayList<>();
    public  ArrayList<Student > SchoolStudents = new ArrayList<>();
    public  Double rating = 0.0;
    public School(String name,ArrayList<Teacher> teachlists, ArrayList<Student> studentlists) {
        this.name = name;
        this.teachlists = teachlists;
        this.studentlists = studentlists;
        for (int i = this.teachlists.size() - 1; i >= 0; i--) {
            if (this.name.equals(this.teachlists.get(i).school)) {
                SchoolTeachers.add(this.teachlists.get(i));
            }
        }
        for (int i = this.studentlists.size() - 1; i >= 0; i--) {
            if (this.name.equals(this.studentlists.get(i).school)) {
                SchoolStudents.add(this.studentlists.get(i));
            }
        }
        double temprating = 0.0;
        for (int i = this.SchoolStudents.size() - 1; i >= 0; i--) {
            temprating = 0.0;
            for (int j = this.SchoolStudents.get(i).MathGrades.size() - 1; j >= 0; j--){
                double total = 0.0;
                total += this.SchoolStudents.get(i).MathGrades.get(j);
                temprating +=total;
            }
            temprating = (temprating/((this.SchoolStudents.get(i).MathGrades.size())));
            rating+=temprating;
        }
        for (int i = this.SchoolStudents.size() - 1; i >= 0; i--) {
            temprating = 0.0;
            for (int j = this.SchoolStudents.get(i).EnglishGrades.size() - 1; j >= 0; j--){
                double total = 0.0;
                total += this.SchoolStudents.get(i).EnglishGrades.get(j);
                temprating +=total;
            }
            temprating = (temprating/((this.SchoolStudents.get(i).EnglishGrades.size())));
            rating+=temprating;
        }
        for (int i = this.SchoolStudents.size() - 1; i >= 0; i--) {
            temprating = 0.0;
            for (int j = this.SchoolStudents.get(i).PhysicsGrades.size() - 1; j >= 0; j--){
                double total = 0.0;
                total += this.SchoolStudents.get(i).PhysicsGrades.get(j);
                temprating +=total;
            }
            temprating = (temprating/((this.SchoolStudents.get(i).PhysicsGrades.size())));
            rating+=temprating;
        }
        rating =rating/((this.SchoolStudents.size()*3));
    }
    public double getRating(){
        return this.rating;
    }
    @Override
    public String toString() {
        return "Name: " + teachlists + " "+ studentlists;
    }
        public void TableforStudents()
        {
            JFrame f;
            JTable j;
            f = new JFrame();
            f.setTitle("Students");
            String col[] = {"Name","School","English grades","Math grades","Physics grades"};
            DefaultTableModel tableModel = new DefaultTableModel(col, 0);
            JTable table = new JTable(tableModel);
            table.setBounds(30, 40, 200, 300);
            JScrollPane sp = new JScrollPane(table);
            f.add(sp);
            f.setSize(800, 200);
            f.setVisible(true);
            table.setAutoCreateRowSorter(true);
            for(int i = 0; i < this.SchoolStudents.size(); i++)
            {
                String EnglishGrades = this.SchoolStudents.get(i).EnglishGrades.toString().replaceAll("\\[", "").replaceAll("\\]","");
                String MathGrades = this.SchoolStudents.get(i).MathGrades.toString().replaceAll("\\[", "").replaceAll("\\]","");
                String PhysicsGrades = this.SchoolStudents.get(i).PhysicsGrades.toString().replaceAll("\\[", "").replaceAll("\\]","");

                Object[] data = {this.SchoolStudents.get(i).name, this.SchoolStudents.get(i).school,EnglishGrades,MathGrades,PhysicsGrades };
                tableModel.addRow(data);
            }
            }
    public void TableforTeachers()
    {
        JFrame f;
        JTable j;
        f = new JFrame();
        f.setTitle("Teachers2");
        String col[] = {"Name","School","Subject"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        JTable table = new JTable(tableModel);
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
        table.setAutoCreateRowSorter(true); // sorting of the rows on a particular column
        for(int i = 0; i < this.SchoolTeachers.size(); i++)
        {
            String name = this.SchoolTeachers.get(i).name;
            String school = this.SchoolTeachers.get(i).school;
            String subject = this.SchoolTeachers.get(i).subject;
            Object[] data = {name, school, subject};
            tableModel.addRow(data);
        }
    }
}











