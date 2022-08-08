public class ContactEmployee extends Employee {
    public String federaltexIdmember;
    public String name;
    public int salary;

    public String getname() {
        return name;
    }

    public ContactEmployee(String federaltexIdmember, String name, int salary) {
        this.federaltexIdmember = federaltexIdmember;
        this.name = name;
        this.salary = salary;

    }

    @Override
    public String getEmployeeld() {
        return federaltexIdmember;
    }

    @Override
    public int calculatePay() {
        return salary;
    }

    @Override
    public String toString() {
        return getname() + " " + getEmployeeld() + " " + calculatePay();
    }
}