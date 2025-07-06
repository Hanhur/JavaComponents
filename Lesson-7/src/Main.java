// Массивы
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        /*
        int n, result1, result2; // Кол-во учеников

        System.out.println("Введите кол-во учеников (для чистоты эксперимента введите 100)");
        n = scanner.nextInt();

        result1 = n * 2;
        result2 = (int) Math.ceil((n * 0.2) / 0.9);
        System.out.println("Если 100% учеников имеют вес меньше 30кг нам понадобится " + result1 + " пирожков и "
                + result2 + " пакетов молока, (молоко мы округляем в большую соторну, чтобы всем хватило)");

        result1 = (int) (n * 0.4 + n * 0.6 * 2);
        result2 = (int) Math.ceil((n * 0.6 * 0.2) / 0.9);
        System.out.println("Если 60% учеников имеют вес меньше 30кг нам понадобится " + result1 + " пирожков и "
                + result2 + " пакетов молока, (молоко мы округляем в большую соторну, чтобы всем хватило)");

        result1 = (int) (n * 0.99 + n * 0.01 * 2);
        result2 = (int) Math.ceil((n * 0.01 * 0.2) / 0.9);
        System.out.println("Если 1% учеников имеют вес меньше 30кг нам понадобится " + result1 + " пирожков и "
                + result2 + " пакетов молока, (молоко мы округляем в большую соторну, чтобы всем хватило)");
         */


//        int [] array;
//
//        array = new int[] {1, 15, 80, -5, 10, -40, 0, 70, -9, 4};
//
//        int n = 10, i, sum, minus;

//        System.out.printf("1й элемент массива: %d\n", array[0]);
//        System.out.printf("10й элемент массива: %d\n", array[9]);
//
//        System.out.print("Какой элемент массива вы хотите вывести\n");
//        i = scanner.nextInt();
//        System.out.printf("%dй элемент массива: %d\n", i, array[i - 1]);

//        System.out.print("Элемента массива array\n");
//        for(i = 0; i < n; i++)
//        {
//            System.out.printf(" %d", array[i]);
//        }

        // Найти сумму элементов массива
//        sum = 0;
//        for(i = 0; i < n; i++)
//        {
//            sum += array[i];
//        }
//        System.out.printf("Сумма = %d", sum);

        // Найти количество отрицаательных элементов массива
//        minus = 0;
//        for(i = 0; i < n; i++)
//        {
//            if(array[i] < 0)
//            {
//                minus++;
//            }
//        }
//        System.out.printf("Количество отрицательных элементов массива = %d", minus);

        int[] arrays = new int[100];
        int n, i, flag;

        System.out.print("Введите размерность массива (не болле 100)\n");

        n = scanner.nextInt();

        if(n <= 100)
        {
            System.out.print("Введите элементы массива\n");
            for (i = 0; i < n; i++)
            {
                arrays[i] = scanner.nextInt();
            }

            System.out.print("Наш массива: \n");
            for (i = 0; i < n; i++)
            {
                System.out.printf(" %d", arrays[i]);
            }

            for (i = 0; i < n; i++)
            {
                if(arrays[i] == 0)
                {
                    System.out.print("Есть элементы со значением 0\n");
                    break;
                }
            }
        }
    }
}