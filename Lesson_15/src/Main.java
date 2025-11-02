import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //A a = new A();
        //B b = new B();

        //a.sum();
        //b.sum();
        //b.multiply();
        //a.kv();
        //b.kv();

        //AbstractAnimals ab = new AbstractAnimals();
        //ab.sum();

        //PotomokAbstractAnimals potomokAbs = new PotomokAbstractAnimals();
        //potomokAbs.sum();

        // ===================================================================================

        int f;

        Human personId1 = new Human();

        String fio = new String();
        String date = new String();
        String tel = new String();
        String country = new String();
        String city = new String();
        String address = new String();

        System.out.printf("Введите данные: \n");
        System.out.printf("ФИО: \n"); fio = scanner.nextLine();
        System.out.printf("Дата рождения: \n"); date = scanner.nextLine();
        System.out.printf("Телефон: \n"); tel = scanner.nextLine();
        System.out.printf("Страна: \n"); country = scanner.nextLine();
        System.out.printf("Город: \n"); city = scanner.nextLine();
        System.out.printf("Адрес: \n"); address = scanner.nextLine();

        personId1.setData(fio, date, tel, country, city, address);

        System.out.printf("Какой параметр вывести: 1 - ФИО, 2 - Дата рождения, 3 - Телефон, 4 - Страна, 5 - Город, 6 - Адрес, 7 - Анкета");

        f = scanner.nextInt();

        switch(f)
        {
            case 1: System.out.printf("ФИО - %s\n", personId1.getFio()); break;
            case 2: System.out.printf("Дата рождения - %s\n", personId1.getDate()); break;
            case 3: System.out.printf("Телефон - %s\n", personId1.getTel()); break;
            case 4: System.out.printf("Страна - %s\n", personId1.getCountry()); break;
            case 5: System.out.printf("Город - %s\n", personId1.getCity()); break;
            case 6: System.out.printf("Адрес - %s\n", personId1.getAddress()); break;
            case 7: System.out.printf("Анкета - %s\n", personId1.getAnketa()); break;
            default: System.out.printf("Error\n");
        }
    }
}