package JavaRushLessons8;

import java.util.HashMap;
import java.util.Map;

/*
3. Одинаковые имя и фамилия

Создать словарь (Map<String, String>) занести в него десять записей
по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
==
Программа не должна выводить текст на экран.
Программа не должна считывать значения с клавиатуры.
Метод createMap() должен создавать и возвращать словарь
Map с типом элементов String, String состоящих из 10 записей
по принципу «Фамилия» - «Имя».

Метод getCountTheSameFirstName() должен возвращать число
 людей у которых совпадает имя.

Метод getCountTheSameLastName() должен
возвращать число людей у которых совпадает фамилия.
 */
public class SetAndMap2 {
    public static void main(String[] args) {
        Map<String,String> person = new HashMap<String, String>();

// почему не работает!!!?       String [] sernames ={"Чудинов","Петров","Самаев","Кашапов"};
//        String [] names ={"Николай","Игорь","Рома","Влад","Георгий","Исмагил",
//                "Лило","Хуеплет","Ринат","Кипар","Дамир",",Бумка"};
//
//        for (int i = 0;i<10;i++){
//            int nm = (int) Math.random() * 10;
//            int snm = (int) Math.random() * 5;
//            person.put(names[snm],sernames[nm]);



        person.put("Николай","Чудинов");
        person.put("Игорь","Петров");
        person.put("Рома","Самаев");
        person.put("Влад","");
        person.put("Георгий","");
        person.put("Исмагил","");
        person.put("Лило","");
        person.put("Хуеплет","");
        person.put("Ринат","");
        person.put("Кипар","Чудинов");
        person.put("Дамир","Петров");
        person.put("Думка","Самаев");
        person.put("Бумка","");














        for (Map.Entry<String,String> pair : person.entrySet()){
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + ":" + value +'\n');
        }

        System.out.println(getCountTheSameLastName(person,"Петров"));


    }

    public static int getCountTheSameLastName(Map<String,String> person,String sername) {
        int countnames = 0;
        for(String a: person.values()){

           if(a.equals(sername)){
               countnames++;
           }
        }
        return countnames;
    }



}
