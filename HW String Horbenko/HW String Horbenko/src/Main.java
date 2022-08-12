import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;
public class Main {


    public static void main(String[] args) {

        Task3();
    }

    public static void Task3(){
        String pattern = "(\\$[0-9]+(\\.[0-9]{2}))";
        String text = "If you invested $1 in the year 1801, you would have $18087791.41 today.\n" +
                "This is a 7.967% return on investment.\n" +
                "But if you invested only $0.25 in 1801, you would end up with $4521947.8525.";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if (m.matches()) { System.out.print("Matches the entire text string"); }
        m.reset();
        System.out.println();
        while (m.find()) {
            System.out.print(text.substring(m.start(), m.end()) + "\n");
        }

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