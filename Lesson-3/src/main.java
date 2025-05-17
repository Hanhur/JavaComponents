import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // Пример 1. Вывести 3 числа и поместить кол-во отрицательных чисел
        /*
            Описание алгоритма
            1. Ввести с клавиатуры значения 3х переменных: x1, x2, x3
            2. Обнуление счетчика count = 0
            3. Если x1 < 0, то count = count + 1
            4. Если x2 < 0, то count = count + 1
            5. Если x3 < 0, то count = count + 1
            6. Вывод результата count
         */
        int x1, x2, x3, count;
        int i, n;
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.print("Введите первое число: ");
        x1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        x2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        x3 = scanner.nextInt();

        count = 0;

        if(x1 < 0) count = count + 1; // count++;
        if(x2 < 0) count = count + 1;
        if(x3 < 0) count = count + 1;

        System.out.printf("Результат. Кол-во отрицательнных чисел = %d", count);
         */
        /*
        // Пример 2. Вывести 3 раза фразу "Группа Java 112"
        n = 3;
        for(i = 0; i < n; i++)
        {
            System.out.println("Группа Java 112");
        }

        // Пример 2. Вывести n раза фразу "Группа Java 112"
        System.out.print("Введи N: ");
        n = scanner.nextInt();
        for(i = 0; i < n; i++)
        {
            System.out.println("Группа Java 112");
        }
         */
        // Ввести 3 целых числа x1, x2, x3. Найти максимальное значение max.
        // С помощью цикла вывести число от 0 до max
        int max = 0;
        System.out.print("Введите 3 целых числа: ");
        x1 = scanner.nextInt();
        x2 = scanner.nextInt();
        x3 = scanner.nextInt();

        if(x1 > x2 && x1 > x3)
        {
            max = x1;
        }
        else if(x2 > x1 && x2 > x3)
        {
            max = x2;
        }
        else if(x3 > x1 && x3 > x2)
        {
            max = x3;
        }
        System.out.printf("Результат: %d\n", max);

        for(i = 0; i <= max; i++)
        {
            System.out.printf(" %d", i);
        }
    }
}