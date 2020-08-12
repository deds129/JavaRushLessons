package JavaRushLessons15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
1. Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
2. В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines.

Требования:
Константа FILE_NAME не должна быть пустой.
В статическом блоке все строки из файла с именем FILE_NAME должны быть добавлены по-отдельности в список lines.
Поле FILE_NAME НЕ должно быть final.
Класс Solution должен содержать список lines.
 */
public class FileInStaticBlack {
    public static List<String> lines = new ArrayList<String>();
    static {
        int s;
        try {
            FileInputStream inputStream = new FileInputStream(Statics.FILE_NAME);
            String str;
            do{
                str = "";
                s = inputStream.read();
                while (s != 13 && s != 10 && s != -1) {
                    str = str.concat(String.valueOf((char) s));
                    s = inputStream.read();
                }
                if(str != "") lines.add(str);

            }while (s != -1);

        }catch (FileNotFoundException e){
            System.out.println("Файл не найден!");
        }
        catch (IOException e){
        }

    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
