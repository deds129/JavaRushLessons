package JavaRushLessons18;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
/*
6Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете).

Пример:
','=44, 's'=115, 't'=116.

Вывести на консоль отсортированный результат:
[символ1] частота1
[символ2] частота2
Закрыть потоки.

Пример вывода:
, 19
- 7
f 361
Требования:
1. Считывать с консоли ничего не нужно.
2. Создай поток для чтения из файла, который приходит первым параметром в main.
3. В файле необходимо посчитать частоту встречания каждого символа и вывести результат.
4. Выведенный в консоль результат должен быть отсортирован по возрастанию кода ASCII.
5. Поток для чтения из файла должен быть закрыт.
 */
public class sumbFrequency_2git {
    public static void main(String[] args) throws IOException {


        FileInputStream inputStream = new FileInputStream("1.txt");
        Map<Byte, Integer> map = new TreeMap<Byte, Integer>();

        while(inputStream.available() > 0) {
            byte data = (byte) inputStream.read();

            if(map.containsKey(data)) {
                map.put(data, map.get(data) + 1);
            } else {
                map.put(data, 1);
            }
}

        for (Map.Entry<Byte, Integer> pair : map.entrySet()) {
            System.out.println((char)(int)pair.getKey() + " " + pair.getValue());
        }

        inputStream.close();
    }
}
