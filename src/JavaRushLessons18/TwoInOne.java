package JavaRushLessons18;

import java.io.*;

/*
3. Два в одном

Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
 */
public class TwoInOne {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите файл для записи");
        String file1 = reader.readLine();
        System.out.println("Введите файлы для чтения");
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        //поток записи в файл
        FileOutputStream fileOutputStream = new FileOutputStream(file1);

        //потоки чтения файлов
        FileInputStream fileInputStream2 = new FileInputStream(file2);
        FileInputStream fileInputStream3 = new FileInputStream(file3);



        if (fileInputStream2.available()>0){
            byte[] buffer2 = new byte[fileInputStream2.available()];
            int count = fileInputStream2.read(buffer2);
            fileOutputStream.write(buffer2,0,count);
        }
        fileInputStream2.close();
        if (fileInputStream3.available()>0){
            byte[] buffer3 = new byte[fileInputStream3.available()];
            int count = fileInputStream3.read(buffer3);
            fileOutputStream.write(buffer3,0,count);
        }

        fileInputStream3.close();
        fileOutputStream.close();


    }



}
