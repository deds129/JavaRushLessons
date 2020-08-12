package JavaRushLessons21;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import static JavaRushLessons15.Statics.FILE_NAME;

/*
3. Составить цепочку слов

В методе main считайте с консоли имя файла, который содержит слова, разделенные пробелом.
В методе getLine используя StringBuilder расставить все слова в таком порядке,
чтобы последняя буква данного слова совпадала с первой буквой следующего, не учитывая регистр.
Каждое слово должно участвовать 1 раз.
Метод getLine должен возвращать любой вариант.
Слова разделять пробелом.
В файле не обязательно будет много слов.

Пример тела входного файла:
Киев Нью-Йорк Амстердам Вена Мельбурн

Результат:
Амстердам Мельбурн Нью-Йорк Киев Вена
 */
public class WorldChain {
    public static void main(String[] args) throws IOException {
        //В методе main считайте с консоли имя файла, который содержит слова, разделенные пробелом.

        //читаем файл козырным способом
        Scanner scanner = new Scanner(Paths.get("1.txt"), StandardCharsets.UTF_8.name());
        //здесь мы можем использовать разделитель, например: "\\A", "\\Z" или "\\z"
        String data = scanner.useDelimiter("\\A").next();
        scanner.close();
        System.out.println(data);

        String[] newWords = getLine(data);
        for (String word:newWords) {
            System.out.print(word + " ");

        }

    }

    public static String[] getLine(String content) {
        //чтобы последняя буква данного слова совпадала с первой буквой следующего, не учитывая регистр.
        String[] sMas=content.split(" ");

        Arrays.sort(sMas);//сортируем массив по алфавиту
        for (int i=0; i <sMas.length ; i++) { //ошибку прокидывает если с файла текст, но если string нет
            for (int j=1; j <sMas.length ; j++) {
                if(sMas[i].charAt(sMas[i].length()-1)==sMas[j].toLowerCase().charAt(0)){
                    String c="";
                    c=sMas[i+1];
                    sMas[i+1]=sMas[j];
                    sMas[j]=c;
                    if(i>=sMas.length) i--;
                }
            }
        }
        return sMas;
        }

    }

