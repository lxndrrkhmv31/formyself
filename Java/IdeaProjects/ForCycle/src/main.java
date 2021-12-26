import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int value = new Scanner(System.in).nextInt();

        for (int i = 1; i <= value; i = i + 1) {
            for (int n = 1; n <= value; n = n + 1) {
                if (i * n == value) {
                    System.out.println("Пара положительных целых чисел, произведение которых равно введенному числу: " + i + "*" + n);
                }
            }
        }

    }
}
