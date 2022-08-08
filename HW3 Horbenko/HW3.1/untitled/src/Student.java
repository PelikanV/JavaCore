public class Student {

    private String name;
    private int rating = 0;
    static int avgRating = 0;
    static int count = 0;
    static int sumrating = 0;

    Student() {
        count++;
        sumrating +=rating;
        avgRating = sumrating/count;
    }

    Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        count++;
        sumrating +=rating;
        avgRating = sumrating/count;
    }
    public int Rating(){
        return rating;
    }
    public String toStr() {
        return "rating: " + rating + " name: " + name;
    }

    static boolean betterStudent(int a, int b) {
        if (a < b) {
            return true;


        }
        return false;


    }
}
