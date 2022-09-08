import java.util.ArrayList;
import java.util.Objects;

public class Math extends Subject {
    public static  ArrayList<Teacher> MathTeachers = Mathfilter();
    public Math(String name, int lessons){

        super("Math",5);


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
}
