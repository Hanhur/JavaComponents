import java.util.Random;
import java.util.Scanner;

public class Main {
    // Методы
    static void java112()
    {
        System.out.println("Привет из метода java112()");
    }

    static int calcSum(int x1, int x2, int x3)
    {
        int sum;
        sum = x1 + x2 + x3;
        return sum;
    }

    static void calcMax(int x1, int x2)
    {
        if(x1 > x2)
        {
            System.out.printf("Максимальное значение = %d\n", x1);
        }
        else if(x1 < x2)
        {
            System.out.printf("Максимальное значение = %d\n", x2);
        }
        else
        {
            System.out.printf("Числа равны");
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int res, a, b, c;

        java112();

        res = calcSum(4, 70, 30);
        System.out.printf("Сумма трех числе = %d\n", res);

        Random rand = new Random();
        a = rand.nextInt(100);
        b = rand.nextInt(100);
        c = rand.nextInt(100);

        res = calcSum(a, b, c);
        System.out.printf("Сумма трех числе = %d\n", res);

        calcMax(100, 200);

        /*
        int[] A = new int[10];
        int i, j, n, sum, max;

        System.out.printf("Введите размерность массива (не более 10)\n");
        n = scanner.nextInt();

        System.out.printf("Введите %d целых числа\n", n);

        for (i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
            System.out.printf("%d ", A[i]); // A[0], A[1], A[2]
        }

        sum = 0;
        for (i = 0; i < n; i++) {
            sum += A[i];
        }

        // Найти максимальное значение в массиве
        max = A[0];
        for (i = 0; i < n; i++)
        {
            if(A[i] > max)
            {
                max = A[i];
            }
        }

        System.out.printf("Сумма = %d\n Максимум = %d\n", sum, max);
         */
    }
}