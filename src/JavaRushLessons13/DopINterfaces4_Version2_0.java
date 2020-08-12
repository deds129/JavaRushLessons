package JavaRushLessons13;

import java.io.*;
///https://ru.stackoverflow.com/questions/902885/%D0%97%D0%B0%D1%87%D0%B5%D0%BC-%D0%BA%D0%BB%D0%B0%D1%81%D1%81%D1%83-string-%D0%BC%D0%B5%D1%82%D0%BE%D0%B4-getbytes-%D0%B5%D1%81%D0%BB%D0%B8-%D0%B2-java-byte-%D1%80%D0%B5%D0%B4%D1%83%D1%86%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B9
public class DopINterfaces4_Version2_0 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите название файла для записи текста ");
        String fileName  = reader.readLine();
        String str  = reader.readLine();

        OutputStream newFile = new FileOutputStream(fileName);

        while (!str.equals("exit")){ //разница?

            newFile.write((str +"\r\n").getBytes()); // это что
            str  = reader.readLine();
        }

        newFile.write((str +"\r\n").getBytes()); // так можно?

        newFile.close();
        reader.close();
    }
}
