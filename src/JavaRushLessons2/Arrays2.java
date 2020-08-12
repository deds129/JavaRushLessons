package JavaRushLessons2;
/*

1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк,
 индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
 Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays2 {
    public static void main(String[] args) throws IOException {
        String str[]=new String[10];
        int num[]=new int[10];
        if (str.length == num.length) {
            BufferedReader reader=new BufferedReader((new InputStreamReader(System.in)));
            for (int i=0; i < str.length; i++) {
                str[i]=reader.readLine();
                num[i]=str[i].length(); //метод .length() определение длины строки
                System.out.println(num[i]);
            }
        } else {
            System.out.println("Ошибка! Размер массивов должен быть одинаковым!");

        }

    }


}

