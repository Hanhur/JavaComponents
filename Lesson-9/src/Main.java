import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int i, j, sum, n = 10, x1;
        int [] A = new int[n];

        // Найти сумму двух элементов массива
        A[0] = 20;
        A[9] = 30;
        sum = A[0] + A[9];
         System.out.printf("A[0] + A[9] = %d\n", sum);

        // Введите в массив из 10 элеметнов числа от 1 до 10
        for(i = 0; i < n; i++)
        {
            A[i] = i + 1; // A[0] = 1; A[1] = 2; и так далее
             System.out.printf("%d ", A[i]);
        }

        System.out.println();

        // Геометрическая прогресия
        A[0] = 1;
        for(i = 1; i < n; i++)
        {
            A[i] = A[i - 1] * 2;
            System.out.printf("%d ", A[i]);
        }

        System.out.println();

        i = 0;
        while (i < n)
        {
            System.out.printf("%d ", A[i]);
            i++;
        }

        // Ввусти элементы массива. Вусти число х1.
        // Вывести число от 0 до х1, далее вывести квадрат числа х1 и далее вывести элеметны от х1 до n
//        System.out.printf("Введите %d чисел", n);
//        for(i = 0; i < n; i++)
//        {
//            A[i] = scanner.nextInt();
//            System.out.printf("%d \n", A[i]);
//        }
//        System.out.printf("Введите число - от 1 до 9");
//        x1 = scanner.nextInt();
        System.out.println();
        
        for(i = 1; i <= 1000; i++)
        {
            if(i % 3 == 0 || i % 5 == 0 || i % 15 == 0)
            {
                if(i % 3 == 0)
                {
                    System.out.printf(" fizz");
                }
                if(i % 5 == 0)
                {
                    System.out.printf(" buzz");
                }
                if(i % 15 == 0)
                {
                    System.out.printf(" hiss");
                }
                continue;
            }
            else
            {
                System.out.printf(" %d", i);
            }
        }
    }
}