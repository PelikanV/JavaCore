import java.util.*;

public class SortBySalary implements  Comparator<Employee>{
    public int compare(Employee a, Employee b)
    {

        return a.calculatePay() - b.calculatePay();
    }
}
