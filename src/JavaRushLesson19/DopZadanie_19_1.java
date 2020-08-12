package JavaRushLesson19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
1. Считаем зарплаты

В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени.
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
 */
public class DopZadanie_19_1 {
    public static void main(String[] args)
    {
        try (BufferedReader br=new BufferedReader(new FileReader("1.txt"))) {
        String str;

            HashMap<String,Double> map = new HashMap<>();

        while ((str=br.readLine())!=null){ //читаем построчно
        String[] strSplit = str.split(" ");
        double num =  Double.parseDouble(strSplit[1]);
if (map.containsKey(strSplit[0])){
    map.replace(strSplit[0],map.get(strSplit[0])+num);
}else {
    map.put(strSplit[0],num);
}
        }
            Iterator<Map.Entry<String,Double>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Double> pair = iterator.next();
            String key = pair.getKey();
            Double value = pair.getValue();
            System.out.println(key+ ":"+ value);
        }




        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
