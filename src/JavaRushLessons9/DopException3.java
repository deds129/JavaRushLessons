package JavaRushLessons9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
5. Гласные и согласные буквы

Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1) первая строка содержит только гласные буквы
2) вторая - только согласные буквы и знаки препинания из введённой строки.
Символы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
Надо было сначала разбить строку на чары и закинуть их в список а потом уже заменить......но мне лень))
 */
public class DopException3 {
    public static void main(String[] args) throws IOException {
String myLine = lineReader();
        System.out.println(onlyGlasn(myLine));
        System.out.println(onlySoglasn(myLine));
    }

    public static String lineReader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        return line;
    }

    public static String onlyGlasn(String line){
        char[] glasnie = {'а','е','и','у','о','э','я','ю','ы','ё'};
        for(int i = 0;i<glasnie.length;i++){
           line= line.replace(glasnie[i], ' ');
        }

        return line ;
    }
    public static String onlySoglasn(String line){
        char[] soglasnyie = {'й','ц','к','н','г','ш','щ','з','х','ъ',
                'ф','в','п','р','л','д','ж','ч','с','м','т','ь','б'};
        for(int i = 0;i<soglasnyie.length;i++){
            line= line.replace(soglasnyie[i], ' ');
        }
        return line;
    }
}
