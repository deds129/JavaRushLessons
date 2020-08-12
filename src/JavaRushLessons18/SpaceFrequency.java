package JavaRushLessons18;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/*
2. Пробелы

В метод main первым параметром приходит имя файла.
Вывести на экран частоту встречания пробела. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
 */
public class SpaceFrequency {
    public static void main(String[] args) throws IOException {
FileInputStream fileInputStream = FileReader();
      Frequency(fileInputStream);


    }
    static FileInputStream FileReader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        return fileInputStream;
    }
    static void Frequency(FileInputStream fileInputStream) throws IOException {
        int spaces=0;
        int symbolSumm = 0;
        double frequency = 0;
        while (fileInputStream.available()>0){
            int data = fileInputStream.read();
            symbolSumm++;
            if (data == 32 ){
                spaces++;
            }
        }
try {

    frequency=((double) spaces) / symbolSumm;
    if(frequency != 0){
    System.out.printf("%.3f %n", frequency);}
    else throw  new ArithmeticException();
}catch (ArithmeticException e){
    System.out.println("в тексте нет пробелов");
}


    }

}
