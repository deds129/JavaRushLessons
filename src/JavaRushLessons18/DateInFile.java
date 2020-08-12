package JavaRushLessons18;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
7. Поиск данных внутри файла

Считать с консоли имя файла
Найти в файле информацию, которая относится к заданному id, и вывести ее на экран в виде, в котором она записана в файле.
Программа запускается с одним параметром: id (int)
Закрыть потоки. Не использовать try-with-resources

В файле данные разделены пробелом и хранятся в следующей последовательности:
id productName price quantity

где id - int
productName - название товара, может содержать пробелы, String
price - цена, double
quantity - количество, int

Информация по каждому товару хранится в отдельной строке
 */
public class DateInFile {
    public static void main(String[] args) throws IOException {
        List<String> strings = strSeparator();
        List<Integer> ids = lineParser(strings);
       Map<Integer,String> map = getLineWithId(ids,strings);

        System.out.println("Введите нужный id ");
        BufferedReader idReader = new BufferedReader(new InputStreamReader(System.in));
        String sid = idReader.readLine();
        int id = Integer.parseInt(sid);

        for (Map.Entry<Integer,String> pair : map.entrySet()){
            Integer key = pair.getKey();
            if(key == id){
                System.out.println(map.get(id));
            }else{
                System.out.println("товара с задным id не найдено");
                break;
            }
        }


    }


    //читаем файл и делим на строки
    static List<String> strSeparator() throws FileNotFoundException {
        System.out.println("Введите имя файла ");
        BufferedReader  fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName =null;
        try {
            fileName=fileNameReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        List<String>  lines = new ArrayList<String>();
        try {
            String line = reader.readLine();
            while (line != null){
            lines.add(line);
            line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
      return lines;
    }

    // из каждой строки берем  лист id
    static List<Integer> lineParser(List<String> lines){
        List<Integer> ids =  new ArrayList<Integer>();
        for (String lineInLines : lines) {
            String[] parts = lineInLines.split(" ");
            String lineId = parts[0];
            int id = Integer.parseInt(lineId);
            ids.add(id);
        }
        return ids;
    }
    //каждому id приравниваем строку
    static Map<Integer, String> getLineWithId(List<Integer> ids, List<String> lines){
        Map<Integer,String> map = new HashMap<Integer, String>();

            if(ids.size() == lines.size()){
                for(int i = 0;i<ids.size();i++){
                    map.put(ids.get(i),lines.get(i));
                }
            }else{
                System.out.println("Ошибка! не у всех строк корректный id");
            }

        return map;
    }




}
