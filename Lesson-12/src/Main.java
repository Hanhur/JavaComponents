// Метод isEmpty, charAt, trim, indexOf.
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Контактенация (слияние строки) - 2 способа
        String myStr = "Hello World";
        String myName = "Акадение шаг";
        String result;

        // 1 способ - с помощью +
        result = myStr + myName;
        System.out.printf("Контактенация(+): %s\n", result);

        result = myStr + ", " + myName;
        System.out.printf("Контактенация(+): %s\n", result);

        // 2 способ - с помощью concat
        result = myName.concat(" " + myStr);
        System.out.printf("Контактенация(concat): %s\n", result);

        // Сравнение строк
        boolean t;
        myStr = "Hello World";
        myName = "Акадение шаг";

        t = myStr.equals(myName);

        System.out.printf("%b\n", t);

        // isEmpty возвращает истину, если строка не содержит символов, иначе ложь.
        String st = "";
        System.out.printf("Пустая строка? %b\n", st.isEmpty());

        // charAt - возвращает символ из строки по индексу.
        myStr = "Hello World";

        for(int i = 0; i < myStr.length(); i = i + 2)
        {
            System.out.printf("%c ", myStr.charAt(i));
        }

        System.out.println();

        myStr = "Караван";
        int myCount = 0;

        for(int i = 0; i < myStr.length(); i++)
        {
            if(myStr.charAt(i) == 'а')
            {
                myCount++;
            }
        }
        System.out.printf("%d\n", myCount);
    }
}