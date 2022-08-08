public class SalariedEmployee extends Employee {
    public String socialSecurityNumber;
    public String name;
    public int salary;
    public int hours;

    public String getname() {
        return name;
    }


    public SalariedEmployee(String socialSecurityNumber, String name, int salary, int hours) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.name = name;
        this.salary = salary;
        this.hours = hours;
    }

    @Override
    public String getEmployeeld() {
        return socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        return salary * hours;
    }

    @Override
    public String toString() {
        return getname() + " " + getEmployeeld() + " " + calculatePay();


    }
}