

public class Main {
    public static void main(String[] args) {

            Student Vladislav = new Student("Vladislav",20);
            Student Vitalij = new Student("Vitalij",40);
            Student Oleg = new Student("Oleg",50);

            System.out.println(Vitalij.toStr());
            System.out.println(Student.betterStudent(Vitalij.Rating(), Vladislav.Rating()));
            System.out.println("AvgRating: " +Student.avgRating);
            System.out.println("Total rating "+ Student.sumrating);
    }
}