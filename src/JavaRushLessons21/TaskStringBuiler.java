package JavaRushLessons21;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*
1. Обращенные слова

В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.

Пример, "мор"-"ром", "трос"-"сорт"
 */
public class TaskStringBuiler {
    public static void main(String[] args) throws IOException {
       // System.out.println(FileReader("1.txt"));
        ReversedWords(FileReader("1.txt"));
    }

    /**
     * @param fileName - имя файла
     * @return - текст файла
     * @throws IOException
     */
    public static String FileReader(String fileName) throws IOException {
        Path path=Paths.get(fileName);
        Scanner scanner=new Scanner(path);
        String text="";
        while (scanner.hasNextLine()) {
            text=text + scanner.nextLine() + '\n';
        }

        return text;
    }

    public static void ReversedWords(String text) {
        text=(text.toLowerCase()).replaceAll("\\pP", "");

        String[] wordsMass=text.split(" ");

        for (int i=0; i < wordsMass.length; i++) {
            for (int j=0; j < wordsMass.length; j++) {
                if(wordsMass[i].equals((new StringBuilder(wordsMass[j]).reverse()).toString())){
                    System.out.println(wordsMass[i] +":"+wordsMass[j]);
                }
            }

        }
    }
}






