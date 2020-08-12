package JavaRushLessons21;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
1. StringTokenizer

Используя StringTokenizer разделить query на части по разделителю delimiter.

Пример:
getTokens("level22.lesson13.task01", ".") == {"level22", "lesson13", "task01"}
 */
public class StringTokinizerTask {
    public static void main(String[] args) {


        Scanner scnner = new Scanner(System.in);
        System.out.println("введите делитель");
        String delim = scnner.nextLine();
        System.out.println("введите строку");
        String query = scnner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(query,delim);
        while (tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }

}
