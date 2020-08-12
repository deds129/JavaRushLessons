package JavaRushLessons18;

import java.io.*;
import java.util.*;

/*
6. Встречаемость символов

Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1] частота1
[символ2] частота2
Закрыть потоки. Не использовать try-with-resources
 */
public class sumbFrequency {
    public static void main(String[] args) throws IOException {

        FileInputStream a = FileReader();
        Map<Character,Double> map =   Createor(listSort(a));
        for (Map.Entry<Character,Double> pair: map.entrySet()) {
            Character key = pair.getKey();
            Double value = pair.getValue();
            System.out.println(key + ":" + value);
        }
        System.out.close();


        }
        //Читаем файл
    static FileInputStream FileReader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        reader.close();
        return fileInputStream;

    }
    //добавляем в лист каэдый байт + сортируем его
    static List<Integer> listSort(FileInputStream fileInputStream) throws IOException {
        List<Integer> byteList = new ArrayList<Integer>();

        while (fileInputStream.available()>0){
            int data = fileInputStream.read();
            byteList.add(data);
        }
        Collections.sort(byteList);
        fileInputStream.close();
        return byteList;

    }

    //map
    static  Map<Character,Double> Createor(List<Integer> bytes) {
        double listLength = bytes.size();
        //заполняем map char' aми
        Map<Character, Double> map=new HashMap<Character, Double>();

        List<Character> characters = new ArrayList<Character>();
        //map.put(ch,(value == null)? 1:value +1));

        for (Integer a : bytes){
            Character ch = (char)Integer.parseInt(String.valueOf(a));
            // characters.add(ch);
            if (map.keySet().contains(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch, (double) 1);
            }
        }
        for (Map.Entry<Character,Double> pair: map.entrySet()) {
             pair.setValue(pair.getValue() /listLength);
        }
        return map;
    }

}


