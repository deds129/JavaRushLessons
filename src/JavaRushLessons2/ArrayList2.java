package JavaRushLessons2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/*
Задача 4. 10 строчек в начало списка

1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл, выведи содержимое на экран, каждое значение с новой строки.

Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна добавлять строки в начало списка.
4. Программа должна выводить список на экран, каждое значение с новой строки.

 */
public class ArrayList2 {
    public static void main(String[] args) throws IOException {
        Reader r=new InputStreamReader(System.in);
        BufferedReader reader=new BufferedReader(r);

        ArrayList<String> str =new ArrayList<String>();

        for (int i=0; i <10; i++) {
            String z=reader.readLine();
            str.add(0,z);
        }
        for (int i=0; i< str.size();i++){
            System.out.println(str.get(i));
        }
    }
}
