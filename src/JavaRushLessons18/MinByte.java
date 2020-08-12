package JavaRushLessons18;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
1. Максимальный байт

Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
 */
public class MinByte {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> byteList = new ArrayList<Integer>();

        try {
            System.out.println("Введите названия файла");
          String fileName =  bufferedReader.readLine();

            FileInputStream inputstream = new FileInputStream(fileName);

            while(inputstream.available()>0) {
            int data = inputstream.read();
            byteList.add(data);
                Collections.sort(byteList);
                inputstream.close();
            }


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }

        System.out.println("Самый большой байт равен: " + byteList.get(+byteList.size()-1));
    }
}
