package JavaRushLesson19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
1. Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
 */
public class Chet_Bytes
{
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("1.txt");
        FileWriter writer = new FileWriter("2.txt");
int c=0;
while (reader.ready()){
    int data= reader.read();
    c++;
    if((c%2)==0){
        writer.write(data);
    }
}

reader.close();
writer.close();
    }
}
