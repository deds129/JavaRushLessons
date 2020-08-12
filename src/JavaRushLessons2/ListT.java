package JavaRushLessons2;
/*
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList, выведи эти три списка на экран.
Сначала тот, который для x%3, потом тот, который для x%2, потом последний.


Объяви и сразу проинициализируй 4 переменных типа ArrayList<Integer> (список целых чисел). Первый список будет главным, а остальные - дополнительными.
Считать 20 чисел с клавиатуры и добавить их в главный список.
Добавить в первый дополнительный список все числа из главного,
которые нацело делятся на 3.

Добавить во второй дополнительный список все числа из главного,
которые нацело делятся на 2.

Добавить в третий дополнительный список все остальные числа из главного.

Метод printList должен выводить на экран все элементы переданного списка
, каждый с новой строки.

Программа должна вывести три дополнительных списка, используя метод printList.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class ListT {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int i=0; i < 20; i++) {
            String s=reader.readLine();
            list.add(Integer.parseInt(s));//приводим к Integer
        }
        ArrayList<Integer> three=new ArrayList<Integer>();
        ArrayList<Integer> two=new ArrayList<Integer>();
        ArrayList<Integer> other=new ArrayList<Integer>();

        for (int i=0; i < list.size(); i++) {
            Integer x=list.get(i);
            if (x % 3 == 0) {
                three.add(x); }
            else if ((x % 2 == 0) && (x % 3 == 0)){
                other.add(x);
            }
            else if (x % 2 == 0) {
                two.add(x);}

             else {
                other.add(x);
            }
        }
        printList(three);
        printList(two);
        printList(other);

    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) { System.out.println(list.get(i)); }
    }

    }

