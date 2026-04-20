// Работа с файлами. Поиск с использованием массива. Матрицы в Java
import java.util.Scanner;
import java.util.Random;
import javax.swing.*;
import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Scanner scanners = new Scanner(System.in);
        /*
        int n = 100, flag = 1, i, m = 0, j = -1;
        String[] bd = new String[n];
        String str = new String();

        try{
            FileOutputStream fos = new FileOutputStream("data.txt", false);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

            for(i = 0; i < n; i++)
            {
                bw.write("Имя");
                bw.newLine();
                System.out.print("\nВведите имя ");
                str = scanner.nextLine();
                bw.write(str);
                j++;
                bd[j] = str;

                bw.newLine();
                bw.write("Телефон");
                bw.newLine();
                System.out.print("\nВведите Телефон ");
                str = scanner.nextLine();
                bw.write(str);
                j++;
                bd[j] = str;

                System.out.print("\nЗавершить ввод? 0 - завершить, 1 - продолжить ");
                flag = scanners.nextInt();
                if(flag == 1)
                {
                    bw.newLine();
                }
                else
                {
                    m = j;
                    break;
                }
            }
            bw.close();
        }
        catch (FileNotFoundException | UnsupportedEncodingException e)
        {
            System.out.println("Файл не найден! " + e);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        System.out.println("\nВывод справочника");
        for(i = 0; i <= m; i++)
        {
            System.out.printf("%s ", bd[i]);
        }

        // Поиск с использованием массива bd ==================================================================
        System.out.printf("\nПо какому полю произвести поиск\n");
        System.out.printf("1 - имя\n");
        System.out.printf("2 - телефон\n");
        flag = scanners.nextInt();
        if(flag == 1)
        {
            System.out.printf("\nВведите имя для поиска: ");
            str = scanner.nextLine();
            for(i = 0; i < m; i = i + 2)
            {
                if(str.equals(bd[i]))
                {
                    System.out.printf("\nКлиент есть и его номер тел: %s", bd[i + 1]);
                }
            }
        }
        else if(flag == 2)
        {
            System.out.printf("\nВведите телефон для поиска: ");
            str = scanner.nextLine();
            for(i = 0; i < m - 1; i = i + 2)
            {
                if(str.equals(bd[i + 1]))
                {
                    System.out.printf("\nНомер есть и его имя: %s", bd[i]);
                }
            }
        }
        */
        //===============================================================================
        /*
        int a = 10, b = 0, y;
        try {
            y = a / b;
        }
        catch (ArithmeticException eObj)
        {
            System.out.printf("\nОшибка - деление на ноль невозможно");
        }
        // ===============================================================================
        try {
            System.out.printf("\nВведите размеронсть массива");
            a = scanner.nextInt();
            int[] D = new int[a];
        }
        catch (NegativeArraySizeException eObj)
        {
            System.out.printf("\nОшибка - попытка создать массив отрицательного размера");
        }
         */
        // ================================================================================
        /*
        int n = 4, m = 5;
        int[][] Matrix = new int[n][m];

        for(int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                Matrix[i][j] = i;
            }
        }

        for(int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.printf("%d ", Matrix[i][j]);
            }
            System.out.printf("\n");
        }
         */
        // ======================================================================================

        int n = 4, m = 5, k = 0, sum;
        int[][] Matrix = new int[n][m];

        for(int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                k++;
                Matrix[i][j] = k;
            }
        }

        for(int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.printf("%d ", Matrix[i][j]);
            }
            System.out.printf("\n");
        }

        // ======================================================================

        for (int i = 0; i < n; i++)
        {
            sum = 0;
            for (int j = 0; j < m; j++)
            {
                sum += Matrix[i][j];
            }
            System.out.printf("\nСумма строки номер %d равна = %d", i, sum);
        }
    }
}