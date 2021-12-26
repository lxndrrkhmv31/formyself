import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);

        while (true) {
            System.out.println("Введите свое число в диапазоне от 0 до 100: ");
            int attempt = new Scanner(System.in).nextInt();
            if (attempt < 0 || attempt > 100) {
                System.out.println("Введенное число не соответствует диапазону загаданного числа!");
                continue;
            }

            if (attempt == value) {
                System.out.println("Вы угадали!!!");
            } else if (attempt > value) {
                System.out.println("Загаданное число меньше!");
            } else {
                System.out.println("Загаданное число больше!");
            }
        }
    }
}
