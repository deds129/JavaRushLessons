package JavaRushLessons21.RegExp;

import java.util.Scanner;

/**
 * author deds129
 * Некоторые способы использовать руглярные выражения
 */
public class Example {
    public static void main(String[] args) {
        String text1 ="A regex pattern matches bla a target string. The pattern is composed of a sequence of atoms. " +
                "An atom is a 111 single point within the regex pattern which it tries to match to the target string. " +
                "The simplest atom is a literal, but bla grouping 111 parts of the pattern to match an atom will require using ( ) as metacharacters." +
                " Metacharacters help form: atoms; quantifiers telling how many atoms bla (and whether it is a greedy quantifier or not);" +
                " a logical OR character, 111 which offers a set of bla alternatives, and a logical NOT character, which negates an atom's existence; " +
                "and backreferences to refer to previous atoms 111  of a completing pattern of atoms. ";
        Splitter(text1);
        HasNext(text1);
    }

    public static void Splitter(String text){  // в качестве параметров послупают люые символы и регулярные выражения;
        String regex1 = "\\.";// разделяем текст по точкам, точка сама точка исчезает
        String regex2 = "[.,]"; //разделяем по запятым и точкам
        String[] arr = text.split(regex2);
        for (String temp:arr){
            System.out.println(temp);
        }
    }

    public static void HasNext(String text){
        Scanner sc = new Scanner(text); //можно использовать в DElimetr
        while(sc.hasNext()){ //если имеется строка
            if(sc.hasNext("bla")){ //выводим слово из Pattern'a
                System.out.println(sc.next());
            }else  if(sc.hasNextInt()){ //выводим число
                System.out.println(sc.nextInt());
            }else{
                sc.next();
            }
        }
    }


}
