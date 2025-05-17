import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a, b, c, res = 0;
        int flag = 1;

        do {
            System.out.println("\nВведите 3 целых числа");
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();

            if (a >= 0 && b >= 0 && c >= 0)
            {
                res = a + b + c;
                System.out.printf("Сумма = %d", res);
            }
            else if (a < 0 && b < 0 && c < 0)
            {
                res = a * b * c;
                System.out.printf("Произведение = %d", res);
            }
            else
            {
                if (a > b && a > c)
                {
                    res = a;
                }
                else if (b > a && b > c)
                {
                    res = b;
                }
                else if (c > a && c > b)
                {
                    res = c;
                }
                System.out.printf("Максимальное число = %d", res);
            }
            System.out.print("\nДля выхода введите 0, чтобы продолжить - введите 1: ");
            flag = scanner.nextInt();

        } while(flag == 1);
    }
}