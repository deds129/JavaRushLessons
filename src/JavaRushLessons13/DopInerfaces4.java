package JavaRushLessons13;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/*
4. Запись в файл

1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл, каждую строчку с новой стороки.
 */
public class DopInerfaces4  extends  DopInterfaces2 {
    public static void main(String[] args) throws IOException {
fileWritter(Stringer());

    }

    //собираем слова в массив
    public static ArrayList<String> Stringer() throws IOException {
        System.out.println("Введите словка которые котите занести в файл");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> voc=new ArrayList<String>();
        String word="";

        while (true) {
            word=reader.readLine();
            voc.add(word);
            if (word.equals("exit")){
                voc.remove(voc.size()-1);
                break;}
        }
        return voc;
    }


//запись слова в файл
    public static void fileWritter(ArrayList<String> voc) throws IOException {
        OutputStream outputStream = new FileOutputStream(nameReader());//метод с прошлого задания считываем имя файла
                for (String text : voc) {
                   char a [] = text.toCharArray();
                    for(char m: a ){
                        outputStream.write(m);
                    }
             //ошибка
        }
outputStream.close();
        }

}
