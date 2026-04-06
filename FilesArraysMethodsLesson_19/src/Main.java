import java.util.Scanner;
import java.util.Random;
import javax.swing.*;
import java.io.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Сгенерируем случайное число - размерность массив
        // Math.random() можно использовать с параметрами и без.
        // В параметрах задается диапазон чисел, в пределах которого будут генерироваться случайные значения.
        Random random = new Random();
        int numMin = 2, numMax = 10;
        int n = random.nextInt((numMax - numMin) + 1) + numMin;
        int[] A = new int[n];
        System.out.printf("Размерность массива = %d\n", n);
        numMax = 50;
        numMin = 1;

        for (int i = 0; i < n; i++)
        {
            A[i] = random.nextInt((numMax - numMin) + 1) + numMin;
        }
        System.out.printf("Сгенерированный массив: ");
        for (int i = 0; i < n; i++)
        {
            System.out.printf("%d ", A[i]);
        }

        System.out.println();

        calc object = new calc(n, A);
        System.out.printf("МАКСИМУМ - 1 или МИНИМУМ - 0 вы хотите найти?\n");
        int flag = scanner.nextInt();

        switch (flag)
        {
            case 0:
                System.out.printf("min = %d ", object.valueMinMax(0));
                break;
            case 1:
                System.out.printf("max = %d ", object.valueMinMax(1));
                break;
            default:
                System.out.printf("Входные данные не соответствуют условиям");
        }

        // Вывод исходного массива в файл
        try {
            FileOutputStream fos = new FileOutputStream("data.txt", false);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

            for (int i = 0; i < n; i++)
            {
                bw.write(Integer.toString(A[i]));
                bw.newLine();
            }
            bw.close();
        }
        catch (FileNotFoundException | UnsupportedEncodingException e)
        {
            System.out.println("Файл не найден!" + e);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        int sum = object.sumMasFromFile();
        System.out.printf("\nСумма элеметнов массива B полученного из файла и реализован в метод sumMasFromFile() объекта object = %d", sum);

        object.sortArrayVibor();
    }
}