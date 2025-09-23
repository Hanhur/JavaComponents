import java.util.Scanner;

public class CalcSum {
    int sum;

    public void algSum()
    {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.println("Введите число a и b (из объекта класса algSum)");

        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.printf("Сумма = %d", a + b);
    }
}
