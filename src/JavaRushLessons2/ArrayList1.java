package JavaRushLessons2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/*
Задача 2. Самая длинная строка

1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.

Требования:
В методе main инициализируй существующее поле strings класса Solution новым ArrayList<>
Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
Программа должна выводить самую длинную строку на экран.
Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
*/
public class ArrayList1 {
    public static void main(String[] args) throws IOException {
        Reader r=new InputStreamReader(System.in);
        BufferedReader reader=new BufferedReader(r);

        ArrayList<String> list=new ArrayList<String>();
        for (int i=0; i <5; i++) {
            String s=reader.readLine();
            list.add(s);
        }

        int max=0;
        for (int i=0; i <list.size(); i++) {
            if(max<list.get(i).length()){
                max = list.get(i).length();
            }
        }
           for(int i=0;i<list.size();i++){
               if(list.get(i).length() == max){
                   System.out.println(list.get(i)+'\n');
               }
           }
    }
}
