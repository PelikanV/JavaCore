import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student( 1, "Yura"));
        students.add(new Student(2,"Bogdan"));
        students.add(new Student(3,"Allya"));
        students.add(new Student(4,"Svjatoslav"));
        students.add(new Student(5,"Taras" ));
        System.out.println(students);

        HashMap<Integer, String> map = new HashMap<>();

        for (Student el : students) {
            map.put(el.getCourse(), el.getName());
        }

       Student.printStudents(map,1);
        Student.printStudents(map,3);
        List<Map.Entry<Integer, String>> sorted = new ArrayList<>(map.entrySet());
        Collections.sort(sorted, new ValueComparator<>());
        System.out.println(sorted);

        ArrayList<Integer> sortedKeys = new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys);
        for (Integer x : sortedKeys)
            System.out.println("Key = " + x + ", Value = " + map.get(x));

    }
}