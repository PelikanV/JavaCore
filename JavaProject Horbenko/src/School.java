import java.util.ArrayList;
public class School {
    public ArrayList<Teacher> teachlists;
    public  ArrayList<Student> studentlists;
    public  String name;
    public  ArrayList<Teacher> SchoolTeachers = new ArrayList<>();
    public  ArrayList<Student > SchoolStudents = new ArrayList<>();
    public School(String name,ArrayList<Teacher> teachlists, ArrayList<Student> studentlists) {
        this.name = name;
        this.teachlists = teachlists;
        this.studentlists = studentlists;
        for (int i = this.teachlists.size()-1; i>0; i--) {
            if (this.name.equals(this.teachlists.get(i).school)) {
                SchoolTeachers.add(this.teachlists.get(i));
            }
        }
        for (int i = this.studentlists.size()-1; i>0; i--) {
            if (this.name.equals(this.studentlists.get(i).school)) {
                SchoolStudents.add(this.studentlists.get(i));
            }
        }
    }
    @Override
    public String toString() {
        return "Name: " + teachlists + " "+ studentlists;
    }
   
}
