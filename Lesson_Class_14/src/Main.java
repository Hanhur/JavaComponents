import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int dln, wid, sq;

        Matematika myMath = new Matematika(10); // Мы создали объект myMath класс Matematika
        City prague = new City();
        City moskva = new City();

        // 1. Расяет площади прямоугольника
        System.out.printf("Ввудите длину и ширину прямоугольника ");

        dln = scanner.nextInt();
        wid = scanner.nextInt();
        sq = myMath.calcSquare(dln, wid);

        System.out.printf("Площадь прямоугольника = %d\n", sq);

        // 2. Расяет площади квадрата
        System.out.printf("Введите длину квадрата ");

        dln = scanner.nextInt();
        sq = myMath.calcSquare(dln);

        System.out.printf("Площадь квадрата = %d\n", sq);

        // 3. Расчет площади нескольких квадрата одинакого размера
        System.out.printf("Введите длину квадрата (Площадь нескольких квадратов)");

        dln = scanner.nextInt();
        sq = myMath.calcSquareRects(dln);

        System.out.printf("Площадь %d квадратов = %d\n", myMath.getCountRect(), sq);

        // 4. Расчет площади треугольника
        double a, b, c, sq1;

        System.out.println("Введите стороны треугольника : ");

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        sq1 = myMath.calcSquare(a, b, c);

        System.out.printf("Площадь треугольника : " + sq1);
    }
}