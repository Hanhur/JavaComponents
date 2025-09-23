// Инкапсуляция, наследование, полиморфизм.
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        CalcSum salary = new CalcSum();

        int a = 150;
        int sum = 10;

        System.out.printf("sum = %d\n", sum);

        salary.sum = a;
        salary.algSum();
    }
}