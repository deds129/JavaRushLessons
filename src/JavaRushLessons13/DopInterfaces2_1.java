package JavaRushLessons13;

import com.sun.org.apache.xml.internal.resolver.readers.SAXCatalogParser;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
1. Сортировка четных чисел из файла.
Задача:
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
file for test : C:\Users\Chudinov Nikolay\IdeaProjects\JavaRushLessons\numlist.txt
 Требования:
Программа должна считывать данные с консоли.
Программа должна создавать FileInputStream для введенной с консоли строки.
Программа должна выводить данные на экран.
Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
Программа должна закрывать поток чтения из файла(FileInputStream).
!!!!спизжена часть кода!!!!
переделать!!
 */
public class DopInterfaces2_1 {
    public static void main(String[] args) throws IOException {
        reader();
    }


    public static void reader() throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> intArr=new ArrayList<>();
        System.out.println("Введите название файла в  формате \"<name>.txt\"");
        Scanner sc=new Scanner(new File(reader.readLine()));
        int i=0;
        try {
            //не стал делать отдельный метод для чтения
            //решение через
            while (sc.hasNext()) {
                i=Integer.parseInt(sc.nextLine());
                if (i % 2 == 0) {
                    intArr.add(i);
                }
            }
            int q=0;
            for (int j=0; j < intArr.size(); j++) {
                for (int k=0; k < intArr.size(); k++) {
                    if (intArr.get(j) < intArr.get(k)) {
                        q=intArr.get(k);
                        intArr.set(k, intArr.get(j));
                        intArr.set(j, q);

                    }
                }
            }
for(Integer num:intArr){
    System.out.println(num);
}
reader.close();
sc.close();

        } catch (IOException e) {
            System.out.println("Файл не найден!!!");
        }


    }
}
