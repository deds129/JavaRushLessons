package JavaRushLessons8;

import java.util.HashSet;
import java.util.Set;

/*1. 20 слов на букву «Л»
 Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
        */
public class SetandMap {
    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();
        char[] lib = new char[33];

        for (int j=0;j<lib.length;j++) {
            int a = 430; //ебучая таблица!!!
            a +=j;
         lib[j] = (char)a;
        }




        for (int i = 0; i<20;i++){

                int a=(int) (Math.random() * 33);
                int b =(int) (Math.random() * 33);
                int c =(int) (Math.random() * 33);

            String word = "Л" + lib[a]+lib[b]+ lib[c] ;
            set.add(word);
        }
        System.out.println(set);
    }
}
