package JavaRushLessons18;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/*
4. Реверс файла

Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
 */
public class FileReverse {
    public static void main(String[] args) throws IOException {
        System.out.println("ВВедите название первого файла");
    FileInputStream file= FileReader();
        System.out.println("Введите название второго файла");
    FileOutputStream file2 = FileOutputter();

    byteChanger(file,file2);

    file.close();
    file2.close();
    System.out.close();
    }
    static FileInputStream FileReader() throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String fileName=reader.readLine();
        FileInputStream fileInputStream=new FileInputStream(fileName);
        return fileInputStream;
    }
    static FileOutputStream FileOutputter() throws IOException {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        String fileName = reader.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream((fileName));
        return  fileOutputStream;
    }
static void byteChanger(FileInputStream firstFile, FileOutputStream secondFile) throws IOException {
       byte[] buffer = new byte[firstFile.available()];
    //List<Integer>  first = new ArrayList<Integer>();
        if(firstFile.available()>0){
            int count = firstFile.read(buffer);

            if(firstFile.available() == 0 ){
                byte[] buffer2 = new byte[count]; // firstFile.available() обнуляестя можно было buffer.length
                int j =0;
                for(int i = buffer.length-1; i>=0;i--){
                    buffer2[j]=buffer[i];
                    j++;
                }
                secondFile.write(buffer2,0,count);
            }
        }
}
}

