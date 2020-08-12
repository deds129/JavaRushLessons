package JavaRushLesson19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
3. Знакомство с тегами

Задача: Считайте с консоли имя файла, который имеет HTML-формат
Пример:
Info about Leela <span xml:lang="en" lang="en"><b><span>Turanga Leela
</span></b></span>

Первым параметром в метод main приходит тег. Например, "span"
Вывести на консоль все теги, которые соответствуют заданному тегу
Каждый тег на новой строке, порядок должен соответствовать порядку следования в файле
Количество пробелов, \n, \r не влияют на результат
Файл не содержит тег CDATA, для всех открывающих тегов имеется отдельный закрывающий тег, одиночных тегов нету
Тег может содержать вложенные теги

Пример вывода:
<span xml:lang="en" lang="en"><b><span>Turanga Leela</span></b></span>
<span>Turanga Leela</span>

Шаблон тега:
<tag>text1</tag>
<tag text2>text1</tag>
<tag
text2>text1</tag>

text1, text2 могут быть пустыми
 */

/**
 * Писал не сам :(
 */
public class Tags {
    public static void main(String[] args) throws IOException {
//пишем нужный нам тег
tagFinder(fileReader());
    }
    //метод для чтения файла
    public static ArrayList<Character> fileReader() throws IOException {
        System.out.println("Введите название файла в формате <filename>.html");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        ArrayList<Character> listOfSumb = new ArrayList<Character>();

        try(BufferedReader fileReader = new BufferedReader(new FileReader(fileName))){
            int sumb;
        while ((sumb = fileReader.read()) != -1){
        listOfSumb.add((char)sumb);
        }
            return listOfSumb;
        }catch (IOException ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public static void tagFinder(ArrayList<Character> listOfChars) throws IOException {
        System.out.println("Введите тэг");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tag = reader.readLine();
        char[] tagChar = tag.toCharArray();

        int x =0;
        int pointer = 0;
        for (int i = 0;i<listOfChars.size();i++){
            if (listOfChars.get(i)==tagChar[0]){
                int comparsion =1;
                for(int j=1;j<tagChar.length;j++){
                    if (listOfChars.get(i + j) == tagChar[j]) comparsion++;
                }
                if (comparsion==tagChar.length){
                    if (listOfChars.get(i-1)=='<'){
                        if (x==0) pointer =i;
                        x++;
                    }
                    if((listOfChars.get(i-1)=='/') && (x !=0)){
                        x--;
                        if (x==0){
                            for(int j = pointer-1;j<i+tagChar.length+1;j++){
                                if (listOfChars.get(j) != 10) {
                                    System.out.print(listOfChars.get(j));
                                }
                            }
                            System.out.println();
                            i=pointer+tagChar.length;
                        }
                    }
                }
            }
        }
    }



}



