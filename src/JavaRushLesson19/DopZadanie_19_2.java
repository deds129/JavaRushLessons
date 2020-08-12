package JavaRushLesson19;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/*
2. Самый богатый

В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
 */
public class DopZadanie_19_2 {
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
            double max = Double.MIN_VALUE;
            for (Map.Entry<String,Double> pair : map.entrySet()) {
                if (pair.getValue()>=max){
                    max = pair.getValue();
                }

            }

            for (Map.Entry<String,Double> pair : map.entrySet()) {
                if(pair.getValue().equals(max)){
                    System.out.println(pair.getKey());
                }

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}