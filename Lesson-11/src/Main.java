import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a, b, c, d, max;

        System.out.printf("Введите 4 целых числа (равные и не равные 0)\n");

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        max = max4Num(a, b, c, d);

        System.out.printf("max = %d\n", max);
    }

    // Методы
    static int max4Num(int a, int b, int c, int d)
    {
        int max;

        if(a > b && a > c && a > d) max = a;
        else if(b > a && b > c && b > d) max = b;
        else if(c > a && c > b && c > d) max = c;
        else if(d > a && d > b && d > c) max = d;
        else max = 0;

        return max;
    }
}