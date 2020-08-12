package JavaRushLessons2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;

/*
3. Слово «именно»

1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку,
содержащую слово «именно».
3. Используя цикл for, вывести результат на экран.
Каждый элемент списка с новой строки.

Требования:
Программа не должна считывать данные с клавиатуры.
Объяви переменную типа список строк и сразу проинициализируй ee.
Добавь в список слова: «мама», «мыла», «раму».
После каждого слова добавь в список строку, содержащую слово «именно».
Выведи элементы списка на экран, каждый с новой строки.
 */
public class ListT1 {
    public static void main(String[] args) {
        Reader r=new InputStreamReader(System.in);
        BufferedReader reader=new BufferedReader(r);

        ArrayList<String> list=new ArrayList<String>();
        Collections.addAll(list,"мама","мыла","раму");
        for (int i = 0; i<list.size();i++){
            System.out.println(list.get(i)+ " " + "именно");
        }

    }
}
