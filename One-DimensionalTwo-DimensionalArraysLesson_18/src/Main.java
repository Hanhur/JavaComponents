// Матрицы в Java. Одномерные и двухмерные массивы.
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int i, j, n = 4, m = 5, k = 1;
        int[] A = new int[5]; // Одномерный массив
        int nn = 5; // Размерность масива A
        int[][] Matrix = new int[4][5]; // Двухмерный массив

        for (i = 0; i < n; i++)
        {
            for (j = 0; j < m; j++)
            {
                Matrix[i][j] = k;
                k++;
                System.out.printf("%d ", Matrix[i][j]);
            }
            System.out.printf("\n");
        }

        System.out.println();

        // Найти сумму всех элементов матрицы
        int sum = 0;

        for (i = 0; i < n; i++)
        {
            for (j = 0; j < m; j++)
            {
                sum += Matrix[i][j];
            }
        }
        System.out.printf("Sum = %d\n", sum);

        System.out.println();

        // Вывод 1й строки (это строка индекса 0)
        System.out.print("Вывод 1й строки (это строка индекса 0)\n");
        for (j = 0; j < m; j++)
        {
            System.out.printf("%d ", Matrix[0][j]);
        }

        System.out.println();

        // Вывод 3-го столбца (это столбец с индексом 2)
        System.out.print("Вывод 3-го столбца (это столбец с индексом 2)\n");
        for (j = 0; j < n; j++)
        {
            System.out.printf("%d ", Matrix[j][2]);
        }

        System.out.println();

        // Поменять местами элементы матрицы в строках а и b (вводятся пользователем)
        int a, b, c;
        System.out.print("Введите номера строк, элементов которых нужно поменять местами (от 0 до 3)\n");
        a = scanner.nextInt();
        b = scanner.nextInt();

        for (j = 0; j < m; j++)
        {
            c = Matrix[a][j];
            Matrix[a][j] = Matrix[b][j];
            Matrix[b][j] = c;
        }

        for (i = 0; i < n; i++)
        {
            for (j = 0; j < m; j++)
            {
                System.out.printf("%d ", Matrix[i][j]);
            }
            System.out.printf("\n");
        }

        System.out.println();

        // Ввод элементов массива A
        System.out.print("Введите элементы массива А - 5 целых чисел\n");

        for (i = 0; i < nn; i ++)
        {
            A[i] = scanner.nextInt();
        }

        // Сортировка по возрастанию элементов одномерного массива методом пузырька
        for (j = 0; j < nn; j++)
        {
            for (i = 0; i < nn - 1; i++)
            {
                if (A[i] > A[i + 1])
                {
                    c = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = c;
                }
            }
        }

        System.out.print("Вывод отсортированного массива методом пузырька:\n");
        for (i = 0; i < nn; i++)
        {
            System.out.printf("%d ", A[i]);
        }
    }
}