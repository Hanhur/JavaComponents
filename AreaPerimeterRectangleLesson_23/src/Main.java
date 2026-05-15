import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numMin = 2, numMax = 40, temp, j;
        int n = random.nextInt((numMax - numMin) + 1) + numMin;
        int[] arr = new int[n];

        System.out.printf("\n Length of Array arr is = %d", arr.length);
        numMin = -10;
        numMax = 150;

        for (int i = 0; i < n; i++)
        {
            arr[i] = random.nextInt((numMax - numMin) + 1) + numMin;
        }

        for (int i = 1; i < arr.length; i++)
        {
            temp = arr[i]; // Скопировать помеченный элемент
            j = i; // Начать перемещения с i
            while (j > 0 && arr[j - 1] >= temp) // Пока не найден меньший элемент
            {
                arr[j] = arr[j - 1]; // Сдвинуть элемент вправо
                --j; // Перейти на одну позицию влево
            }
            arr[j] = temp; // Вставить помеченный элемент
        }
        System.out.println("\n\narr after sort = " + Arrays.toString(arr));

        /*
        int area, perimeter;

        Point A = new Point(10, 5);
        Point B = new Point(10, 15);
        Point C = new Point(30, 15);
        Point D = new Point(30, 5);

        Rectangel objRect = new Rectangel(A, B, C, D);
        Graphics objMain = new Graphics(objRect);

        area = objMain.areaRectangle();
        System.out.printf("\nПлощадь = %d", area);

        perimeter = objMain.rectangel.perimetorRectangle();
        System.out.printf("\nПериметр = %d", perimeter);

        // System.out.printf("\nКоордината центра = (%d,%d)", objRect.centerRectangle().x, objRect.centerRectangle().y);

        // Другой вариант
        Point pointCenter = new Point();
        pointCenter = objRect.centerRectangle();
        System.out.printf("\nКоордината центра = (%d,%d)", pointCenter.x, pointCenter.y);
         */
    }
}

class Graphics {
    Rectangel rectangel = new Rectangel();
    int sum;

    Graphics(Rectangel rectangel)
    {
        this.rectangel = rectangel;
    }

    public int areaRectangle()
    {
        sum = (rectangel.rect[1].y - rectangel.rect[0].y) * (rectangel.rect[2].x - rectangel.rect[1].x);
        return sum;
    }
}

class Rectangel {
    Point[] rect = new Point[4];
    Point pointCenter = new Point();

    Rectangel(Point A, Point B, Point C, Point D)
    {
        rect[0] = A;
        rect[1] = B;
        rect[2] = C;
        rect[3] = D;
    }

    Rectangel(){}

    public int perimetorRectangle()
    {
        return (rect[1].y - rect[0].y) * 2 + (rect[2].x - rect[1].x) * 2;
    }

    public Point centerRectangle()
    {
        pointCenter.x = rect[0].x + (rect[3].x - rect[0].x) / 2;
        pointCenter.y = rect[0].y + (rect[1].y - rect[0].y) / 2;

        return pointCenter;
    }
}

class Point {
    int x, y;
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    Point(){}
}