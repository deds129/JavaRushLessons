package JavaRushLessons18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Английские буквы

В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
 */
public class EngSumbolCounter {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=FileReader();
        int a=EngSumbCounter(fileInputStream);
        System.out.println("Количество символов Английского алфавита в файле = " + a);
    }

    static FileInputStream FileReader() throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String fileName=reader.readLine();
        FileInputStream fileInputStream=new FileInputStream(fileName);
        return fileInputStream;
    }

    static int EngSumbCounter(FileInputStream fileInputStream) throws IOException {
        int sumbCounter=0;
        while (fileInputStream.available() > 0) {
            int data=fileInputStream.read();
            if ((data > 64 && data < 91) || (data >= 97 && data <= 122)) {
                sumbCounter++;
            }
        }
        fileInputStream.close();
        return sumbCounter;
    }
}