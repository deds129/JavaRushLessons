package JavaRushLesson19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
4. Замена знаков

Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources.
 */
public class MarkChanging {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("1.txt");
        FileWriter writer = new FileWriter("2.txt");
        String str ="";
        while(reader.ready()){
            char subm =  (char) reader.read();
            str+=String.valueOf(subm);
        }
        str = str.replace('.','!');
        writer.write(str);
        reader.close();
        writer.close();
    }

}
