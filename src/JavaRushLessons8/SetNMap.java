package JavaRushLessons8;

/*
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.

Программа не должна выводить текст на экран.
Программа не должна считывать значения с клавиатуры.
Класс Solution должен содержать только три метода.
Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
 */
import java.awt.*;
import java.util.*;

public class SetNMap {



    public static HashSet<Integer> createSet(){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<20;i++){
           // int random = (int) (1+Math.random()*20);
            set.add(i);
        }
       System.out.println(set);
        return set;
    }

    public static HashSet<Integer> numbersMoreThan10(HashSet<Integer> set) {
       // HashSet<Integer> newSet = createSet();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {

            if (iterator.next()<=10) iterator.remove();

        }

        return set;
    }









    public static void main(String[] args) {
        createSet();
        System.out.println(numbersMoreThan10(createSet()));
    }
}


