import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

//        float m, san, dec, mil, mili;
//
//        System.out.print("Введите количество метров: ");
//        m = scanner.nextFloat();
//
//        san = m * 100;
//        dec = m * 10;
//        mil = m * 1000;
//        mili = m / 1600;
//
//        System.out.printf("san: %f\n", san);
//        System.out.printf("dec: %f\n", dec);
//        System.out.printf("mil: %f\n", mil);
//        System.out.printf("mili: %f\n", mili);

        //=====================================================================

//        int num1, num2, num3, num123;
//
//        System.out.print("Введите 3 целых числа от 0 до 9: ");
//        num1 = scanner.nextInt();
//        num2 = scanner.nextInt();
//        num3 = scanner.nextInt();
//
//        num123 = (num1 * 10 + num2) * 10 + num3;
//        System.out.printf("num123: %d\n", num123);

        //====================================================================
//
//        int number, number1, number2, number3, number4, result;
//
//        System.out.print("Введите 4 целых числа: ");
//        number = scanner.nextInt();
//
//        number1 = number / 1000;
//        number = number % 1000;
//
//        number2 = number / 100;
//        number = number % 100;
//
//        number3 = number / 10;
//        number = number % 10;
//
//        number4 = number;
//
//        result = number1 * number2 * number3 * number4;
//        System.out.printf("Произведение цифр 4х значного числа = %d", result);

        //========================================================================

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Java с помощью for");
        }

        int k = 0;
        while(k < 5)
        {
            System.out.println("Java с помощью while");
            k++;
        }

        int j = 0;
        do {
            System.out.println("Java с помощью do while");
            j++;
        }while(j < 5);
    }
}