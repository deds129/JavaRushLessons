package JavaRushLessons18;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.sql.SQLOutput;

/*
3. Разделение файла

Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки. Не использовать try-with-resources
 */
public class FileDeviding {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите название первого файла");
        FileInputStream firstFile=FileReader();
        System.out.println("Введите название вторго файла");
        FileOutputStream secondFile=FileOuter();
        System.out.println("Введите название третьего файла");
        FileOutputStream thirdFile=FileOuter();

        Separator(firstFile, secondFile, thirdFile);
        //Separator2();
    }

    static FileInputStream FileReader() throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String fileName=reader.readLine();
        FileInputStream fileInputStream=new FileInputStream(fileName);
        return fileInputStream;
    }

    static FileOutputStream FileOuter() throws IOException {
        BufferedReader reader=new BufferedReader((new InputStreamReader(System.in)));
        String fileName=reader.readLine();
        FileOutputStream fileOutputStream=new FileOutputStream(fileName);
        return fileOutputStream;
    }

    static void Separator(FileInputStream one, FileOutputStream two, FileOutputStream three) throws IOException {
while (one.available()>0) {
    if (one.available() % 2 == 0) {
        byte[] filebeg=new byte[one.available() / 2];
        byte[] filefin=new byte[one.available() / 2];
        int count1=one.read(filebeg);
        int count2=one.read(filefin);
        two.write(filebeg, 0, count1);
        three.write(filefin, 0, count2);
    } else {
        byte[] filebeg=new byte[one.available() / 2 + 1];
        byte[] filefin=new byte[one.available() / 2];
        int count1=one.read(filebeg);
        int count2=one.read(filefin);
        two.write(filebeg, 0, count1);
        three.write(filefin, 0, count2);
    }
}
    }
    static void Separator2(FileInputStream one,FileOutputStream two,FileOutputStream three) throws IOException {
        byte[] buffer=new byte[one.available()];

        int count=one.read(buffer);
        if (one.available() > 0) {
            if (one.available() % 2 == 0) {
                byte[] buffer2=new byte[count/2];
                byte[] buffer3=new byte[count/2];
                two.write(buffer2, 0, count / 2);
                three.write(buffer3, count/2, count);

            } else {
                byte[] buffer2=new byte[count / 2];
                byte[] buffer3=new byte[count / 2];
                two.write(buffer, 0, count / 2 + 1);
                three.write(buffer, count/2+1, count);
            }
        }

    }

}

