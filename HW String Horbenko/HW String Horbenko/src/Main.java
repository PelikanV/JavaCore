import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;
public class Main {


    public static void main(String[] args) {


    }

    public static void Task2(){
        Scanner ob1 = new Scanner(System.in);
        String sentence = ob1.nextLine();
        ob1.close();
        String result = sentence.replaceAll("\\s+", " ");

        System.out.println(result);
    }
    public static void Task1(){
        Scanner ob1 = new Scanner(System.in);
        String sentence = ob1.nextLine();
        ob1.close();
        String[] arr = sentence.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(getLongestString(arr));
        System.out.println(getLongestString(arr).length());
        StringBuilder reverseString = new StringBuilder();
        String reverseWord = new StringBuilder(arr[1]).reverse().toString();
        System.out.println(reverseWord);

    }

    public static String getLongestString(String[] array) {
        int maxLength = 0;
        String longestString = null;
        for (String s : array) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        return longestString;
    }
}