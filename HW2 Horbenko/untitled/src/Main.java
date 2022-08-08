import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//       task1();
        /*task2();*/
        task3();
    }
    static void task1(){
        Scanner myObj = new Scanner(System.in);
        Integer t = myObj.nextInt();
        if (0<=t%5&&t%5<=3) {
            System.out.println("Green");
        }
        else {
            System.out.println("Red");
        }
    }
    static void task2(){
        Scanner myObj = new Scanner(System.in);
        Integer number = myObj.nextInt();
        Integer num = number;
        int length = String.valueOf(num).length();
        System.out.println("Length: "+ length);
        int reversed = 0;
        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println("Reversed Number: " + reversed);

        while (number > 0) {
            if (number%10> 4)
            {System.out.println("Numbers > 4: " +number % 10);
            }

            number = number / 10;
        }

    }
    static void task3() {
        Scanner scan = new Scanner(System.in);
        int arrLength;

        System.out.println("Enter your arrays length");
        arrLength = scan.nextInt();
        int[] arr = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println(Arrays.toString(arr));


        double total = 0;
        for (int i = arr.length / 2; i < arr.length; i++) {
            total = total + arr[i];
        }

        double average = total / (arr.length / 2);


        System.out.format("The average is: " + average + "\n");

        int[] A = new int[arrLength];
        int[] B = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " is even");
                A[i] = arr[i];
            } else {
                System.out.println(arr[i] + " is odd");
                B[i] = arr[i];
            }

        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));


        int p = arrLength / 4;
        for(int i = 0; i < arrLength / 4; i++)
        {
            Integer temp = arr[i];
            arr[i] = arr[i+arrLength/2];
            arr[i+arrLength/2] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}