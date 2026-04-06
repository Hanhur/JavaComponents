import java.io.*;
import java.util.Scanner;

public class calc {
    int[] A = new int[100];
    int[] B = new int[100];
    int[] C = new int[100];
    int n, max, min;

    calc(int s, int[] array)
    {
        n = s;
        for (int i = 0; i < n; i++)
        {
            A[i] = array[i];
        }
    }

    public int valueMinMax(int flag)
    {
        if(flag == 0)
        {
            min = A[0];
            for (int i = 0; i < n; i++)
            {
                if(min > A[i])
                {
                    min = A[i];
                }
            }
            return min;
        }
        else if(flag == 1)
        {
            max = A[0];
            for (int i = 0; i < n; i++)
            {
                if(max < A[i])
                {
                    max = A[i];
                }
            }
            return max;
        }
        return 0;
    }

    public int sumMasFromFile()
    {
        int sum = 0;

        try {
            FileInputStream fis = new FileInputStream("data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis, "UTF-8"));

            String str;

            for (int i = 0; i < n; i++)
            {
                str = br.readLine();
                B[i] = Integer.parseInt(str);
               // B[i] = Integer.parseInt(br.readLine());
            }
            br.close();
        }
        catch (FileNotFoundException | UnsupportedEncodingException e)
        {
            System.out.println("Файл не найден!" + e);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return  sum;
    }

    public void sortArrayVibor()
    {
        int i, j, minB, k;
        int m = n;

        for (i = 0; i < n - 1; i++)
        {
            k = 0;
            minB = B[0];
            for (j = 0; j < m; j++)
            {
                if(minB > B[i])
                {
                    minB = B[j];
                    k = j;
                }
            }
            C[i] = minB;
            B[k] = B[m - 1];
            m--;
        }
        C[n - 1] = B[0];

        System.out.printf("\nОтсортированный массив методом Выборки: ");
        for (i = 0; i < n; i++)
        {
            System.out.printf("%d ", C[i]);
        }
    }
}