
public class Employee {
    private String name;
    private int rate;
    private int hours;
    static int totalsum = 0;

    Employee() {
        totalsum +=getSalary();
    }

    Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalsum +=getSalary();
    }

    public int getSalary() {
        return rate * hours;
    }
    public void ChangeRate(int rate){
        int temp = getSalary();
        this.rate = rate;
        totalsum -=  (temp-getSalary());
    }

    public String toStr() {
        return "name " + name + " rating: " + rate + " hours: " + hours;
    }
        public double getBonuses(){
            return getSalary() * 0.1;
        }

}
