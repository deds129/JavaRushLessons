package JavaRushLessons2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
5. Удвой слова

1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c → a,a,b,b,c,c.
3. Используя цикл for, выведи результат на экран, каждое значение с новой строки.
 */
public class ListT3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list=new ArrayList<String>();
        for (int i=0; i < 5; i++) {
            String s=reader.readLine();
            list.add(s);
        }
       // for (int i=0; i < list.size(); i++) {
      //      System.out.println(list.get(i));
       // }
        list=doubleValues(list);

            System.out.println(list);

    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> list2 = new ArrayList<String>();
        for(int i = 0; i<list.size();i++){
            String m = list.get(i);
            list2.add(m);
            list2.add(i+1,m);
        }
        return list2;
    }
}


