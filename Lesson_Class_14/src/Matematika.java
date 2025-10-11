public class Matematika {
    private int dln, wid, sq;
    private int countRect;
    private int x1, x2, y1, y2;

    public int calcSquare(int a, int b)
    {
        dln = a;
        wid = b;
        sq = dln * wid;
        return sq;
    }

    public int calcSquare(int a)
    {
        dln = a;
        sq = dln * dln;
        return sq;
    }

    public double calcSquare(double a, double b, double c)
    {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    // Создание конструктора
    Matematika()
    {
        countRect = 1;
    }

    Matematika(int c)
    {
        countRect = c;
    }
     // Метод расчета площади немкольких квадратов
    public int calcSquareRects(int a)
    {
        dln = a;
        sq = (dln * dln) * countRect;
        return sq;
    }

    public int getCountRect()
    {
        return countRect;
    }

    public int drawRect(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

        return  this.x1 + this.y1 + this.x2 + this.y2;
    }
}