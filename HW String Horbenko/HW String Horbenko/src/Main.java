// Програма для знаходження найменшого спільного кратного двох натуральних чисел (НСК)
import java.util.Scanner;
class Main {
    public static void main (String args[]) {
        Scanner scann = new Scanner(System.in);
// Ввід вхідних даних

        int number1 = scann.nextInt();

        int number2 = scann.nextInt();
// Якщо перше число менше другого, то міняємо їх значення
        if (number1 < number2) {
            int number = number1;
            number1 = number2;
            number2 = number;
        }
        int res;
// Знаходження добутку чисел number1 та number2
        int multiplication = number1 * number2;
// Знаходження НСД
        do {
            res = number1 % number2;
            number1 = number2;
            number2 = res;
        } while (res != 0);
        // Знаходження НСК
        int nok = multiplication / number1;
// Виводимо результати роботи програми
        System.out.print( nok);
    }
}

