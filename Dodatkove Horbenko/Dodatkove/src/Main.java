import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*task1(4,4);*/
        /*task2();*/
    }
    public static void task1(int a, int b){
        String s = "";
        for(int i = 0; i < a; i++){
            if (i%2==0) {
                s = "* ".repeat(b);
            }
            else{
                s = " *".repeat(b);
            }
            System.out.println(s);

        }
    }
    public static void task2(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input data");
        double a = 5.0;
        double b = 5.0;
        boolean count = true;
        while(count){
            System.out.println("y/n");
            String s = myObj.next();
            if (s.equals("y")){
                double c = myObj.nextDouble();
                double d = myObj.nextDouble();
            if (a > c||b>d )
            {
                System.out.println("Pass");
                a = c;
                b = d;
            }
            else {
                System.out.println("Failed");
                count = false;
            }
            }
            else {
                count = false;
            }

        }
    }
}