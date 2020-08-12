package JavaRushLessons8;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
1. HashSet из растений

Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
 */
public class Collections1 {
    public static void main(String[] args) {
     Set<String> set = new HashSet<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Collections.addAll(set,"арбуз","банан","вишня","груша","дыня","ежевика","жень-шень","земляника","ирис","картофель");
        for(String first:set){
            System.out.println(first);
            //или же
//            Iterator<String> iterator = set.iterator();
//            while (iterator.hasNext()){
//                String first1 = iterator.next();
//                System.out.println(first1);
//            }

        }
    }
}
