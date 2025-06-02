import  java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a, f;
        while(true)
        {
            System.out.println("Введите целое число");

            a = scanner.nextInt();

            if (a % 2 == 0)
            {
                System.out.printf("Введите число = %d. Even number", a);
            }
            else if (a % 2 == 1)
            {
                System.out.printf("Введите число = %d. Odd number", a);
            }

            System.out.println("Продолжить проверку? 1 - да, 0 - нет");
            f = scanner.nextInt();

            if(f == 0) break;
        }
        // ==================================================================
        int w, h, sq;
        while(true)
        {
            System.out.println("Введите длину и ширину прямоугольника");

            w = scanner.nextInt();
            h = scanner.nextInt();

            if(w <= 0 || h <= 0 ) continue;

            sq = w * h;
            System.out.printf("площадь = %d.", sq);
        }
    }
}