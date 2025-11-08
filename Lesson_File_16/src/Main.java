import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String fileName = "test.txt";
        String fullName = "";
        String dirName = System.getProperty("user.dir");
        fullName = dirName + File.separator + fileName;
        System.out.println("File path : " + fullName);
        File file = new File(fullName);

        InputStream in = null;
        OutputStream out = null;

        if(!file.exists())
        {
            try{
                if(file.createNewFile())
                {
                    System.out.println("File created!");
                }
                else
                {
                    System.out.println("Something Wrong!");
                }
            } catch(IOException ex)
            {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            System.out.println("File already exists!");
        }

        // Запись в файл. Вывод в файл.
        FileWriter fw = new FileWriter(fullName, false);
        System.out.printf("Введите строку для записи в файл\n");
        String myStr = scanner.nextLine();
        //fw.write("\n");

        for(int i = 0; i < myStr.length(); i++)
        {
            fw.write(myStr.charAt(i));
        }

        //fw.close(); // закрыли поток.

        // ==================================================================

        int n, x1, x2;
        System.out.printf("Введите количество диапазонов: \n");
        n = scanner.nextInt();

        for(int i = 0; i < n; i++)
        {
            System.out.printf("Введите %d - й диапазон: \n", i + 1);
            x1 = scanner.nextInt();
            x2 = scanner.nextInt();

            if(x2 > x1)
            {
                System.out.printf("Длина %d - го диапазон = %d: \n", i + 1, x2 - x1);
                fw.write("\n");
                fw.write(String.valueOf(x2 - x1));
            }
            else
            {
                System.out.printf("Длину данного диапазона расчитать невозможно\n");
            }
        }

        fw.close();

        // Чтение из файла. Ввод данных из файла
        //if(myFile.exists() == true)
        //{
            FileReader fr = new FileReader(fullName);
            StringBuilder strbuil = new StringBuilder();
            System.out.printf("Length of file is %d \n", fullName.length());

            for(int i = 0; i < fullName.length(); i++)
            {
                strbuil.append((char) fr.read());
            }

            fr.close();
            System.out.printf("Contents of file is %s \n", strbuil);
        //}
    }
}