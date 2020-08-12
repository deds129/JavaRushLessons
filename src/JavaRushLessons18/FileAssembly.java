package JavaRushLessons18;

import java.io.*;
import java.util.ArrayList;
import java.util.TreeSet;

/*
10. Собираем файл

Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
 */
public class FileAssembly {
    public static void main(String[] args) throws IOException {
       TreeSet<String> a = fileInputter();
       fileReader(a);
        //System.out.println(a);
    }

    static TreeSet<String> fileInputter() throws IOException {
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(System.in));
        //Обобщенный класс TreeSet<E> представляет структуру данных в виде дерева,
        // в котором все объекты хранятся в отсортированном виде по возрастанию.
        // TreeSet является наследником класса AbstractSet и реализует интерфейс NavigableSet, а следовательно, и интерфейс SortedSet
        TreeSet<String> fileNames = new TreeSet<String>();
        String fileName;

        //читаем пока не введем exit
        while (!(fileName=fileReader.readLine()).equals("exit")){
            fileNames.add(fileName);
        }
        //возвращаем все введенные названия файлов в arraylist'e
fileReader.close();
        return fileNames;
    }
    static  void fileReader(TreeSet<String> fileNames) throws IOException {
        String firstFileName = fileNames.first();
        FileOutputStream fileOutputStream = new FileOutputStream(firstFileName.substring(0, firstFileName.lastIndexOf('.')), true);
        for (String fileName: fileNames) {
            FileInputStream fileInputStream = new FileInputStream(fileName);

            if(fileInputStream.available()>0){
            byte[]  buffer  =new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            fileOutputStream.write(buffer);
        }
            fileInputStream.close();
        }
        fileOutputStream.close();
    }




}
