package JavaRushLessons18;
/*
 /* Исправить ошибки
Исправить функциональность в соответствии с требованиями
Программа должна:
1. переписать все байты одного файла в другой одним куском.
2. закрывать потоки ввода-вывода
Подсказка: 4 ошибки
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FixMistakes {
    public static void main(String[] args) throws IOException {
        //поток чтения чтения из файла
        FileInputStream inputStream = new FileInputStream("1.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("2.txt");

        if (inputStream.available() > 0) { //если есть доступные байты
            //читаем весь файл одним куском

            //массив равен доступному количеству байт? int read(byte[] buffer):
            // считывает байты из потока в массив buffer. После чтения возвращает число считанных байтов.
            // Если ни одного байта не было считано, то возвращается число -1
            byte[] buffer = new byte[inputStream.available()];

            int count = inputStream.read(buffer);//количество  реально прочитанных байт
            outputStream.write(buffer, 0, count);
        }


        inputStream.close();
        outputStream.close();
    }
}
