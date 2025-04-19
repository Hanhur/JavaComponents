import java.util.Scanner; // Подключение библиотеки
import java.io.*; // Подключение всех библиотек io

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a, b, sum;
        a = 10;
        b = 20;
        sum = a + b;

        System.out.print("Сумма чисел a и b = ");
        System.out.print(sum);

        System.out.print("Ввндите первое число:");
        a = scanner.nextInt();
        System.out.print("Ввндите второе число:");
        b = scanner.nextInt();
        sum = a * b;
        System.out.print("Произведение чисел a и b = ");
    }
}