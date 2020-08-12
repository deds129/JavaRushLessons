package JavaRushLesson19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
3. Выделяем числа

Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources.

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
 */
public class Chifri {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("1.txt");
        FileWriter writer = new FileWriter("2.txt");

       String str = "";

        while(reader.ready()){
           char subm =  (char) reader.read();
            str+=String.valueOf(subm);
        }
        str = str.replaceAll("\\p{Punct}", " ");
        str = str.replaceAll("\n", " ");
        String[] newStr  = str.split(" ");
        List<String> stringList = new ArrayList<String>();

        for (String s : newStr) {
            if (s.matches("[-+]?\\d+")){
               writer.write(s + " ");
            }
        }

        reader.close();
        writer.close();
    }
}
