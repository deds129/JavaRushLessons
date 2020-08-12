package JavaRushLessons18;

import com.sun.javaws.IconUtil;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/*
2. Подсчет запятых

С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
 */
public class CommaCounter {
    public static void main(String[] args) throws IOException {
        //char a = 44;
        int a = CommaCounter(Reader());
        System.out.println(a);
        System.out.close();
    }

//имя файла с консоли и читаем файл
   static FileInputStream Reader() throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String fileName = reader.readLine();
       FileInputStream fileInputStream = new FileInputStream(fileName);
       return fileInputStream;
    }
    static int CommaCounter(FileInputStream fileInputStream) throws IOException {
        int sumOfCommas =0;
        while (fileInputStream.available()>0){

            int data =fileInputStream.read();
            if(data == 44){
                sumOfCommas++;
            }
        }
        fileInputStream.close();
        return sumOfCommas ;
    }
}
