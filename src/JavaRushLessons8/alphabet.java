package JavaRushLessons8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
3. Задача по алгоритмам.
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.

 */
public class alphabet {
    public static void main(String[] args) throws IOException {
        System.out.println(Sort(Words()));


    }
 public static ArrayList<String> Words() throws IOException {
     ArrayList<String> words = new ArrayList<String>();
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0;i<5;i++){
     String word = reader.readLine();
     words.add(word);
        }
        return words;
 }
 public static ArrayList Sort(ArrayList<String> words){
//        String[] slova = new String[words.size()];
//        for (int i = 0; i< words.size();i++){
//            slova[i]=words.get(i);
//        }
     Collections.sort(words);
     return words;
 }
}

