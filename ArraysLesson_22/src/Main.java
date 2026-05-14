import java.util.Scanner;
import  java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = 15;
        int [] A = new int[n];

        System.out.println("Заполнение массива на 15 элементов числами Фибоначчи");
        A[0] = 0;
        A[1] = 1;

        for (int i = 2; i < n; i++)
        {
            A[i] = A[i - 2] + A[i - 1];
        }
        for (int i = 0; i < n; i++)
        {
            System.out.printf("%d ", A[i]);
        }

// ====================================================================================================================

        int[] B = new int[] {2,2,2,2,2,2,2,2,2,2};
        int flag = 1;

        for (int i = 0; i < B.length - 1; i++)
        {
            if (B[i] != B[i + 1])
            {
                flag = 0;
                break;
            }
        }
        if(flag == 0) System.out.print("\nNo\n");
        else System.out.print("\nYes\n");

// ====================================================================================================================

        int[] C = new int[] {1,2,4,12,6,5,8,56,21,277};
        flag = 1;

        for (int i = 0; i < C.length - 1; i++)
        {
            for (int j = i + 1; j < C.length; j++)
            {
                if (C[i] == C[j])
                {
                    flag = 0;
                    break;
                }
            }
            if (flag == 0) break;
        }
        if(flag == 0) System.out.print("\nNo\n");
        else System.out.print("\nYes\n");

// ====================================================================================================================

        int[] D = new int[] {1,2,4,12,1,5,8,56,2,12};
        int count, check;

        for (int i = 0; i < D.length; i++)
        {
            check = 0;
            for (int k = i; k > 0; k--)
            {
                if (D[i] == D[k - 1]) check = 1;
            }

            if (check == 0)
            {
                count = 1;
                for (int j = i + 1; j < D.length; j++)
                {
                    if (D[i] == D[j]) count++;
                }
                if(count > 1) System.out.printf("\nЧисло %d повторяется %d раз\n", D[i], count);
            }
        }

// ====================================================================================================================

        Random random = new Random();
        int nn;

        System.out.print("\nВведите размерность массива\n");
        nn = scanner.nextInt();
        int[] E = new int[nn];
        int numMin = -10, numMax = nn;

        System.out.print("\nВведите элементы массива\n");

        for (int i = 0; i < nn; i++)
        {
            E[i] = random.nextInt((numMax - numMin) + 1) + numMin;
        }

        System.out.printf("\nИсходный массив\n");
        for (int i = 0; i < nn; i++)
        {
            System.out.printf("%d ", E[i]);
        }

        flag = 0;
        for (int i = 0; i < nn; i++)
        {
            if (E[i] < -1)
            {
                flag = 1;
                break;
            }
        }

        if (flag == 1)
        {
            for (int i = 0; i < nn; i++)
            {
                if (E[i] < 0)
                {
                    E[i] = (int) Math.pow((double) E[i], (double) 2);
                }
            }
        }

        System.out.printf("\nРезультирующий массив\n");
        for (int i = 0; i < nn; i++)
        {
            System.out.printf("%d ", E[i]);
        }

// ====================================================================================================================

        Random r = new Random();
        int nnn;

        System.out.print("\nВведите размерность массива\n");
        nnn = scanner.nextInt();
        int[] F = new int[nnn];
        numMin = 0;
        numMax = 33;

        for (int i = 0; i < nn; i++)
        {
            F[i] = r.nextInt((numMax - numMin) + 1) + numMin;
        }

        System.out.printf("\nИсходный массив\n");
        for (int i = 0; i < nnn; i++)
        {
            System.out.printf("%d ", F[i]);
        }

        for (int i = 1; i < nnn - 1; i++)
        {
            if (F[i - 1] != 0 && F[i + 1] != 0 && F[i] != 0 && F[i] % F[i - 1] == 0 && F[i + 1] % F[i] == 0) System.out.printf("%d", F[i]);
        }

// ====================================================================================================================

        int[] G = new int[] {1,2,44,12,7,8,7,12,4,2,1};
        flag = 1;
        for (int i = 0; i < G.length / 2; i++)
        {
            if (G[i] != G[G.length - i]) flag = 0;
        }
        if (flag == 1) System.out.print("\nYes - массив симметричный");
        else System.out.print("\nNo - массив несимметричный");
    }
}