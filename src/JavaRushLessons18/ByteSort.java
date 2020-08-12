package JavaRushLessons18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
5. Сортировка байт

Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода
 */
public class ByteSort {

    public static void main(String[] args) throws IOException {
        List<Integer> bytesList=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя файла");
        String bytes=reader.readLine();
        FileInputStream fileInputStream=new FileInputStream(bytes);

        while (fileInputStream.available() > 0) {
            int data=fileInputStream.read();
            if (!bytesList.contains(data)) {
                bytesList.add(data);
            }
            Collections.sort(bytesList);
        }
        for (Integer a: bytesList) {
            System.out.print(a + ", ");
        }


        System.out.close();
        reader.close();
        fileInputStream.close();
    }
}
