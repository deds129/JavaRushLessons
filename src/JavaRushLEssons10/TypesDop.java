package JavaRushLEssons10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
9. Одинаковые слова в списке

Ввести с клавиатуры в список 20 слов. Нужно подсчитать количество одинаковых слов в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка,
а второй – число, сколько раз данная строка встречалась в списке. Вывести содержимое словаря на экран.

В тестах регистр (большая/маленькая буква) не влияет на результат.
 */
public class TypesDop {
    public static void main(String[] args) throws IOException {
        //вызов методов
        Reader();
    }
    // лист --> запись слов
    private static void Reader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> voc =new ArrayList<String>();
        System.out.println("Введите количество слов: ");
        int a = 0;

        String a1= reader.readLine();
        a=Integer.parseInt(a1);


        for (int i = 0;i<a;i++){
        String word = reader.readLine();
        voc.add(word);
    }}
    //алгоритм
}
