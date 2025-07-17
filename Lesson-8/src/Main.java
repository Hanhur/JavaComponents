// Методы substring, charAt, split в Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        char sym;
        char c;
        sym = 'a';
//        System.out.printf("Символ sym = %c\n", sym);
//
//        System.out.printf("Введите символ ");
//        c = scanner.next().charAt(0);
//        System.out.printf("Символ = %c", c);
//
//        if(c == 'п' || c == 'm')
//        {
//            System.out.println("Пондельник\n");
//        }
//        else if(c == 'в' || c == 't')
//        {
//            System.out.println("Вторник\n");
//        }

        // Работа со строками - String
        String message = "Hello World!!!";
        System.out.printf("%s\n", message.toUpperCase());
        System.out.printf("%s\n", message.substring(0, 3));

        int w;
        w = message.length();
        System.out.printf("%d", w);
    }
}