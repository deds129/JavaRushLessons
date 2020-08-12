package JavaRushLessons13;

import java.io.*;
import java.util.ArrayList;

/*
3. Чтение файла

1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы.
Закрыть поток чтения с файла и поток ввода с клавиатуры.

C:\Users\Chudinov Nikolay\Desktop\text.txt

 */
public class DopInterfaces2 {
    public static void main(String[] args) throws IOException {
fileReader(nameReader());
    }
    public static String nameReader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите название файла в  формате \"<name>.txt\"");
        String filename =reader.readLine();
        return filename;
    }
    public static void fileReader(String filename)  {
        try {
            InputStream inputStream = new FileInputStream(filename);
            ArrayList<Character> text = new ArrayList<Character>();
            while (inputStream.available()>0){
                int data = inputStream.read();
                text.add((char) data);
            }
            StringBuilder builder = new StringBuilder(text.size());
            for (Character a:
                 text) {
                builder.append(a);
            }

            String text1 = builder.toString();

            System.out.println( text1);
            inputStream.close();
        } catch (IOException e) {
            System.out.println("Файла с таким имененм не найдено!");
        }
    }


}
