import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PseudoColumnUsage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Student {
    public int id;
    public String name;
    public List<Integer> MathGrades = new ArrayList<>();
    public List<Integer> PhysicsGrades = new ArrayList<>();
    public List<Integer> EnglishGrades = new ArrayList<>();
    public String school;
    public static ArrayList<Student> studentList = new ArrayList<>();
    public Student(int id, String name, List<Integer>  MathGrades ,List<Integer>  PhysicsGrades ,List<Integer> EnglishGrades,String school){
        this.id = id ;
        this.name = name;
        this.MathGrades = MathGrades;
        this.PhysicsGrades = PhysicsGrades;
        this.EnglishGrades = EnglishGrades;
        this.school = school;


    }
    @Override
    public String toString() {
        return "Student's name :"+name +", Math: "+ MathGrades +", PhysicsGrades: "+ PhysicsGrades+", EnglishGrades: "+ EnglishGrades+", School: "+school;
    }
    public static ArrayList readFromFile(String s) {
        try (BufferedReader br = new BufferedReader(new FileReader(s))) {
            String line;
            ArrayList<String> studenfile = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                studenfile.add(line);
            }
            for (String r : studenfile) {
                String[] info = r.split("/");
                List<String> data = Arrays.asList(info);
                String[] data1 = data.get(2).split(",");
                String[] data2 = data.get(3).split(",");
                String[] data3 = data.get(4).split(",");
                Integer[] values1 = Arrays.stream(data2).map(Integer::parseInt).toArray(Integer[]::new);
                Integer[] values2 = Arrays.stream(data2).map(Integer::parseInt).toArray(Integer[]::new);
                Integer[] values3 = Arrays.stream(data3).map(Integer::parseInt).toArray(Integer[]::new);
                List<Integer> data11 = Arrays.asList(values1);
                List<Integer> data22 = Arrays.asList(values2);
                List<Integer> data33 = Arrays.asList(values3);
                studentList.add(new Student(Integer.parseInt(info[0]),info[1],data11,data22,data33,info[5]));
            }
            return studentList;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
