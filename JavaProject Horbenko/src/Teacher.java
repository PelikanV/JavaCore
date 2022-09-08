import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Teacher {
    private int id;
    public String name;
    public  String subject;
    public String school;
    public static ArrayList<Teacher> teacherList = new ArrayList<>();
    public Teacher(int id, String name, String subject,String school) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.school = school;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Subject: " +subject + ", School: " + school;
    }
    public static ArrayList readFromFile(String s) {
        try (BufferedReader br = new BufferedReader(new FileReader(s))) {
            String line;
            ArrayList<String> teacherfile = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                teacherfile.add(line);
            }
            for (String t : teacherfile) {
                String[] data = t.split("/");
                teacherList.add(new Teacher(Integer.parseInt(data[0]), data[1],data[2],data[3]));
            }
        return teacherList;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}