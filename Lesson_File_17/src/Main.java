// Передача массива в Java. Работа с файлами и с текстом
import java.util.Scanner;
import javax.swing.*;
import java.io.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int i, j, n;

        Calculations obj = new Calculations();

        // Ввод размерности массива и элементов массива
        System.out.print("Введите размерность массива (не более 10) \n");
        n = scanner.nextInt();

        System.out.printf("Введите %d целых числа: \n", n);
        for(i = 0; i < n; i++)
        {
            A[i] = scanner.nextInt();
        }

        // Вывод элементов исходного массива
        System.out.print("Вывод элементов исходного массива \n");
        for(i = 0; i < n; i++)
        {
            System.out.printf("%d ", A[i]);
        }

        A = obj.editArray(A);

        // Вывод элементов результирующего массива
        System.out.print("Вывод элементов результирующего массива \n");
        for(i = 0; i < n; i++)
        {
            System.out.printf("%d ", A[i]);
        }
// ====================================================================================================================
        // Работа с файлами
        try {
            // Создание файлового потока ввода:
            FileInputStream fin = new FileInputStream("file.txt");
            // Создание файлового потока вывода
            FileOutputStream fout = new FileOutputStream("result.txt");
            int ss = fin.read();
            // Обработка считанного значения:
            while(ss != -1)
            {
                // Запись в файл:
                fout.write(ss);
                fout.write('t');
                // Считывание из файла:
                ss = fin.read();
            }
            // Закрытие файлов:
            fin.close();
            fout.close();
        }
        // Обработка исключительной ситуации:
        catch(FileNotFoundException error)
        {
            JOptionPane.showMessageDialog(null, "Такого файла нет!", "Произошла ошибка", JOptionPane.ERROR_MESSAGE);
        }
        catch(IOException error)
        {
            error.printStackTrace();
        }
// ====================================================================================================================
        System.out.println("=================================\n");

        try{
            // Создание байтового потока ввода:
            FileInputStream fis = new FileInputStream("base.txt");
            // Создание байтового потока вывода:
            FileOutputStream fos = new FileOutputStream("data.txt", true);

            // Создание буферизированного потока ввода:
            BufferedReader br = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
            // Создание буферизированного потока вывода:
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

            String str;

            while((str = br.readLine()) != null)
            {
                System.out.println(str);

                // Проверяем, не достигли ли мы "Lorem Ipsum"
                if (str.equalsIgnoreCase("Lorem Ipsum"))
                {
                    break; // Выходим из цикла
                }

                // Записываем преобразованную строку
                bw.write(str.toLowerCase().replace(' ', '_'));
                bw.newLine();
            }
            br.close();
            bw.close();
        }
        catch(FileNotFoundException | UnsupportedEncodingException error)
        {
            System.out.println("Файл не найден! " + error);
        }
        catch(IOException error)
        {
            error.printStackTrace();
        }
// ===================================================================================================================
        int [] B = new  int[10];
        System.out.print("\n");
        try {
            // Создание байтового потока ввода:
            FileInputStream num = new FileInputStream("num.txt");

            // Создание буферизированного потока ввода:
            BufferedReader br2 = new BufferedReader(new InputStreamReader(num, "UTF-8"));

            String str2;
            i = 0;
            do {
                str2 = br2.readLine();
                System.out.println(str2);
                B[i] = Integer.valueOf(str2.trim());
                i++;
            } while(!str2.equals("0"));

            br2.close();
        }
        catch(FileNotFoundException | UnsupportedEncodingException error)
        {
            System.out.println("Файл не найден! " + error);
        }
        catch(IOException error)
        {
            error.printStackTrace();
        }
    }
}