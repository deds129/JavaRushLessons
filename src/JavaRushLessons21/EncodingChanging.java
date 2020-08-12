package JavaRushLessons21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
2. Смена кодировки

В метод main первым параметром приходит имя файла, тело которого в кодировке Windows-1251.
В метод main вторым параметром приходит имя файла, в который необходимо записать содержимое первого файла в кодировке UTF-8.
 */
public class EncodingChanging {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("1.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("2.txt");

        if (fileInputStream.available()>0){
            byte[] buffer2 = new byte[fileInputStream.available()];
            fileInputStream.read(buffer2);
            String s = new String(buffer2,"windows-1251");
            buffer2 = s.getBytes("utf-8");
            fileOutputStream.write(buffer2);
        }
    }
}
