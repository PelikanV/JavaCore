public class Main {
    public static void main(String[] args) {


        Employee John = new Employee("John",30,20);
    Employee Sergij = new Employee("Sergij",40,20);
    System.out.println(Sergij.getSalary());
        System.out.println("TotalSum: " +Employee.totalsum);
        System.out.println(Sergij.toStr());
        Sergij.ChangeRate(30);
        System.out.println(Sergij.getSalary());
        System.out.println(John.getSalary());
        System.out.println(Sergij.toStr());
        System.out.println("TotalSum: " +Employee.totalsum);

    }
}