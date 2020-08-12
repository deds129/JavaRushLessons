package JavaRushLessons8;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
4. Удалить всех людей, родившихся летом

Создать словарь (Map<String, Date>)
и занести в него десять записей по принципу:
«фамилия» - «дата рождения».
 Удалить из словаря всех людей, родившихся летом.

 Требования:
Программа не должна выводить текст на экран.
Программа не должна считывать значения с клавиатуры.
Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String,
Date состоящий из 10 записей.
Метод removeAllSummerPeople() должен удалять из словаря всех людей,
родившихся летом

https://qa-help.ru/questions/massiv-dat-v-java
 */
public class SetNMap_Date {
    public static void main(String[] args) throws IOException, ParseException {
        //SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        //Date date = sdf.parse("12.11.18");

        String[] names={"Jack", "Nick", "Anna", "Lisa", "Jenifer", "Kolya", "Sam", "Santuago",
                "Dick", "Jeremy",};
        Date[] dates={new Date(1999-1900, 0, 31),
                new Date(1999-1900, 11, 11),
                new Date(2000-1900, 7, 21),
                new Date(2001-1900, 6, 1),
                new Date(2002-1900, 5, 31),
                new Date(2003-1900, 10, 20),
                new Date(2004-1900, 5, 21),
                new Date(2005-1900, 9, 6),
                new Date(2006-1900, 1, 31),
                new Date(2007-1900, 2, 21)
        };

        HashMap<String, Date> map=new HashMap<String, Date>();

        for (int i=0; i < 10; i++) {
            map.put(names[i], dates[i]);
        }
        for (Map.Entry<String, Date> pair : map.entrySet()) {
            String key=pair.getKey();                      //ключ
            Date value=pair.getValue();                  //значение
            //System.out.println(key + ":" + value);
        }

        for (Map.Entry<String,Date> pair:cleaner(map).entrySet()){
            String key = pair.getKey();
            Date value = pair.getValue();
            SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd");
            System.out.println(key+" : "+ formatForDateNow.format(value));

        }

    }






    public static HashMap<String, Date> cleaner(HashMap<String, Date> map) {

        Iterator<Map.Entry<String, Date>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()) {
            int mounth=iterator.next().getValue().getMonth();
            if ((mounth >= 5) && (mounth <= 7)) {
                iterator.remove();
            }
        }

        return map;
    }







}
