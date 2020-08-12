package JavaRushLessons2;
/*
Задача 5. Удали последнюю строку и вставь её в начало

1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл, выведи содержимое на экран, каждое значение с новой строки.

Требования:
Объяви переменную типа список строк и сразу проинициализируй ee.
Программа должна считывать 5 строк с клавиатуры.
Удали последнюю строку и вставь её в начало. Повторить 13 раз.
Программа должна выводить список на экран, каждое значение с новой строки.

 */
import  java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) throws IOException {
        Reader r=new InputStreamReader(System.in);
        BufferedReader reader=new BufferedReader(r);


        ArrayList<String> list=new ArrayList<String>();
        for (int i=0; i <5; i++) {
            String s=reader.readLine();
            list.add(s);
        }
        for(int i = 0;i<13;i++){
            String s =list.get(4);
            list.remove(4);
            list.add(0,s);
        }
        for (int i =0 ; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
