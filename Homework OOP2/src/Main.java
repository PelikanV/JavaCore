
import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        SalariedEmployee person1 = new SalariedEmployee("1","Ivan",55,44);
        ArrayList<Employee> ar = new ArrayList<Employee>();
        ar.add(new SalariedEmployee("1","Ivan",55,44));
        ar.add(new ContactEmployee("2","Sergij",55));
        ar.add(new ContactEmployee("55","Bogdan",105000));
        // Sorting student entries by roll number
        Collections.sort(ar, new SortBySalary());
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}