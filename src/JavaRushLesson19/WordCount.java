package JavaRushLesson19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources.
 */
public class WordCount {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("1.txt");
        int count=0;
        int a;
        String str="";
      while (reader.ready()) {
          char subm=(char) reader.read();
          str+=String.valueOf(subm).toLowerCase();
      }
        str = str.replaceAll("\\p{Punct}", " ");
        str = str.replaceAll("\n", " ");
        //System.out.println(str);

        String[] mas = str.split(" ");
        for(String s: mas){
            s = s.trim();
            if (s.equals("world"))
                count++;
      }
        System.out.println(count);
    }

}
