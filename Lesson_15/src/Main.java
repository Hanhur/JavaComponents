import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        A a = new A();
        B b =new B();
        a.sum();
        b.sum();
        b.multiply();
        a.kv();
        b.kv();

        AbstractAnimals ab = new AbstractAnimals();
    }
}