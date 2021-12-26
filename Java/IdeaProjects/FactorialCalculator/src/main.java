import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        for ( ; ; ) {
            System.out.println("Введите число, факториал которого нужно посчитать: ");
            int value = new Scanner(System.in).nextInt();

            int result = 1;

            for (int i = 1; i <= value; i = i + 1) {
                result = result * i;
            }

            System.out.println("!" + value + "=" + result);
        }

    }
}
