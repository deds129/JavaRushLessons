package JavaRushLessons2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;

/*
4. Буква «р» и буква «л»

1. Создай список слов, заполни его самостоятельно.
2. Метод fix() должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
 */
//p.s спиздил и исправил код! не стыдно!(нет)
public class ListT2{
        public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    Collections.addAll(strings,"роза","лоза","лира","мера","вода","упор");

   fix(strings);

    for (String string : strings) {
        System.out.println(string);
    }
}

        public static ArrayList<String> fix(ArrayList<String> strings) {

            for(int i = 0; i<strings.size(); i++) {
                if (strings.get(i).contains("р") && strings.get(i).contains("л")){
                    continue;
                }
                else if (strings.get(i).contains("р")){
                    strings.remove(i);
                    i++;
                }
                else if (strings.get(i).contains("л")) {
                    strings.add(i, strings.get(i));
                    i++;
                }
            }
            return strings;
        }
}


