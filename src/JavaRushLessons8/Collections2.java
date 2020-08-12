package JavaRushLessons8;

import java.util.HashMap;
import java.util.Map;

/*
      2. HashMap из 10 пар

Создать коллекцию HashMap<String, String>,
занести туда 10 пар строк: арбуз – ягода, банан – трава,
вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст,
жень-шень – корень, земляника – ягода, ирис – цветок,
 картофель – клубень.
Вывести содержимое коллекции на экран,
каждый элемент с новой строки.
       */
public class Collections2 {
    public static void main(String[] args) {
        Map<String,String> maps = new HashMap<String, String>();
        maps.put("арбуз","ягода");//( ключ наполнение)
        maps.put("банан","трава");
        maps.put("вишня","ягода");
        maps.put("грушка","фрукт");
        maps.put("дыня","овощ");
        maps.put("ежевика","хуевика");
        maps.put("жень-шень","корень");
        for (Map.Entry<String,String>map : maps.entrySet())
        {
            String key = map.getKey();                      //ключ
            String value = map.getValue();                  //значение
            System.out.println(key + ":" + value);
        }





    }
}
