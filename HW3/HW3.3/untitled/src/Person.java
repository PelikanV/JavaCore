import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    Person() {


    }

    Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public int getAge() {
        return 2022-birthYear;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input info");
        this.firstName = scanner.nextLine();
        this.lastName = scanner.nextLine();
        this.birthYear = scanner.nextInt();
    }

    public void output() {
        System.out.println("firstName: "+firstName + " lastName: " + lastName + " Years "+getAge());
    }

    public void changeName(String firstName, String lastName)
    {
        this.firstName = firstName ;
        this.lastName = lastName;
    }
}

