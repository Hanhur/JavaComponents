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

        FileWriter fw = new FileWriter(fullName, true);
        System.out.printf("Введите строку для записи в файл\n");
        String myStr = scanner.nextLine();
        fw.write("\n");

        for(int i = 0; i < myStr.length(); i++)
        {
            fw.write(myStr.charAt(i));
        }

        fw.close();
    }
}