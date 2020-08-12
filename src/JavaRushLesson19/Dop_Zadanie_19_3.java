package JavaRushLesson19;
/*
3. Хуан Хуанович

В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013

Требования:
Класс Solution должен содержать публичную константу PEOPLE типа List<Person>, которая должна быть сразу проинициализирована.
Программа НЕ должна считывать данные с консоли.
Программа должна считывать содержимое файла (используй FileReader).
Поток чтения из файла (FileReader) должен быть закрыт.
Программа должна заполнить список PEOPLE данными из файла.
Программа должна правильно работать с двойными именами, например Анна-Надежда.

 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Dop_Zadanie_19_3{
    public  static  final List<Person2> PERSON = new ArrayList<Person2>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader("1.txt"));
        String str;
        DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy"); //формат переделать можно

        while ((str=reader.readLine())!=null){
            String[] strSplit = str.split("\n");//делим на строки
            for (String info:strSplit){
                String name = info.replaceAll("[(0?[1-9]|[12][0-9]|3[01]).(0?[1-9]|1[012]).((19|20)\\d\\d)]",""); // \\d
                String dateStr = info.replaceAll("\\D+","");
                Date date = dateFormat.parse(dateStr);
                PERSON.add( new Person2(name,date));
            }


        }
        reader.close();
    }
}


