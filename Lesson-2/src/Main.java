import java.util.Scanner; // Подключение библиотеки
import java.io.*; // Подключение всех библиотек io

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a, b, sum;
        a = 10;
        b = 20;
        sum = a + b;

        System.out.print("Сумма чисел a и b = ");
        System.out.print(sum);

        //==============================================================================

        System.out.print("\nВвндите первое число: ");
        a = scanner.nextInt();

        System.out.print("Ввндите второе число: ");
        b = scanner.nextInt();

        sum = a * b;
        System.out.printf("Произведение чисел a * b = %d\n", sum);
        System.out.printf("Произведение чисел %d * %d = %d\n", a, b, sum);

        // =============================================================================

        int heightMy, weightMy, weightCalc;

        System.out.print("Ввндите свой рости: ");
        heightMy = scanner.nextInt();

        System.out.print("Ввндите свой вес: ");
        weightMy = scanner.nextInt();

        weightCalc = heightMy - 100; // Рекомендуемый вес = мой текущий рост - 100. 170 - 100 = 70

        if(weightMy > weightCalc)
        {
            System.out.print("Ваш вес больше нормы");
        }

        //==============================================================================

        int number;
        System.out.print("Введите любое целое число(положительное или отрицательное :) ");
        number = scanner.nextInt();

        if(number > 0)
        {
            System.out.print("число - положительное\n");
        }
        else
        {
            System.out.print("число - отрицательное\n");
        }

        // ================================================================================

        int day;
        System.out.print("Введите число от 1 до 7 и мы определим день недели ");
        day = scanner.nextInt();

        switch(day)
        {
            case 1: System.out.print("Понедельник \n"); break;
            case 2: System.out.print("Вторник \n"); break;
            case 3: System.out.print("Среда \n"); break;
            case 4: System.out.print("Четверг \n"); break;
            case 5: System.out.print("Пятница \n"); break;
            case 6: System.out.print("Суббота \n"); break;
            case 7: System.out.print("Воскресение \n"); break;
            default: System.out.print("Вы из другой планеты \n");
        }
    }
}